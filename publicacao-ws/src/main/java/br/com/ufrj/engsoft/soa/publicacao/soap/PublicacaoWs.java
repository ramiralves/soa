package br.com.ufrj.engsoft.soa.publicacao.soap;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ufrj.engsoft.soa.publicacao.exception.ParametroException;
import br.com.ufrj.engsoft.soa.publicacao.service.PublicacaoService;
import br.com.ufrj.engsoft.soa.publicacao.vo.PublicacaoVO;

@Service
@WebService(name = "PublicacaoWS")
public class PublicacaoWs {
	
	@Autowired
	private PublicacaoService publicacaoService;
	
	
	@WebMethod
    public @WebResult(name = "publicacoes") PublicacaoResponse obterPublicacoesContemTitulo(@WebParam(name = "titulo") String titulo)throws ParametroException {
		
		if(StringUtils.isEmpty(titulo)) {
			throw new ParametroException("Valor do Titulo da Publicação Inválido!");
		}

		PublicacaoResponse response = new PublicacaoResponse();
		
		List<PublicacaoVO> publicacoes = publicacaoService.findByTitutlo(titulo);
		
		response.setPublicacoes(publicacoes);
		
		return response;
	}


}

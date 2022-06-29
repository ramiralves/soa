package br.com.ufrj.engsoft.soa.publicacao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ufrj.engsoft.soa.publicacao.repository.PublicacaoRepository;
import br.com.ufrj.engsoft.soa.publicacao.vo.PublicacaoVO;

@Service
public class PublicacaoService {
	
	@Autowired
	private PublicacaoRepository publicacaoRepository;
	
	public List<PublicacaoVO> findByTitutlo(String titulo){
		
		List<PublicacaoVO> publicacoes = publicacaoRepository.findByTituloIgnoreCaseContaining(titulo);	
		return publicacoes;
		
	}

}

package br.com.ufrj.engsoft.soa.publicacao.clientws;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import br.com.ufrj.engsoft.soa.publicacao.clientws.stubs.ParametroException_Exception;
import br.com.ufrj.engsoft.soa.publicacao.clientws.stubs.Publicacao;
import br.com.ufrj.engsoft.soa.publicacao.clientws.stubs.PublicacaoResponse;
import br.com.ufrj.engsoft.soa.publicacao.clientws.stubs.PublicacaoWS;
import br.com.ufrj.engsoft.soa.publicacao.clientws.stubs.PublicacaoWsService;

class PublicacaoSoapClientTest {

	@Test
	void obterPublicacoesContemTitulo() throws ParametroException_Exception {
		PublicacaoWsService service = new PublicacaoWsService();
		PublicacaoWS endpoint = service.getPublicacaoWSPort();
		PublicacaoResponse response = endpoint.obterPublicacoesContemTitulo("titulo");
		List<Publicacao> publicacoes = response.getPublicacoes();
		assertEquals(publicacoes.size(), 5);
		
	}

}

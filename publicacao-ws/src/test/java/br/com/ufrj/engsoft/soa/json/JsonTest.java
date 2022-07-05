package br.com.ufrj.engsoft.soa.json;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.google.gson.Gson;

import br.com.ufrj.engsoft.soa.publicacao.vo.AutorVO;
import br.com.ufrj.engsoft.soa.publicacao.vo.PublicacaoVO;

public class JsonTest {

	@Test
	public void generateJson() {
		
		List<PublicacaoVO> publicacoes = new ArrayList<PublicacaoVO>();
								
		PublicacaoVO vo1 = new PublicacaoVO();		
		vo1.setId(1);		
		vo1.setAnoPublicao(2015);
		vo1.setPaginaInicial(0);
		vo1.setPaginaFinal(0);
		vo1.setTitulo("A Cloud-based Architecture for the Internet of Things Targeting Industrial Engine Remote Monitoring.");
		vo1.getAutores().add(new AutorVO("SILVA, A. F."));
		vo1.getAutores().add(new AutorVO("AZEVEDO, L. G."));
		vo1.getAutores().add(new AutorVO("OHTA, R. L."));
		vo1.getAutores().add(new AutorVO("BINOTTO, A. P. D."));
		vo1.getAutores().add(new AutorVO("SANTOS, M. N."));
		vo1.getAutores().add(new AutorVO("SEGURA, V. C. V. B."));
		vo1.getAutores().add(new AutorVO("GANDOUR, F. L."));

		PublicacaoVO vo2 = new PublicacaoVO();		
		vo2.setId(2);
		vo2.setAnoPublicao(2015);
		vo2.setPaginaInicial(1398);
		vo2.setPaginaFinal(1404);
		vo2.setTitulo("ResearchOps: The case for DevOps in scientific applications.");
		vo2.getAutores().add(new AutorVO("DE BAYSER, MAXIMILIEN"));
		vo2.getAutores().add(new AutorVO("AZEVEDO, LEONARDO G."));
		vo2.getAutores().add(new AutorVO("CERQUEIRA, RENATO"));
		
		publicacoes.add(vo1);
		publicacoes.add(vo2);
			
		Gson gson = new Gson();
		 
		System.out.println(gson.toJson(publicacoes));		
		
	}
	
}

package br.com.ufrj.engsoft.soa.restful.autor.repository;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.ufrj.engsoft.soa.restful.autor.model.dto.Autor;
import br.com.ufrj.engsoft.soa.restful.autor.model.dto.Cidade;
import br.com.ufrj.engsoft.soa.restful.autor.model.dto.Endereco;

@SpringBootTest
public class AutorRepositoryTest {

	@Autowired
	AutorRepository autorRepository;
	
	@Test
	public void contextLoads() throws Exception {
		Autor autor = autorRepository.findByUsername("RAMIRALVES");
		 List<Endereco> enderecos = autor.getEndereco();
		for (Endereco endereco : enderecos) {
			System.out.println(endereco);
			Cidade cidade = endereco.getCidade();
			System.out.println(cidade);
		}
	}	
	
}

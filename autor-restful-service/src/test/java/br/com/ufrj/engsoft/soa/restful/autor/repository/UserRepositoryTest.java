package br.com.ufrj.engsoft.soa.restful.autor.repository;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.ufrj.engsoft.soa.restful.autor.security.dto.AppUser;

@SpringBootTest
public class UserRepositoryTest {

	@Autowired
	UserRepository userRepository;
	
	@Test
	public void contextLoads() throws Exception {
		List<AppUser> findAll = userRepository.findAll();
		System.out.println(findAll);
	}	
	
}

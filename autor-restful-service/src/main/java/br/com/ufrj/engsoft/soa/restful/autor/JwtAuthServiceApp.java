package br.com.ufrj.engsoft.soa.restful.autor;

import java.util.ArrayList;
import java.util.Arrays;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

import br.com.ufrj.engsoft.soa.restful.autor.security.dto.AppUser;
import br.com.ufrj.engsoft.soa.restful.autor.security.dto.AppUserRole;
import br.com.ufrj.engsoft.soa.restful.autor.service.UserService;
import lombok.RequiredArgsConstructor;

@SpringBootApplication
@RequiredArgsConstructor
@EnableAutoConfiguration
@ComponentScan("br.com.ufrj.engsoft.soa.restful.autor")
@EnableJpaRepositories("br.com.ufrj.engsoft.soa.restful.autor")
@EntityScan(basePackages = {"br.com.ufrj.engsoft.soa.restful.autor"}) 
public class JwtAuthServiceApp implements CommandLineRunner {

	@Autowired
	private UserService userService;


	public static void main(String[] args) {
		SpringApplication.run(JwtAuthServiceApp.class, args);
	}

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

	@Override
	public void run(String... params) throws Exception {
		
		AppUser user = new AppUser(); 
		
		user.setAppUserRoles(new
		ArrayList<AppUserRole>(Arrays.asList(AppUserRole.ROLE_ADMIN)));
		user.setUsername("admin"); user.setPassword("admin"); //usuario autenticação
		userService.signup(user);
					
	}
 
}

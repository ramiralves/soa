package br.com.ufrj.engsoft.soa.restful.autor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

import br.com.ufrj.engsoft.soa.restful.autor.model.dto.Autor;
import br.com.ufrj.engsoft.soa.restful.autor.populate.AutorPopulateUtil;
import br.com.ufrj.engsoft.soa.restful.autor.repository.AutorRepository;
import br.com.ufrj.engsoft.soa.restful.autor.security.dto.AppUser;
import br.com.ufrj.engsoft.soa.restful.autor.security.dto.AppUserRole;
import br.com.ufrj.engsoft.soa.restful.autor.service.UserService;
import lombok.RequiredArgsConstructor;

@SpringBootApplication
@RequiredArgsConstructor
@EnableAutoConfiguration
@ComponentScan("br.com.ufrj.engsoft.soa.restful.autor")
@EnableJpaRepositories("br.com.ufrj.engsoft.soa.restful.autor")
public class JwtAuthServiceApp implements CommandLineRunner {

  @Autowired
  private UserService userService;
  
  @Autowired
  private AutorRepository autorRepository;  

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
    
    user.setAppUserRoles(new ArrayList<AppUserRole>(Arrays.asList(AppUserRole.ROLE_ADMIN)));
    user.setUsername("admin");
    user.setPassword("admin");         
    //usuario autenticação
    userService.signup(user);
    
    List<Autor> autores = AutorPopulateUtil.getInstance();
    
    for (Autor autor : autores) {
    	autorRepository.save(autor);
    	/*
    	Endereco endereco = autor.getEndereco();
    	endereco.setAutor(autor);
    	enderecoRepository.save(endereco);
    	paisRepository.save(endereco.getPais());
    	estadoRepository.save(endereco.getEstado());
    	cidadeRepository.save(endereco.getCidade());
    	*/
	}
    			    
  }
  
}

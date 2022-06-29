package br.com.ufrj.engsoft.soa.publicacao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("br.com.ufrj.engsoft.soa.publicacao")
@EnableJpaRepositories("br.com.ufrj.engsoft.soa.publicacao")
public class PublicacaoWsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PublicacaoWsApplication.class, args);
	}

}

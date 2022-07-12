package br.com.ufrj.engsoft.soa.restful.autor.service;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import br.com.ufrj.engsoft.soa.restful.autor.exception.CustomException;
import br.com.ufrj.engsoft.soa.restful.autor.model.dto.Autor;
import br.com.ufrj.engsoft.soa.restful.autor.repository.AutorRepository;
import br.com.ufrj.engsoft.soa.restful.autor.repository.UserRepository;
import br.com.ufrj.engsoft.soa.restful.autor.security.JwtTokenProvider;
import br.com.ufrj.engsoft.soa.restful.autor.security.dto.AppUser;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
	
	@Autowired
	private  MessageSource messageSource;		
	  
  @Autowired
  private  UserRepository userRepository;
  
  @Autowired
  private  AutorRepository autorRepository;

  @Autowired
  private  PasswordEncoder passwordEncoder;
  @Autowired
  private  JwtTokenProvider jwtTokenProvider;
  @Autowired
  private  AuthenticationManager authenticationManager;

  public String signin(String username, String password) {
	  final String mensagem = messageSource.getMessage("email.senha.invalido", null, Locale.ENGLISH);
    try {
      authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
      return jwtTokenProvider.createToken(username, userRepository.findByUsername(username).getAppUserRoles());
    } catch (AuthenticationException e) {
      throw new CustomException(mensagem, HttpStatus.UNPROCESSABLE_ENTITY);
    }
  }

  public String signup(AppUser appUser) {
	  final String mensagem = messageSource.getMessage("usuario.existente", null, Locale.ENGLISH);
	  
	  
    if (!userRepository.existsByUsername(appUser.getUsername())) {
      appUser.setPassword(passwordEncoder.encode(appUser.getPassword()));
      userRepository.save(appUser);
      return jwtTokenProvider.createToken(appUser.getUsername(), appUser.getAppUserRoles());
    } else {
      throw new CustomException(mensagem, HttpStatus.UNPROCESSABLE_ENTITY);
    }
  }
  
  public Autor search(String nome) {	  
	  final String mensagem = messageSource.getMessage("usuario.nao.encontrado", null, Locale.ENGLISH);
	  Autor autor = autorRepository.findByNome(nome);	  
	  if (autor == null) {
		  throw new CustomException(mensagem, HttpStatus.NOT_FOUND);
	  }	  
	  return autor;
  }
  
}

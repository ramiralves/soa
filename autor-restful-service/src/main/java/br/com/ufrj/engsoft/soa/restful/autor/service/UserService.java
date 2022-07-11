package br.com.ufrj.engsoft.soa.restful.autor.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
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
    try {
      authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
      return jwtTokenProvider.createToken(username, userRepository.findByUsername(username).getAppUserRoles());
    } catch (AuthenticationException e) {
      throw new CustomException("Invalid username/password supplied", HttpStatus.UNPROCESSABLE_ENTITY);
    }
  }

  public String signup(AppUser appUser) {
    if (!userRepository.existsByUsername(appUser.getUsername())) {
      appUser.setPassword(passwordEncoder.encode(appUser.getPassword()));
      userRepository.save(appUser);
      return jwtTokenProvider.createToken(appUser.getUsername(), appUser.getAppUserRoles());
    } else {
      throw new CustomException("Username is already in use", HttpStatus.UNPROCESSABLE_ENTITY);
    }
  }

  public void insert(AppUser appUser) {
	    if (!userRepository.existsByUsername(appUser.getUsername())) {
	    	userRepository.save(appUser);
	    } else {
	      throw new CustomException("Username is already in use", HttpStatus.UNPROCESSABLE_ENTITY);
	    }
   }  

  public Autor search(String username) {
	  Autor autor = autorRepository.findByNome(username);
	  if (autor == null) {
		  throw new CustomException("The user doesn't exist", HttpStatus.NOT_FOUND);
	  }
	  return autor;
  }

  public AppUser whoami(HttpServletRequest req) {
    return userRepository.findByUsername(jwtTokenProvider.getUsername(jwtTokenProvider.resolveToken(req)));
  }

  public String refresh(String username) {
    return jwtTokenProvider.createToken(username, userRepository.findByUsername(username).getAppUserRoles());
  }

}

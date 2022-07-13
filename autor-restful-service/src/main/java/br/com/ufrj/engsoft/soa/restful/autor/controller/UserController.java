package br.com.ufrj.engsoft.soa.restful.autor.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.ufrj.engsoft.soa.restful.autor.model.dto.Autor;
import br.com.ufrj.engsoft.soa.restful.autor.service.UserService;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/autor")
@RequiredArgsConstructor
@SecurityRequirement(name = "admin")
public class UserController {
	
  @Autowired	
  private UserService userService;
  
  @Autowired
  private ModelMapper modelMapper;


  @ApiResponse(responseCode = "200", description = "Autenticado efetuada com sucesso! Segue token com duracao de 1hr para acesso.")
  @ApiResponse(responseCode = "400", description = "Requisição Inválida.", content = @Content)
  @ApiResponse(responseCode = "422", description = "Usuário e/ou Senha inválidos.", content = @Content)
  @ApiResponse(responseCode = "500", description = "Ocorreu algum erro de sistrema.", content = @Content)
  @PostMapping("/signin")
  public String login(//
    @RequestParam String username, //
    @RequestParam String password) {
    return userService.signin(username, password);
  }

  @ApiResponse(responseCode = "200", description = "Sucesso! Os dados do usuário serão retornados.")
  @ApiResponse(responseCode = "400", description = "Requisição Inválida.", content = @Content)
  @ApiResponse(responseCode = "403", description = "Acesso negado, por favor informe ao portador o token de acesso (Bearer Token).", content = @Content)  
  @ApiResponse(responseCode = "500", description = "Ocorreu algum erro de sistrema.", content = @Content)  
  @GetMapping(value = "/{username}")
  @PreAuthorize("hasRole('ROLE_ADMIN')")
  public ResponseEntity<Autor> search(@PathVariable String username) {
	  Autor autor = modelMapper.map(userService.search(username), Autor.class);
	    if (autor == null) {
	        return ResponseEntity.notFound().build();
	    } else {
	        return ResponseEntity.ok(autor);
	    }
  }

}

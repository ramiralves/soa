package br.com.ufrj.engsoft.soa.restful.autor.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
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

  @PostMapping("/signin")
  public String login(//
    @RequestParam String username, //
    @RequestParam String password) {
    return userService.signin(username, password);
  }
  
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

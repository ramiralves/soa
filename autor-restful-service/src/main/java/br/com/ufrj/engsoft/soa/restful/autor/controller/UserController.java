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
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Authorization;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/autor")
@Api(tags = "autor")
@RequiredArgsConstructor
public class UserController {
	
  @Autowired	
  private UserService userService;
  
  @Autowired
  private ModelMapper modelMapper;

  @PostMapping("/signin")
  @ApiOperation(value = "${usercontroller.signin}")
  @ApiResponses(value = {//
      @ApiResponse(code = 400, message = "{usercontroller.erro400}"), //
      @ApiResponse(code = 422, message = "{usercontroller.erro404}")})
  public String login(//
      @ApiParam("${usercontroller.username}") @RequestParam String username, //
      @ApiParam("${usercontroller.password}") @RequestParam String password) {
    return userService.signin(username, password);
  }
  
  @GetMapping(value = "/{username}")
  @PreAuthorize("hasRole('ROLE_ADMIN')")
  @ApiOperation(value = "${usercontroller.search}", response = Autor.class, authorizations = { @Authorization(value="apiKey") })
  @ApiResponses(value = {//
	  @ApiResponse(code = 400, message = "{usercontroller.erro400}"), //
	  @ApiResponse(code = 403, message = "{usercontroller.erro403}"), //
	  @ApiResponse(code = 404, message = "{usercontroller.erro404}"), //
	  @ApiResponse(code = 500, message = "{usercontroller.erro500}")}
  )  
  public ResponseEntity<Autor> search(@ApiParam("${usercontroller.username}") @PathVariable String username) {
	  Autor autor = modelMapper.map(userService.search(username), Autor.class);
	    if (autor == null) {
	        return ResponseEntity.notFound().build();
	    } else {
	        return ResponseEntity.ok(autor);
	    }
  }

}

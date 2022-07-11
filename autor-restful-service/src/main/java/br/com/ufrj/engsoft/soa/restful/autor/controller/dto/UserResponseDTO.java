package br.com.ufrj.engsoft.soa.restful.autor.controller.dto;

import java.util.List;

import br.com.ufrj.engsoft.soa.restful.autor.security.dto.AppUserRole;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


public class UserResponseDTO {

  @ApiModelProperty(position = 0)
  private Integer id;
  @ApiModelProperty(position = 1)
  private String username;
  @ApiModelProperty(position = 2)
  private String email;
  @ApiModelProperty(position = 3)
  List<AppUserRole> appUserRoles;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<AppUserRole> getAppUserRoles() {
		return appUserRoles;
	}
	public void setAppUserRoles(List<AppUserRole> appUserRoles) {
		this.appUserRoles = appUserRoles;
	}
  
  

}

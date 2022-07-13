package br.com.ufrj.engsoft.soa.restful.autor.controller.dto;

import java.util.List;

import br.com.ufrj.engsoft.soa.restful.autor.security.dto.AppUserRole;
import lombok.NoArgsConstructor;


@NoArgsConstructor
public class UserDataDTO {
   
  private String username;  
  private String email;  
  private String password;  
  List<AppUserRole> appUserRoles;

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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<AppUserRole> getAppUserRoles() {
		return appUserRoles;
	}
	public void setAppUserRoles(List<AppUserRole> appUserRoles) {
		this.appUserRoles = appUserRoles;
	}

  
  
}

package br.com.ufrj.engsoft.soa.restful.autor.security.dto;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import lombok.NoArgsConstructor;

@Entity
@Table(name = "user")
@NoArgsConstructor
public class AppUser {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Size(min = 4, max = 255, message = "Minimum username length: 4 characters")
  @Column(unique = true, nullable = false)
  private String username;
  
  @Size(min = 8, message = "Minimum password length: 8 characters")
  private String password;
  
  @ElementCollection(fetch = FetchType.EAGER)
  private List<AppUserRole> appUserRoles;  

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
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

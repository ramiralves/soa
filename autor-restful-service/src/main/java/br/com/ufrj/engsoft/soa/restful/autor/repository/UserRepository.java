package br.com.ufrj.engsoft.soa.restful.autor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ufrj.engsoft.soa.restful.autor.security.dto.AppUser;

public interface UserRepository extends JpaRepository<AppUser, Integer> {

  boolean existsByUsername(String username);

  AppUser findByUsername(String username);

}

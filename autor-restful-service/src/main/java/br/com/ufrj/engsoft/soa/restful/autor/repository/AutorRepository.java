package br.com.ufrj.engsoft.soa.restful.autor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ufrj.engsoft.soa.restful.autor.model.dto.Autor;

public interface AutorRepository extends JpaRepository<Autor, Integer> {

  boolean existsByUsername(String username);

  Autor findByUsername(String username);

}

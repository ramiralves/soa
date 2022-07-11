package br.com.ufrj.engsoft.soa.restful.autor.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.ufrj.engsoft.soa.restful.autor.model.dto.Autor;

public interface AutorRepository extends CrudRepository <Autor, Integer> {

  boolean existsByUsername(String username);

  Autor findByUsername(String username);
  
  Autor findByNome(String nome);
  
  
}

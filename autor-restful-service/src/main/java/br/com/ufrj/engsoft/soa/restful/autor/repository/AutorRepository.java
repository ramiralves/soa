package br.com.ufrj.engsoft.soa.restful.autor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.ufrj.engsoft.soa.restful.autor.model.dto.Autor;

public interface AutorRepository extends JpaRepository  <Autor, Integer> {

  boolean existsByUsername(String username);

  Autor findByUsername(String username);
  
  @Query("SELECT a, e  FROM Autor a, Endereco e WHERE a.id = e.id  AND a.nome=:nome")
  Autor findByNome(String nome);
  
  
}

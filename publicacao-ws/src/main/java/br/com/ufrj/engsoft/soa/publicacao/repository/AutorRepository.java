package br.com.ufrj.engsoft.soa.publicacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ufrj.engsoft.soa.publicacao.vo.AutorVO;
 
@Repository
public interface AutorRepository extends JpaRepository<AutorVO, Long> {
 
}

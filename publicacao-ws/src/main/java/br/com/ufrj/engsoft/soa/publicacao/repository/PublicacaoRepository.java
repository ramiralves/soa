package br.com.ufrj.engsoft.soa.publicacao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ufrj.engsoft.soa.publicacao.vo.PublicacaoVO;
 
@Repository
public interface PublicacaoRepository extends JpaRepository<PublicacaoVO, Long> { 
	
	public List<PublicacaoVO> findByTituloIgnoreCaseContaining(String titulo);
		
}

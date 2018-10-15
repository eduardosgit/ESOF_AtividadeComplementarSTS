package br.edu.iftm.atividadeComplementar.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import br.edu.iftm.atividadeComplementar.model.domain.Atividade;

public interface AtividadeRepository extends JpaRepository<Atividade, Integer> {
	
	//query: select a from Atividade a where a.nome like %:nome%
	public List<Atividade> findByNomeContaining(@Param("nome") String nome);

}

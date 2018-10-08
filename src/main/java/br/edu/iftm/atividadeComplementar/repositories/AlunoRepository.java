package br.edu.iftm.atividadeComplementar.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.edu.iftm.atividadeComplementar.model.domain.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long>{
	
	//quey (select a from  Aluno where a.nome like %:nome%)
	public List<Aluno> findByNomeContaining(@Param("nome") String nome);

}

package br.edu.iftm.atividadeComplementar.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import br.edu.iftm.atividadeComplementar.model.domain.Atividade;
import br.edu.iftm.atividadeComplementar.repositories.AtividadeRepository;

public class AtividadeService {
	
	@Autowired
	private AtividadeRepository repo;
	
	public Atividade buscar(Integer codigo) {
		Atividade atividade = repo.getOne(codigo);
		return atividade;
	}
	
	public List<Atividade> buscar(String nome) {
		return repo.findByNomeContaining(nome);
	}
	
	public Optional<Atividade> buscarCodigo(Integer codigo) {
		return repo.findById(codigo);
	}
	
	public List<Atividade> buscarTodos() {
		return repo.findAll();
	}
}

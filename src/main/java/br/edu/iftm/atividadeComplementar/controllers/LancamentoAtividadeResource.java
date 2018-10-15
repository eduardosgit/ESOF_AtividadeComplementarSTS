package br.edu.iftm.atividadeComplementar.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.edu.iftm.atividadeComplementar.model.domain.LancamentoAtividade;
import br.edu.iftm.atividadeComplementar.services.LancamentoAtividadeService;

@RestController
@RequestMapping(value = "/lancamentoAtividades")
public class LancamentoAtividadeResource {

	@Autowired
	private LancamentoAtividadeService service;

	@RequestMapping(value = "{codigo}", method = RequestMethod.GET)
	public ResponseEntity<?> findByRa(@PathVariable Long codigo) {
		Optional<LancamentoAtividade> lancamentos = service.buscarCodigo(codigo);
		return ResponseEntity.ok().body(lancamentos);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<?> findAll() {
		List<LancamentoAtividade> lancamentos = service.buscarTodos();
		return ResponseEntity.ok().body(lancamentos);
	}
}

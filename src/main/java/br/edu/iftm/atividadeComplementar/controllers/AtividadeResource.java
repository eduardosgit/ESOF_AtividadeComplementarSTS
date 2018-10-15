package br.edu.iftm.atividadeComplementar.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.edu.iftm.atividadeComplementar.model.domain.Atividade;
import br.edu.iftm.atividadeComplementar.services.AtividadeService;

@RestController
@RequestMapping(value="/atividades")
public class AtividadeResource {
	
	@Autowired
	private AtividadeService service;
	
//	@RequestMapping(method=RequestMethod.GET)
//	public List<Atividade> listar() {
//		Atividade a1 =  new Atividade(1,"Visita Técnica GDG");
//		Atividade a2 = new Atividade(1,"Simpós");
//		return Arrays.asList(a1,a2);
//	}
	
	@RequestMapping(value="{codigo}", method=RequestMethod.GET)
	public ResponseEntity<?> findByCodigo(@PathVariable Integer codigo) {
		Atividade atividade = service.buscar(codigo);
		return ResponseEntity.ok().body(atividade);
	}
	
}

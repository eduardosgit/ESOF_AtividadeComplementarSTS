package br.edu.iftm.atividadeComplementar.repositories;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.edu.iftm.atividadeComplementar.model.domain.Atividade;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AtividadeRepositoryTest {
	
	@Autowired
	private AtividadeRepository repository;
	
	@Test
	public void testaEventoGDG() {
		List<Atividade> a = repository.findByNomeContaining("GDG");
		assertThat(a.size()).isGreaterThan(0);
	}
	
	@Test
	public void testaAtividadeSNCT() {
		List<Atividade> a = repository.findByNomeContaining("SNCT");
		assertThat(a.size()).isEqualTo(0);
	}

	@Test
	public void testarhorasEAD() {
		List<Atividade> a = repository.findByNomeContaining("EAD");
		assertThat(a.size()).isZero();
	}

}

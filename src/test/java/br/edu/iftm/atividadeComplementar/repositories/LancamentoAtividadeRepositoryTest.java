package br.edu.iftm.atividadeComplementar.repositories;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.edu.iftm.atividadeComplementar.model.domain.Aluno;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LancamentoAtividadeRepositoryTest {
	
	@Autowired
	private AlunoRepository repository;
	
	@Test
	public void testaLancamentoAtividade01() {
		List<Aluno> lista = repository.findByNomeContaining("Eduardo");
		assertThat(lista.size()).isGreaterThan(0);
	}
	
	@Test
	public void testaListaLancamentoAtividadeVazia() {
		List<Aluno> lista = repository.findByNomeContaining("Carlos");
		assertThat(lista.size()).isEqualTo(0);
	}
	@Test
	public void testaNomeForadaLista() {
		List<Aluno> lista = repository.findByNomeContaining("João");
		assertThat(lista.size()).isEqualTo(0);
	}

}

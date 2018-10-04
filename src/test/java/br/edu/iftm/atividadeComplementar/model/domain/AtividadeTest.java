package br.edu.iftm.atividadeComplementar.model.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AtividadeTest {
	
	private Atividade atividade;
	
	@Before
	public void init() {
		atividade = new Atividade();
	}
	
	@Test
	public void testaQuantidadeTotalHorasSistemas() {
		//Monitoria - 50% do total
		int percentualMonitoria = 50;
		int quantidadeHorasSistemasParaInternet = 60;
		atividade.setPercentualPorAtividade(percentualMonitoria);
		int quantidadeHoras = atividade.getValorLimiteHorasAtividade(quantidadeHorasSistemasParaInternet);
		Assert.assertEquals(quantidadeHoras, 30);
	}
	
	@Test
	public void testaQuantidadeTotalHorasLicenciatura() {
		//Monitoria - 50% do total
		int percentualMonitoria = 50;
		int quantidadeHorasLicenciatura = 100;
		atividade.setPercentualPorAtividade(percentualMonitoria);
		int quantidadeHoras = atividade.getValorLimiteHorasAtividade(quantidadeHorasLicenciatura);
		Assert.assertEquals(quantidadeHoras, 50);
	}
}

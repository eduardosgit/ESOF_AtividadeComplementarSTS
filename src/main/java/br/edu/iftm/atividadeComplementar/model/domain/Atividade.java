package br.edu.iftm.atividadeComplementar.model.domain;

import java.io.Serializable;

public class Atividade implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer codigo;
	
	private String nome;
	
	private Integer percentualCargaHoraria;
	
	private Integer percentualPorAtividade;
	
	private Integer maximoAtividadesSemestre;

	public Atividade(Integer codigo, String nome, Integer percentualCargaHoraria, Integer percentualPorAtividade,
			Integer maximoAtividadesSemestre) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.percentualCargaHoraria = percentualCargaHoraria;
		this.percentualPorAtividade = percentualPorAtividade;
		this.maximoAtividadesSemestre = maximoAtividadesSemestre;
	}

	public Atividade() {
		super();
	}
	
	public Integer getValorLimiteHorasAtividade(Integer totalHorasComplementares) {
		return totalHorasComplementares * percentualPorAtividade / 100;
	}
	
	public Integer getHorasAproveitadasPorAtividade(Integer totalHorasComplementares) {
		return getValorLimiteHorasAtividade(totalHorasComplementares) * percentualCargaHoraria / 100;
	}
	

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getPercentualCargaHoraria() {
		return percentualCargaHoraria;
	}

	public void setPercentualCargaHoraria(Integer percentualCargaHoraria) {
		this.percentualCargaHoraria = percentualCargaHoraria;
	}

	public Integer getPercentualPorAtividade() {
		return percentualPorAtividade;
	}

	public void setPercentualPorAtividade(Integer percentualPorAtividade) {
		this.percentualPorAtividade = percentualPorAtividade;
	}

	public Integer getMaximoAtividadesSemestre() {
		return maximoAtividadesSemestre;
	}

	public void setMaximoAtividadesSemestre(Integer maximoAtividadesSemestre) {
		this.maximoAtividadesSemestre = maximoAtividadesSemestre;
	}
}

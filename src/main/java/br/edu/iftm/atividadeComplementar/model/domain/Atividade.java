package br.edu.iftm.atividadeComplementar.model.domain;

public class Atividade {
	
	private Integer codigo;
	
	private String nome;
	
	private Integer percentualCargaHoraria;
	
	private Integer percentualPorAtividade;
	
	private Integer maximoAtividadeSemestre;

	public Atividade(Integer codigo, String nome, Integer percentualCargaHoraria, Integer percentualPorAtividade,
			Integer maximoAtividadeSemestre) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.percentualCargaHoraria = percentualCargaHoraria;
		this.percentualPorAtividade = percentualPorAtividade;
		this.maximoAtividadeSemestre = maximoAtividadeSemestre;
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

	public Integer getMaximoAtividadeSemestre() {
		return maximoAtividadeSemestre;
	}

	public void setMaximoAtividadeSemestre(Integer maximoAtividadeSemestre) {
		this.maximoAtividadeSemestre = maximoAtividadeSemestre;
	}
}

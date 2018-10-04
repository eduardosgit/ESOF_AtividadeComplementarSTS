package br.edu.iftm.atividadeComplementar.model.domain;

public class Aluno {
	
	private Integer ra;
	
	private String nome;

	public Aluno(Integer ra, String nome) {
		super();
		this.ra = ra;
		this.nome = nome;
	}

	public Aluno() {
		super();
	}

	public Integer getRa() {
		return ra;
	}

	public void setRa(Integer ra) {
		this.ra = ra;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}

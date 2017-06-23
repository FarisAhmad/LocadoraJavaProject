package br.com.locadora.model;

public class Fita extends Produto{
	
	private String atores;
	private String diretor;
	private double duracao;
	private String genero;
	
	public String getAtores() {
		return atores;
	}

	public void setAtores(String atores) {
		this.atores = atores;
	}

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	public double getDuracao() {
		return duracao;
	}

	public void setDuracao(double duracao) {
		this.duracao = duracao;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Fita(int codigo, String titulo, int ano, double precoPorDia, double multaPorDia, String situacao) {
		super(codigo, titulo, ano, precoPorDia, multaPorDia, situacao);
		
	}
}

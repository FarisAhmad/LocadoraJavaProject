package br.com.locadora.model;

public class Jogo extends Produto{
	private String categoria;

	

	@Override
	public String toString() {
		return "\nJogo [ codigo=" + codigo + ",categoria=" + categoria +", "+" titulo=" + titulo + ", ano=" + ano + ", precoPorDia=" + precoPorDia
				+ ", multaPorDia=" + multaPorDia +", situação="+ situacao+", obervação="+observacao+"]\n";
	}


	public Jogo(int codigo, String titulo, int ano, double precoPorDia, double multaPorDia, boolean situacao,String observacao, String categoria) {
		super(codigo, titulo, ano, precoPorDia, multaPorDia, situacao,observacao);
		this.categoria = categoria;
	}
	
	
	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

}

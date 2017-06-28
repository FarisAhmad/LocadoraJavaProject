package br.com.locadora.model;

public class Produto {
	protected int codigo;
	protected String titulo;
	protected int ano;
	protected double precoPorDia;
	protected double multaPorDia;
	protected boolean situacao;
	protected String observacao;
	
	
	public Produto(int codigo, String titulo, int ano, double precoPorDia, double multaPorDia,boolean situacao,String observacao) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.ano = ano;
		this.precoPorDia = precoPorDia;
		this.multaPorDia = multaPorDia;
		this.situacao = situacao;
		this.observacao = observacao;
	}
	@Override
	public String toString() {
		return "\nProduto [codigo=" + codigo + ", titulo=" + titulo + ", ano=" + ano + ", precoPorDia=" + precoPorDia
				+ ", multaPorDia=" + multaPorDia +", situacao="+ situacao +", observacao="+ observacao + "]\n";
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public double getPrecoPorDia() {
		return precoPorDia;
	}
	public void setPrecoPorDia(double precoPorDia) {
		this.precoPorDia = precoPorDia;
	}
	public double getMultaPorDia() {
		return multaPorDia;
	}
	public void setMultaPorDia(double multaPorDia) {
		this.multaPorDia = multaPorDia;
	}
	public boolean isSituacao() {
		return situacao;
	}
	public void setSituacao(boolean situacao) {
		this.situacao = situacao;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	

}

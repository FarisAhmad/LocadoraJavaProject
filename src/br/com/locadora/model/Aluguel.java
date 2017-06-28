package br.com.locadora.model;

import java.util.Date;

public class Aluguel {
	private Cliente cliente;
	private Produto produto;
	private Date dataInicio;
	private int dataDevolucao;
	
	
	
	public Aluguel(Cliente cliente, Produto produto, Date dataInicio, int dataDevolucao) {
		this.cliente = cliente;
		this.produto = produto;
		this.dataInicio = dataInicio;
		this.dataDevolucao = dataDevolucao;
	}
	
	@Override
	public String toString() {
		return "Aluguel [cliente=" + cliente + ", produto=" + produto + ", dataAluguel=" + dataInicio
				+ ",\n dataDevolucao=" + dataDevolucao + "]";
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	public int getDataDevolucao() {
		return dataDevolucao;
	}
	public void setDataDevolucao(int dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	
	

}

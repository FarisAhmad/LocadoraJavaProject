package br.com.locadora.model;

import java.util.ArrayList;

public class Filial extends Matriz {
	private String inscEstadual;
	public ArrayList<Produto> estoque;

	@Override
	public String toString() {
		return "\nFilial [CGC=" + CGC + ", razaoSocial=" + razaoSocial + ", endereco=" + endereco + ", telefone="
				+ telefone + ", cidade=" + cidade + "]"
				+ "[inscEstadual=" + inscEstadual + "]"+"\nestoque=" + estoque + "]\n";
	}

	public String getInscEstadual() {
		return inscEstadual;
	}

	public ArrayList<Produto> getEstoque() {
		return estoque;
	}

	public void setEstoque(ArrayList<Produto> estoque) {
		this.estoque = estoque;
	}

	public void setInscEstadual(String inscEstadual) {
		this.inscEstadual = inscEstadual;
	}
	

}

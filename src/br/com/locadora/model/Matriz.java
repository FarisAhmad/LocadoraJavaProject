package br.com.locadora.model;

public class Matriz {
	protected final int CGC = 121313 ;//identificador da empresa
	protected String razaoSocial = "Advanced";//Nome
	protected String endereco = "Asa SUl";
	protected String telefone = "1234-4311";
	protected String cidade = "Brasília";
	
	
//	public Matriz(int cgc, String razaoSocial, String endereco, String telefone, String cidade) {
//		CGC = cgc;
//		this.razaoSocial = razaoSocial;
//		this.endereco = endereco;
//		this.telefone = telefone;
//		this.cidade = cidade;
//	}
	public int getCGC() {
		return CGC;
	}
	@Override
	public String toString() {
		return "Matriz [CGC=" + CGC + ", razaoSocial=" + razaoSocial + ", endereco=" + endereco + ", telefone="
				+ telefone + ", cidade=" + cidade + "]";
	}
	
	
	
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	
	
}

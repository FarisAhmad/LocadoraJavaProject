package br.com.locadora.model;

public class Cliente extends Pessoa {
	private int codigo;
	private String cpf;
	private String end;
	private String cidade;
	private String estado;
	private String telefone;
	private double divida;
	
		
	public Cliente(String nome,int codigo, String cpf, String end,
				String cidade, String estado, String telefone, double divida) {
			super(nome);
			this.codigo = codigo;
			this.cpf = cpf;
			this.end = end;
			this.cidade = cidade;
			this.estado = estado;
			this.telefone = telefone;
			this.divida = divida;
		}
	
	@Override
	public String toString() {
		return "\nCliente [codigo=" + codigo + ", nome="+nome+" "+", cpf=" + cpf + ", end=" + end + ", cidade=" + cidade + ", estado="
				+ estado + ", telefone=" + telefone + ", divida=" + divida + "]\n";
	}

	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public double getDivida() {
		return divida;
	}
	public void setDivida(double divida) {
		this.divida = divida;
	}
	
			
}

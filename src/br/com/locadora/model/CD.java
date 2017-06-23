package br.com.locadora.model;

public class CD extends Produto {
	private String gravadora;
	private String cantor;
	private String genero;
	
	public CD(int codigo, String titulo, int ano, double precoPorDia, double multaPorDia, String gravadora,
			String cantor, String genero,String situacao) {
		
		super(codigo, titulo, ano, precoPorDia, multaPorDia,situacao);
		this.gravadora = gravadora;
		this.cantor = cantor;
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "\nCD [codigo=" + codigo + ", titulo=" + titulo + ", ano=" + ano + ", precoPorDia=" + precoPorDia
				+ ", multaPorDia=" + multaPorDia +", situacao="+ situacao+", "+"gravadora=" + gravadora + ", cantor=" + cantor + ", genero=" + genero + "]\n";
	}
	
	public String getGravadora() {
		return gravadora;
	}
	public void setGravadora(String gravadora) {
		this.gravadora = gravadora;
	}
	public String getCantor() {
		return cantor;
	}
	public void setCantor(String cantor) {
		this.cantor = cantor;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
}

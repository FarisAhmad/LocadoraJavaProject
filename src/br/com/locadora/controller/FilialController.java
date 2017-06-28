package br.com.locadora.controller;

import br.com.locadora.model.Filial;

public class FilialController {
	
	Filial filialAN = new Filial();
	Filial filialAS = new Filial();
	Filial filialSP = new Filial();
	
	
	ProdutoController prodController = new ProdutoController();
	
	
	
	
	
	
	//crias minhas filias herdadas da matriz
	public void criaFiliais(){
		filialAN.setRazaoSocial("Advanced Asa Norte");
		filialAN.setEndereco("ASA NORTE");
		filialAN.setCidade("Bras�lia");
		filialAN.setInscEstadual("12");
		filialAN.setTelefone("21231");
		filialAN.setEstoque(prodController.estoqueProdutosAN());//vai l� Na ControllerProd e pega o stoque de produtos dessa filial
		
		filialAS.setRazaoSocial("Advanced Asa Sul");
		filialAS.setEndereco("ASA SUL");
		filialAS.setCidade("Bras�lia");
		filialAS.setInscEstadual("116");
		filialAS.setTelefone("31321");
		
		filialSP.setRazaoSocial("Advanced S�o Paulo");
		filialSP.setEndereco("Morumbi");
		filialSP.setCidade("S�o Paulo");
		filialSP.setInscEstadual("312");
		filialSP.setTelefone("98778");
	}
	
	public Filial retornaFiliais(){
		return filialAN;
	}
}

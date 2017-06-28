package br.com.locadora.controller;

import java.util.ArrayList;

import br.com.locadora.model.CD;
import br.com.locadora.model.Fita;
import br.com.locadora.model.Jogo;
import br.com.locadora.model.Produto;

public class ProdutoController {
	//banco de Dados de todos os produtos da loja
	

Produto cd1 = new CD(1,"SKANK - MTV ao VIVO",2010,10.0,0.6,true,"","MTV","SKANK","MPB");
Produto cd2 = new CD(2,"Meteora",2006,20.0,0.7,true,"","RockCulture","Linkin Park","Rock");
Produto cd3 = new CD(3,"Ventura",2011,15.0,0.4,true,"","BrasilRock","Los Hermanos","Rock");
Produto cd4 = new CD(4,"Azul",2001,2.0,0.3,true,"","Global","Brinde","Clássico");

Produto jogo1 = new Jogo(5,"Good of War",2005,8.0,0.25,true,"","Aventura");
Produto jogo2 = new Jogo(6,"The Soul",2010,15.0,1.2,true,"","RPG");
Produto jogo3 = new Jogo(7,"FIFA",2015,10.0,0.8,true,"","Esportes");
Produto jogo4 = new Jogo(8, "Need For Speed", 2006, 12.0, 0.45, true, "", "Esportes");

Produto fita1 = new Fita(9, "Oito Odiados", 2016, 20.0, 1.2, true, "", "Samuel L. Jackson", "Tarantino", 180.0, "Drama");
Produto fita2 = new Fita(10, "Transformers", 2014, 30.0, 2.0, true,"", "Megan Fox", "Michael Bay", 120.0, "Ficção");
Produto fita3 = new Fita(11,"A Vida Secrete de Walter Mitty",2013,50.0,3.0,true,"","Ben Stiller","Ben Stiller",125.0,"Aventura");
	

//direciona osprodutos para o estoque de cada loja
public  ArrayList<Produto> estoqueAN = new ArrayList<Produto>();

  public void addProdutosAN(){
	  estoqueAN.add(cd1);
	  estoqueAN.add(jogo3);
	  estoqueAN.add(fita3);
  }
  public ArrayList<Produto> estoqueProdutosAN(){
	  return estoqueAN;
  }
  
  public ArrayList<Produto> estoqueDisponivelAN(){
	  ArrayList<Produto> estoqueDisponivel = new ArrayList<Produto>() ;
	  for(Produto p : estoqueAN){
		  if(p.isSituacao()== true){
			  estoqueDisponivel.add(p);
		  }
	  }
	return estoqueDisponivel;
  }
  public Produto buscaProdutoPorCodigo(int codigo) {
	Produto produto = null;
		for(Produto p: estoqueAN){
			if (p.getCodigo()==codigo) {
				produto = p;
				break;
			}
		}
	return produto;
  }
  
  public Produto setaProduto(Produto produto){
	  if(produto.isSituacao()==true){
		  produto.setSituacao(false);
	  }else{
		  produto.setSituacao(true);
	  }
	  
	  return produto;
  }
}

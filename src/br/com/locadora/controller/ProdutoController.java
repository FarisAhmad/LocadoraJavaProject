package br.com.locadora.controller;

import java.util.ArrayList;

import br.com.locadora.model.CD;
import br.com.locadora.model.Jogo;
import br.com.locadora.model.Produto;

public class ProdutoController {
	//banco de Dados de todos os produtos da loja
	
final Produto cd1 = new CD(1,"SKANK - MTV ao VIVO",2010,10.0,0.6,"MTV","SKANK","MPB","disponivel");
final Produto cd2 = new CD(2,"Meteora",2006,20.0,0.7,"RockCulture","Linkin Park","Rock","disponivel");
final Produto cd3 = new CD(3,"Ventura",2011,15.0,0.4,"BrasilRock","Los Hermanos","Rock","disponivel");

final Produto jogo1 = new Jogo(4,"The Soul",2005,8.0,0.25,"disponivel","Aventura");
final Produto jogo2 = new Jogo(5,"The Soul",2010,15.0,1.2,"disponivel","RPG");
final Produto jogo3 = new Jogo(6,"FIFA",2015,10.0,0.8,"disponivel","Esportes");
	

//direciona osprodutos para o estoque de cada loja
public ArrayList<Produto> estoqueAN = new ArrayList<Produto>();


  public void addProdutosAN(){
	  estoqueAN.add(cd1);
	  estoqueAN.add(cd3);
	  estoqueAN.add(jogo2);
	  estoqueAN.add(jogo3);
  }
  public ArrayList<Produto> estoqueProdutosAN(){
	  addProdutosAN();
	  return estoqueAN;
  }
}

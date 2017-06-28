package br.com.locadora.controller;

import java.util.ArrayList;
import java.util.Date;

import br.com.locadora.model.Aluguel;
import br.com.locadora.model.Cliente;
import br.com.locadora.model.Produto;

public class AluguelController {
	ProdutoController produtoController = new ProdutoController();
	public ArrayList<Aluguel> alugueisAN = new ArrayList<Aluguel>();
	
	
	public Aluguel novoAluguel(Cliente cliente,Produto produto,Date dataInicio,int dataDevolucao){
		
		
		
		Aluguel aluguel = new Aluguel(cliente,produto,dataInicio,dataDevolucao);
		
		alugueisAN.add(aluguel);
		
		return aluguel;
		
	}


	public ArrayList<Aluguel> listarAlugueisAN() {
		return alugueisAN;
		
	}


	@SuppressWarnings("deprecation")
	public double calculaValor(int codProduto) {
		double valor = 0.0;
			for(Aluguel a : alugueisAN){
				if(a.getProduto().getCodigo() == codProduto){
					int diaInicio = a.getDataInicio().getDay();
					Date data = new Date();
					int diaDev = data.getDay();
					int dias = diaDev - diaInicio;
					
					valor = dias * a.getProduto().getPrecoPorDia();
					
					
				}
			}

		return valor;
		
	}


	public void deletaAluguel(int codProduto) {
		for(Aluguel a : alugueisAN){
			if(a.getProduto().getCodigo() == codProduto){
				
				alugueisAN.remove(a);
				break;
			}
		}
		
	}

}

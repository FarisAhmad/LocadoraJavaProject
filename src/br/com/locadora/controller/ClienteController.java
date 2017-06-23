package br.com.locadora.controller;



import java.util.ArrayList;
import java.util.List;

import br.com.locadora.model.Cliente;

public class ClienteController {
	static List<Cliente> clientes = new ArrayList<Cliente>();
	
	static{
		clientes.add(new Cliente("Fernando",1,"321.313","asa norte","Brasília","DF","312312321",0.0));
		clientes.add(new Cliente("João",2,"23131.23","asa norte","Brasília","DF","23131",0.0));
	}
	
	public List<Cliente> listarClientes(){
		return clientes;
	}
	
	 public void adicionaCliente(Cliente cliente){
 		 clientes.add(cliente);
		
	 }
}
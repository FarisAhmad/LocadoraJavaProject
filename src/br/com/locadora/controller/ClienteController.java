package br.com.locadora.controller;



import java.util.ArrayList;
import java.util.List;

import br.com.locadora.model.Cliente;

public class ClienteController {
	static List<Cliente> clientes = new ArrayList<Cliente>();
	
	static{
		clientes.add(new Cliente("Fernando",1,"123.0","asa norte","Brasília","DF","312312321",0.0));
		clientes.add(new Cliente("João",2,"123.1","asa norte","Brasília","DF","23131",0.0));
	}
	
	public List<Cliente> listarClientes(){
		return clientes;
	}
	
	 public void adicionaCliente(Cliente cliente){
 		 clientes.add(cliente);
		
	 }
	 
	 public Cliente verificaClientePorCpf(String cpf){
		 Cliente cliente = null;
		 for(Cliente c : clientes){
			 if (cpf.equals(c.getCpf())) {
				cliente = c;
				break;
			 }
		 }
		 
		return cliente;		 
	 }

	public void setaDivida(Double valor,Cliente cliente) {
		
		 for(Cliente c : clientes){
			 if (c == cliente) {
				 cliente.setDivida(valor);
				 clientes.remove(c);
				 clientes.add(cliente);
				 break;
			 }
		 }
	}
}
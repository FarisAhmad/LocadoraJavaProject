package 
br.com.locadora.exec;

import br.com.locadora.controller.ClienteController;
import br.com.locadora.controller.FilialController;
import br.com.locadora.model.Cliente;

public class Main {
	public static void main(String[] args){
		FilialController fc = new FilialController();
		System.out.println(fc.retornaFiliais());
		ClienteController clienteController = new ClienteController();
		//Cliente cl1 = new Cliente("Fernanda",3,"313.2","asa sul","Brasília","DF","31451",0.0); cadastro funcionando
		//clienteController.adicionaCliente(cl1);
		System.out.println(clienteController.listarClientes());
		
//		Matriz mtz = new Matriz();
//		Filial fl = new Filial();
//		fl.setCidade("dada");
//		fl.setInscEstadual("121");
//		System.out.println(mtz+"\n"+fl);
	
		
	}

}

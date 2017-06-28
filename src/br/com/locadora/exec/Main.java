package 
br.com.locadora.exec;

import java.util.Date;
import java.util.Scanner;

import br.com.locadora.controller.AluguelController;
import br.com.locadora.controller.ClienteController;
import br.com.locadora.controller.FilialController;
import br.com.locadora.controller.ProdutoController;
import br.com.locadora.model.Cliente;
import br.com.locadora.model.Produto;

public class Main {
	
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		
		ProdutoController produtoController = new ProdutoController();
		produtoController.addProdutosAN();
		
		FilialController fc = new FilialController();
		fc.criaFiliais();
		
		
		
		ClienteController clienteController = new ClienteController();
		
		AluguelController aluguelController = new AluguelController();
				
		
		
	
		
		int codFilial;
		//MENU
		do{
			
		System.out.println("Escolha a filial : \n1. Asa Norte - Bras�lia\n2. Asa Sul - Bras�lia\n3. Morumbi - S�o Paulo");
		codFilial = Integer.parseInt(ler.nextLine());
		
		}while(codFilial != 1);//S� Temos uma Filial dispon�vel
		
		//Implementar switch para as opc�oes do menu
		int opcao;
		do{
		System.out.println("\n\tMenu\n");
	
		System.out.println("1. Cadastrar Novo Cliente\n2. Novo Aluguel\n3. Devolu��o\n4. Listar Clientes\n5. Listar Alugueis\n6. Exit");
		opcao = Integer.parseInt(ler.nextLine());
		
		switch (opcao) {
		//Cadastrar Novo Cliente
		case 1:
			System.out.println("C�digo :");
			int codigo = Integer.parseInt(ler.nextLine());
			
			System.out.println("Nome :");
			String nome = ler.nextLine();
			
			System.out.println("CPF :");
			String cpf = ler.nextLine();
			
			System.out.println("Endere�o :");
			String end = ler.nextLine();
			
			System.out.println("Cidade :");
			String cid = ler.nextLine();
			
			System.out.println("Estado :");
			String est = ler.nextLine();
			
			System.out.println("Telefone :");
			String tel = ler.nextLine();
			
			Cliente clienteCadastro = new Cliente(nome,codigo,cpf,end,cid,est,tel,0.0);
			
			clienteController.adicionaCliente(clienteCadastro);
			System.out.println(clienteController.listarClientes());
			
			break;
		//Novo Aluguel
		case 2:
			
			System.out.println("Estoque Filial Asa Norte :\n"+produtoController.estoqueDisponivelAN());
			System.out.println("\nInforme c�digo do Produto selecionado: \n");
			int cod = Integer.parseInt(ler.nextLine());
			Produto produto = produtoController.buscaProdutoPorCodigo(cod);
			
			System.out.println("\nInforme o cpf do cliente :");
			String cpfCliente = ler.nextLine();
			Cliente cliente = clienteController.verificaClientePorCpf(cpfCliente);
			if(cliente==null){
				System.out.println("Cliente N�o Cadastrado");
				break;
			}else{
				System.out.println("Dia de devolu��o :\n");
				int dataDevolucao = Integer.parseInt(ler.nextLine());
				
				System.out.println("Confirmar aluguel do Produto : [S/N]"+produto);
				String resp = ler.nextLine();
				
				if (resp.equals("N")){
					break;
				}else{
					if(resp.equals("S")){
						produto = produtoController.setaProduto(produto);
						
						Date dataAtual = new Date();
						System.out.println(aluguelController.novoAluguel(cliente, produto, dataAtual, dataDevolucao));
					}
				}
				
				
				
				
			}
			
			break;
			
		//Devolu��o
		case 3:
			System.out.println("Informe c�digo do Produto a ser devolvido : \n");
			int codProduto = Integer.parseInt(ler.nextLine());
			
			Double valor = aluguelController.calculaValor(codProduto);
			
			System.out.println(valor);
			
			System.out.println("Pagamento Realizado ? [S/N]\n");
			String pago = ler.nextLine();

			if(pago.equals("S")){
					System.out.println("Pagamento realizado !\n");
			}else{
				System.out.println("Informe Cpf do Cliente :\n");
				String cpfCli = ler.nextLine();
				clienteController.setaDivida(valor,clienteController.verificaClientePorCpf(cpfCli));
				System.out.println(clienteController.verificaClientePorCpf(cpfCli));
			}
			produtoController.setaProduto(produtoController.buscaProdutoPorCodigo(codProduto));
			System.out.println(produtoController.buscaProdutoPorCodigo(codProduto));
			aluguelController.deletaAluguel(codProduto);
			
			break;
			
		//Exit
		case 4:
			System.out.println(clienteController.listarClientes());
			break;
			
		case 5 :
			System.out.println(aluguelController.listarAlugueisAN());
			break;
		case 6:
			break;
		default:
			System.out.println("Opc�o inexistente\n");
			break;
		}
		
		}while(opcao != 6);
	
		
		
	}

}

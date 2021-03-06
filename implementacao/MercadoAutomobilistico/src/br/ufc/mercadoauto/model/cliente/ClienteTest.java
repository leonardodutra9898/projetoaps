package br.ufc.mercadoauto.model.cliente;

import br.ufc.mercadoauto.repositorios.ClienteRepositorio;

public class ClienteTest {

	public static void clienteTeste() {
		ClienteRepositorio clientes = new ClienteRepositorio();
		
		// Add Cliente
		Cliente leonardo = new Cliente(10, "Leonardo Dutra", "Rua A, 1000", "(88) 9.9910-1010", "Brasil", "Am�rica");
		Cliente maria = new Cliente(25, "Maria Paula", "Rua Alameda, 562", "(81) 9.9280-2310", "Brasil", "Am�rica");
		Cliente cli1 = new Cliente(6, "Jo�o Esteves", "Rua C, 50", "(00) 2.2310-1010", "Peru", "Am�rica");
		Cliente cli2 = new Cliente(7, "Mario Vick", "Rua D, 20", "(11) 2.2310-1010", "M�xico", "Am�rica do Norte");
		
		clientes.inserir(leonardo);
		clientes.inserir(maria);
		clientes.inserir(cli1);
		clientes.inserir(cli2);
		
		System.out.println("Total de registros [CLIENTE] => " + clientes.totalRegistros() + "\n");
		
		System.out.println("LISTANDO CLIENTES +++++++++++++++++++++++++++");
		for(Cliente cs : clientes.listar()) {
			System.out.println(" -------------------------------------------- ");
			System.out.println("Cod ==> " + cs.getCod() + " Nome ==> " + cs.getNome());
			System.out.println(" -------------------------------------------- ");
		}
		
		
		// atualizando Cliente
//		leonardo.setNome("Jo�o Igor");
//		Cliente cliTemp = clientes.obter(10);
//		System.out.println("\nItem atualizado => " + cliTemp.getNome());
		
		// deletando cliente
//		clientes.delete(maria);
		
//		System.out.println("Total de registros Agora => " + clientes.totalRegistros() + "  //  Lista Vazia? == " + clientes.listaVazia() + " \n");
//		
//		
//		for(Cliente cs : clientes.listar()) {
//			System.out.println(" -------------------------------------------- ");
//			System.out.println("Cod ==> " + cs.getCod() + " Nome ==> " + cs.getNome());
//			System.out.println(" -------------------------------------------- ");
//		}
	}
	
}

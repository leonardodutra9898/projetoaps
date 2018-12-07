package br.ufc.mercadoauto.model.cliente;

import br.ufc.mercadoauto.repositorios.ClienteRepositorio;

public class ClienteTest {

	public static void clienteTeste() {
		ClienteRepositorio clientes = new ClienteRepositorio();
		
		// Add Cliente
		Cliente leonardo = new Cliente(10, "Leonardo Dutra", "Rua A, 1000", "(88) 9.9910-1010", "Brasil", "América");
		Cliente maria = new Cliente(25, "Maria Paula", "Rua Alameda, 562", "(81) 9.9280-2310", "Brasil", "América");
		
		clientes.inserir(leonardo);
		clientes.inserir(maria);
		
		System.out.println("Total de registros => " + clientes.totalRegistros() + "\n");
		
		
		for(Cliente cs : clientes.listar()) {
			System.out.println(" -------------------------------------------- ");
			System.out.println("Cod ==> " + cs.getCod() + " Nome ==> " + cs.getNome());
			System.out.println(" -------------------------------------------- ");
		}
		
		
		// atualizando Cliente
		leonardo.setNome("João Igor");
		Cliente cliTemp = clientes.obter(10);
		System.out.println("\nItem atualizado => " + cliTemp.getNome());
		
		// deletando cliente
		clientes.delete(maria);
		
		System.out.println("Total de registros Agora => " + clientes.totalRegistros() + "  //  Lista Vazia? == " + clientes.listaVazia() + " \n");
		
		
		for(Cliente cs : clientes.listar()) {
			System.out.println(" -------------------------------------------- ");
			System.out.println("Cod ==> " + cs.getCod() + " Nome ==> " + cs.getNome());
			System.out.println(" -------------------------------------------- ");
		}
	}
	
}

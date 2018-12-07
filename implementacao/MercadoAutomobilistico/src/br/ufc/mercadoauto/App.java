package br.ufc.mercadoauto;

import br.ufc.mercadoauto.model.cliente.Cliente;
import br.ufc.mercadoauto.model.fornecedor.Fornecedor;
import br.ufc.mercadoauto.repositorios.ClienteRepositorio;
import br.ufc.mercadoauto.repositorios.FornecedorRepositorio;

public class App {

	public static void main(String[] args) {
		System.out.println("Teste");
		
		//clienteTeste();
		fornecedorTeste();

		
	}
	
	
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
	
	
	public static void fornecedorTeste() {
		FornecedorRepositorio fornecedores = new FornecedorRepositorio();
		
		// Add Fornecedor
		Fornecedor leonardo = new Fornecedor(5, "Marcos Roberto", "Rua Figueiredo, 550", "(12) 9.5010-1010", "Cuba", "América Central");
		Fornecedor maria = new Fornecedor(100, "Ivan Marques", "Rua Brasil, 122", "(61) 9.0180-2310", "Brasil", "América");
		
		fornecedores.inserir(leonardo);
		fornecedores.inserir(maria);
		
		System.out.println("Total de registros => " + fornecedores.totalRegistros() + "\n");
		
		
		for(Fornecedor cs : fornecedores.listar()) {
			System.out.println(" -------------------------------------------- ");
			System.out.println("Cod ==> " + cs.getCod() + " Nome ==> " + cs.getNome());
			System.out.println(" -------------------------------------------- ");
		}
		
		
		// atualizando Fornecedor
		leonardo.setNome("Fornecedor Novo");
		Fornecedor fTemp = fornecedores.obter(5);
		System.out.println("\nItem atualizado => " + fTemp.getNome());
		
		// deletando fornecedor
		fornecedores.delete(maria);
		
		System.out.println("Total de registros Agora => " + fornecedores.totalRegistros() + "  //  Lista Vazia? == " + fornecedores.listaVazia() + " \n");
		
		
		for(Fornecedor cs : fornecedores.listar()) {
			System.out.println(" -------------------------------------------- ");
			System.out.println("Cod ==> " + cs.getCod() + " Nome ==> " + cs.getNome());
			System.out.println(" -------------------------------------------- ");
		}
	}
	
}

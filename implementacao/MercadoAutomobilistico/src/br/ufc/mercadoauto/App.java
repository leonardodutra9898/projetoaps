package br.ufc.mercadoauto;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import br.ufc.mercadoauto.model.Pecas;
import br.ufc.mercadoauto.model.cliente.Cliente;
import br.ufc.mercadoauto.model.fornecedor.Fornecedor;
import br.ufc.mercadoauto.repositorios.ClienteRepositorio;
import br.ufc.mercadoauto.repositorios.FornecedorRepositorio;
import br.ufc.mercadoauto.repositorios.PecasRepositorio;

public class App {

	public static void main(String[] args) {
		System.out.println("Teste");
		
//		clienteTeste();
//		fornecedorTeste();
		pecasTeste();

		
	}
	
	
	public static void clienteTeste() {
		ClienteRepositorio clientes = new ClienteRepositorio();
		
		// Add Cliente
		Cliente leonardo = new Cliente(10, "Leonardo Dutra", "Rua A, 1000", "(88) 9.9910-1010", "Brasil", "Am�rica");
		Cliente maria = new Cliente(25, "Maria Paula", "Rua Alameda, 562", "(81) 9.9280-2310", "Brasil", "Am�rica");
		
		clientes.inserir(leonardo);
		clientes.inserir(maria);
		
		System.out.println("Total de registros => " + clientes.totalRegistros() + "\n");
		
		
		for(Cliente cs : clientes.listar()) {
			System.out.println(" -------------------------------------------- ");
			System.out.println("Cod ==> " + cs.getCod() + " Nome ==> " + cs.getNome());
			System.out.println(" -------------------------------------------- ");
		}
		
		
		// atualizando Cliente
		leonardo.setNome("Jo�o Igor");
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
		Fornecedor leonardo = new Fornecedor(5, "Marcos Roberto", "Rua Figueiredo, 550", "(12) 9.5010-1010", "Cuba", "Am�rica Central");
		Fornecedor maria = new Fornecedor(100, "Ivan Marques", "Rua Brasil, 122", "(61) 9.0180-2310", "Brasil", "Am�rica");
		
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
	
	
	
	public static void pecasTeste() {
		PecasRepositorio pecas = new PecasRepositorio();
		
		Calendar data1 = Calendar.getInstance(new Locale("America/Sao Paulo"));
		Date dataMotor = data1.getTime();
		Calendar data2 = Calendar.getInstance(new Locale("America/Sao Paulo"));
		Date dataCilindro = data2.getTime();
		
		// Add pe�a
		Pecas motor = new Pecas(2, "Motor v2.0 4 cilindros", 18000.00, "Mitsubishi", 10.0, 15000.00, dataMotor);
		Pecas cilindro = new Pecas(63, "Cilindro Padr�o", 2000.51, "Dodge", 20.0, 1500.00, dataCilindro);
		
		pecas.inserir(motor);
		pecas.inserir(cilindro);
		
		System.out.println("Total de registros => " + pecas.totalRegistros() + "\n");
		
		
		for(Pecas ps : pecas.listar()) {
			System.out.println(" -------------------------------------------- ");
			System.out.println("Cod ==> " + ps.getCod() + " Nome ==> " + ps.getNome() + ", data === " + ps.getDataEnvioFornecedor());
			System.out.println(" -------------------------------------------- ");
		}
		
		
		// atualizando pe�a
		cilindro.setNome("Cilindro mais potente");
		Pecas pTemp = pecas.obter(63);
		System.out.println("\nItem atualizado => " + pTemp.getNome());
		
		// deletando pe�a
		pecas.delete(motor);
		
		System.out.println("Total de registros Agora => " + pecas.totalRegistros() + "  //  Lista Vazia? == " + pecas.listaVazia() + " \n");
		
		
		for(Pecas ps : pecas.listar()) {
			System.out.println(" -------------------------------------------- ");
			System.out.println("Cod ==> " + ps.getCod() + " Nome ==> " + ps.getNome());
			System.out.println(" -------------------------------------------- ");
		}
	}
	
}

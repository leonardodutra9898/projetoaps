package br.ufc.mercadoauto.model.fornecedor;

import br.ufc.mercadoauto.repositorios.FornecedorRepositorio;

public class FornecedorTest {

	public static void fornecedorTeste() {
		FornecedorRepositorio fornecedores = new FornecedorRepositorio();
		
		// Add Fornecedor
		Fornecedor leonardo = new Fornecedor(5, "Marcos Roberto", "Rua Figueiredo, 550", "(12) 9.5010-1010", "Cuba", "América Central");
		Fornecedor maria = new Fornecedor(100, "Ivan Marques", "Rua Brasil, 122", "(61) 9.0180-2310", "Brasil", "América");
		
		fornecedores.inserir(leonardo);
		fornecedores.inserir(maria);
		
		System.out.println("Total de registros [FORNECEDORES] => " + fornecedores.totalRegistros() + "\n");
		
		
		System.out.println("LISTANDO FORNECEDORES +++++++++++++++++++++++++++");
		for(Fornecedor cs : fornecedores.listar()) {
			System.out.println(" -------------------------------------------- ");
			System.out.println("Cod ==> " + cs.getCod() + " Nome ==> " + cs.getNome());
			System.out.println(" -------------------------------------------- ");
		}
		
		
		// atualizando Fornecedor
//		leonardo.setNome("Fornecedor Novo");
//		Fornecedor fTemp = fornecedores.obter(5);
//		System.out.println("\nItem atualizado => " + fTemp.getNome());
		
		// deletando fornecedor
//		fornecedores.delete(maria);
		
//		System.out.println("Total de registros Agora => " + fornecedores.totalRegistros() + "  //  Lista Vazia? == " + fornecedores.listaVazia() + " \n");
		
		
//		for(Fornecedor cs : fornecedores.listar()) {
//			System.out.println(" -------------------------------------------- ");
//			System.out.println("Cod ==> " + cs.getCod() + " Nome ==> " + cs.getNome());
//			System.out.println(" -------------------------------------------- ");
//		}
	}
	
}

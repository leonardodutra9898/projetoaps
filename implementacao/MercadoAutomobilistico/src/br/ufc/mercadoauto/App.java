package br.ufc.mercadoauto;

import br.ufc.mercadoauto.model.cliente.ClienteTest;
import br.ufc.mercadoauto.model.fornecedor.FornecedorTest;
import br.ufc.mercadoauto.model.peca.PecasTest;
import br.ufc.mercadoauto.model.pedido.PedidoTest;

public class App {

	public static void main(String[] args) {
		System.out.println("Teste");
		
		// dados de clientes
		ClienteTest.clienteTeste();
		
		//dados de fornecedores
		FornecedorTest.fornecedorTeste();
		
		// dados de produtos ou peças
		PecasTest.pecasTeste();
		
		// pedido
		PedidoTest.pedidoTeste();
		
	}	
}

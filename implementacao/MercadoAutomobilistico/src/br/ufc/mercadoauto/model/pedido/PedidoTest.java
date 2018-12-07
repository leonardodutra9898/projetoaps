package br.ufc.mercadoauto.model.pedido;

import java.util.Calendar;
import java.util.Date;

import br.ufc.mercadoauto.model.StatusEnum;
import br.ufc.mercadoauto.repositorios.PedidoRepositorio;

public class PedidoTest {

	public static void pedidoTeste() {
		PedidoRepositorio pedidos = new PedidoRepositorio();
		
		Date data1 = Calendar.getInstance().getTime();
		Date data2 = Calendar.getInstance().getTime();
		Date dataEntregaPedido1 = new Date(Calendar.YEAR + 1, Calendar.JANUARY, Calendar.DATE+5);
		
		
		// Add pedido
		Pedido pedido1 = new Pedido(15053, data1, null, StatusEnum.NOVO_PEDIDO, 2);
		Pedido pedido2 = new Pedido(23100, data2, dataEntregaPedido1, StatusEnum.FATURADO, 4);
		
		pedidos.inserir(pedido1);
		pedidos.inserir(pedido2);
		
		System.out.println("Total de registros => " + pedidos.totalRegistros() + "\n");
		
		
		for(Pedido ps : pedidos.listar()) {
			System.out.println(" -------------------------------------------- ");
			System.out.println("Cod ==> " + ps.getCodPedido() + " Status ==> " + ps.getStatus());
			System.out.println(" -------------------------------------------- ");
		}
		
		
		// atualizando pedido
		pedido1.setStatus(StatusEnum.CANCELADO);
		Pedido pedidoTemp = pedidos.obter(15053);
		System.out.println("\nItem atualizado => " + pedido1.getCodPedido() + ", com Status agora " + pedido1.getStatus());
		
		// deletando pedido
		pedidos.delete(pedido2);
		
		System.out.println("Total de registros Agora => " + pedidos.totalRegistros() + "  //  Lista Vazia? == " + pedidos.listaVazia() + " \n");
		
		
		for(Pedido pe : pedidos.listar()) {
			System.out.println(" -------------------------------------------- ");
			System.out.println("Cod ==> " + pe.getCodPedido() + " Status ==> " + pe.getStatus());
			System.out.println(" -------------------------------------------- ");
		}
	}
	
}

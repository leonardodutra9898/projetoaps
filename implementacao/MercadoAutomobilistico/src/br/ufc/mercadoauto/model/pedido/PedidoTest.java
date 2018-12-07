package br.ufc.mercadoauto.model.pedido;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import br.ufc.mercadoauto.model.cliente.Cliente;
import br.ufc.mercadoauto.model.enums.StatusEnum;
import br.ufc.mercadoauto.model.peca.Pecas;
import br.ufc.mercadoauto.repositorios.PedidoRepositorio;

public class PedidoTest {

	public static void pedidoTeste() {
		PedidoRepositorio pedidos = new PedidoRepositorio();
		
		Calendar dataPeca = Calendar.getInstance(new Locale("America/Sao Paulo"));
		Date dataCarburador = dataPeca.getTime();
		Date dataPneu = dataPeca.getTime();
		
		Cliente cli1 = new Cliente(6, "João Esteves", "Rua C, 50", "(00) 2.2310-1010", "Peru", "América");
		Pecas carburador = new Pecas(9, "Motor v2.0 4 cilindros", 1400.00, "Mitsubishi", 12.0, 900.00, dataCarburador);
		
		Cliente cli2 = new Cliente(7, "Mario Vick", "Rua D, 20", "(11) 2.2310-1010", "México", "América do Norte");
		Pecas pneu = new Pecas(20, "Motor v2.0 4 cilindros", 1500.00, "Mitsubishi", 13.0, 1000.00, dataPneu);
		
		
		Date data1 = Calendar.getInstance().getTime();
		Date data2 = Calendar.getInstance().getTime();
		Date dataEntregaPedido1 = new Date(Calendar.YEAR + 1, Calendar.JANUARY, Calendar.DATE+5);
		
		
		// Add pedido
		Pedido pedido1 = new Pedido(15053, data1, null, StatusEnum.NOVO_PEDIDO, 2,cli1,carburador);
		Pedido pedido2 = new Pedido(23100, data2, dataEntregaPedido1, StatusEnum.FATURADO, 4,cli2,pneu);
		
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

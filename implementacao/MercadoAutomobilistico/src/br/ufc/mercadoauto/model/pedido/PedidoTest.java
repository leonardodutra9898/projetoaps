package br.ufc.mercadoauto.model.pedido;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import br.ufc.mercadoauto.model.cliente.Cliente;
import br.ufc.mercadoauto.model.enums.StatusEnum;
import br.ufc.mercadoauto.model.peca.Pecas;
import br.ufc.mercadoauto.repositorios.ClienteRepositorio;
import br.ufc.mercadoauto.repositorios.PecasRepositorio;
import br.ufc.mercadoauto.repositorios.PedidoRepositorio;

public class PedidoTest {

	public static void pedidoTeste() {
		PedidoRepositorio pedidos = new PedidoRepositorio();

		List<Cliente> clientes = ClienteRepositorio.clientes;
		List<Pecas> pecas = PecasRepositorio.pecas;
	
		Date data1 = Calendar.getInstance().getTime();
		Date data2 = Calendar.getInstance().getTime();
		Date dataEntregaPedido1 = new Date(Calendar.YEAR + 1, Calendar.JANUARY, Calendar.DATE+5);
		
		
		// Add pedido
		Pedido pedido1 = new Pedido(15053, data1, null, StatusEnum.NOVO_PEDIDO, 2,clientes.get(2),pecas.get(1));
		Pedido pedido2 = new Pedido(23100, data2, dataEntregaPedido1, StatusEnum.FATURADO, 4,clientes.get(3),pecas.get(2));
		
		pedidos.inserir(pedido1);
		pedidos.inserir(pedido2);
		
		System.out.println("Total de registros [PEDIDOS] => " + pedidos.totalRegistros() + "\n");
		System.out.println("Total de registros [PECAS] => " + pecas.size() + "\n");
		System.out.println("Total de registros [CLIENTES] => " + clientes.size() + "\n");
		
		
		double somaPedidosPrecoInicial = 0.0;
		double somaPedidosPrecoFinal = 0.0;
		
		
		System.out.println("LISTANDO PEDIDOS +++++++++++++++++++++++++++");
		for(Pedido ps : pedidos.listar()) {
			System.out.println(" -------------------------------------------- ");
			System.out.println("Cod ==> " + ps.getCodPedido() + " Status ==> " + ps.getStatus() + ", Qtde => " + ps.getQuantidadePecas() + ", data pedido => "
					+ ps.getDataPedido() + ", Item == " + ps.getPeca().getNome() + "(" + ps.getPeca().getMarca() + "), valor unit. => " + ps.getPeca().getPrecoVarejo() + ", total de R$ " + 
					(ps.getQuantidadePecas() * ps.getPeca().getPrecoVarejo()));
			System.out.println(" -------------------------------------------- ");
			
			if(ps.getStatus() == StatusEnum.FATURADO) {
				somaPedidosPrecoInicial += ps.getQuantidadePecas() * ps.getPeca().getPrecoCompraFornecedor();
				somaPedidosPrecoFinal += ps.getQuantidadePecas() * ps.getPeca().getPrecoVarejo();
			}

			
		}
		
		System.out.println("\n\nTOTAL FATURADO COM PEDIDOS ===> R$ " + somaPedidosPrecoFinal);
		System.out.println("LUCROS DOS PEDIDOS ===> R$ " + (somaPedidosPrecoFinal - somaPedidosPrecoInicial));
		
		
		// atualizando pedido
//		pedido1.setStatus(StatusEnum.CANCELADO);
//		Pedido pedidoTemp = pedidos.obter(15053);
//		System.out.println("\nItem atualizado => " + pedido1.getCodPedido() + ", com Status agora " + pedido1.getStatus());
		
		// deletando pedido
//		pedidos.delete(pedido2);
		
//		System.out.println("Total de registros Agora => " + pedidos.totalRegistros() + "  //  Lista Vazia? == " + pedidos.listaVazia() + " \n");
		
		
//		for(Pedido pe : pedidos.listar()) {
//			System.out.println(" -------------------------------------------- ");
//			System.out.println("Cod ==> " + pe.getCodPedido() + " Status ==> " + pe.getStatus());
//			System.out.println(" -------------------------------------------- ");
//		}
	}
	
}

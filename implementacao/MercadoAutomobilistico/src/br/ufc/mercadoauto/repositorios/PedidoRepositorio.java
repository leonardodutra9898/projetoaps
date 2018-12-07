package br.ufc.mercadoauto.repositorios;

import java.util.ArrayList;
import java.util.List;

import br.ufc.mercadoauto.interfaces.CRUD;
import br.ufc.mercadoauto.model.pedido.Pedido;

public class PedidoRepositorio implements CRUD <Pedido, Integer> {

	private int contador = 0;
	private List<Pedido> pedidos; 

	public PedidoRepositorio() {
		pedidos = new ArrayList<>(); 
	}
	
	@Override
	public void inserir(Pedido p) {
		pedidos.add(contador++, p);
		System.out.println("Novo pedido!");
	}

	@Override
	public boolean listaVazia() {
		return pedidos.isEmpty();
	}

	@Override
	public Pedido obter(long cod) {
		Pedido temp = null;
		
		for(Pedido p : pedidos) {
			if(p.getCodPedido() ==cod) {
				temp = p;
			} 
		}
		return temp;
	}

	@Override
	public void delete(Pedido p) {
		pedidos.remove(p);
		contador--;
		System.out.println("Item deletado!!");
	}

	@Override
	public Iterable<Pedido> listar() {
		return pedidos;
	}

	@Override
	public void atualizar(Pedido p) {
		int indice = pedidos.indexOf(p);
		pedidos.add(indice, p);
	}

	@Override
	public int totalRegistros() {
		return contador;
	}
	
}

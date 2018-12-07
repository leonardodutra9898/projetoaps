package br.ufc.mercadoauto.repositorios;

import java.util.ArrayList;
import java.util.List;

import br.ufc.mercadoauto.interfaces.CRUD;
import br.ufc.mercadoauto.model.cliente.Cliente;
import br.ufc.mercadoauto.model.pedido.Pedido;

public class ClienteRepositorio implements CRUD <Cliente, Integer> {

	private int contador = 0;
	public static List<Cliente> clientes; 

	public ClienteRepositorio() {
		clientes = new ArrayList<>(); 
	}
	
	@Override
	public void inserir(Cliente c) {
		clientes.add(contador++, c);
		System.out.println("Cliente adicionado!");
	}

	@Override
	public boolean listaVazia() {
		return clientes.isEmpty();
	}

	@Override
	public Cliente obter(long cod) {
		Cliente temp = null;
		
		for(Cliente c : clientes) {
			if(c.getCod() ==cod) {
				temp = c;
			} 
		}
		return temp;
	}

	@Override
	public void delete(Cliente c) {
		clientes.remove(c);
		contador--;
		System.out.println("Item deletado!!");
	}

	@Override
	public Iterable<Cliente> listar() {
		return clientes;
	}

	@Override
	public void atualizar(Cliente c) {
		int indice = clientes.indexOf(c);
		clientes.add(indice, c);
	}

	@Override
	public int totalRegistros() {
		return contador;
	}

	@Override
	public Cliente pesquisar(String t) {
		Cliente cTemp = null;
		for(Cliente c : clientes) {
			if(c.getNome() == t) {
				cTemp = c;				
			}
		}
		return cTemp;
	}
	
}

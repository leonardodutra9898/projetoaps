package br.ufc.mercadoauto.repositorios;

import java.util.ArrayList;
import java.util.List;

import br.ufc.mercadoauto.interfaces.CRUD;
import br.ufc.mercadoauto.model.Pecas;

public class PecasRepositorio implements CRUD <Pecas, Integer> {

	private int contador = 0;
	private List<Pecas> pecas; 

	public PecasRepositorio() {
		pecas = new ArrayList<>(); 
	}
	
	@Override
	public void inserir(Pecas p) {
		pecas.add(contador++, p);
		System.out.println("Peça adicionado!");
	}

	@Override
	public boolean listaVazia() {
		return pecas.isEmpty();
	}

	@Override
	public Pecas obter(long cod) {
		Pecas temp = null;
		
		for(Pecas p : pecas) {
			if(p.getCod() ==cod) {
				temp = p;
			} 
		}
		return temp;
	}

	@Override
	public void delete(Pecas p) {
		pecas.remove(p);
		contador--;
		System.out.println("Item deletado!!");
	}

	@Override
	public Iterable<Pecas> listar() {
		return pecas;
	}

	@Override
	public void atualizar(Pecas p) {
		int indice = pecas.indexOf(p);
		pecas.add(indice, p);
	}

	@Override
	public int totalRegistros() {
		return contador;
	}
	
}

package br.ufc.mercadoauto.model;

import br.ufc.mercadoauto.repositorios.CRUD;

public class Fornecedor extends Pessoa implements CRUD<Fornecedor, Integer> {

	@Override
	public void inserir(Fornecedor V) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean listaVazia() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Fornecedor obter(Fornecedor V) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Fornecedor V) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Iterable<?> listar() {
		// TODO Auto-generated method stub
		return null;
	}

}

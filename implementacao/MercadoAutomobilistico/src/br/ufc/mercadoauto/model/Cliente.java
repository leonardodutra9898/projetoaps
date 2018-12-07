package br.ufc.mercadoauto.model;

import br.ufc.mercadoauto.repositorios.CRUD;

public class Cliente extends Pessoa implements CRUD <Cliente, Integer>{

	@Override
	public void inserir(Cliente V) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean listaVazia() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Cliente obter(Cliente V) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Cliente V) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Iterable<?> listar() {
		// TODO Auto-generated method stub
		return null;
	}


}

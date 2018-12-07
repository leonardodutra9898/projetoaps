package br.ufc.mercadoauto.model.fornecedor;

import br.ufc.mercadoauto.interfaces.CRUD;
import br.ufc.mercadoauto.model.Pessoa;

public class Fornecedor extends Pessoa implements CRUD<Fornecedor, Integer> {

	public Fornecedor(long cod, String nome, String endereco, String telefone, String pais, String regiao) {
		super(cod, nome, endereco, telefone, pais, regiao);
	}

	@Override
	public void inserir(Fornecedor o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean listaVazia() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Fornecedor obter(long i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Fornecedor i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Iterable<Fornecedor> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void atualizar(Fornecedor o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int totalRegistros() {
		// TODO Auto-generated method stub
		return 0;
	}

}

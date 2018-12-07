package br.ufc.mercadoauto.repositorios;

import java.util.ArrayList;
import java.util.List;

import br.ufc.mercadoauto.interfaces.CRUD;
import br.ufc.mercadoauto.model.fornecedor.Fornecedor;

public class FornecedorRepositorio implements CRUD <Fornecedor, Integer> {

	private int contador = 0;
	private List<Fornecedor> fornecedores; 

	public FornecedorRepositorio() {
		fornecedores = new ArrayList<>(); 
	}
	
	@Override
	public void inserir(Fornecedor f) {
		fornecedores.add(contador++, f);
		System.out.println("Fornecedor adicionado!");
	}

	@Override
	public boolean listaVazia() {
		return fornecedores.isEmpty();
	}

	@Override
	public Fornecedor obter(long cod) {
		Fornecedor temp = null;
		
		for(Fornecedor f : fornecedores) {
			if(f.getCod() ==cod) {
				temp = f;
			} 
		}
		return temp;
	}

	@Override
	public void delete(Fornecedor f) {
		fornecedores.remove(f);
		contador--;
		System.out.println("Item deletado!!");
	}

	@Override
	public Iterable<Fornecedor> listar() {
		return fornecedores;
	}

	@Override
	public void atualizar(Fornecedor f) {
		int indice = fornecedores.indexOf(f);
		fornecedores.add(indice, f);
	}

	@Override
	public int totalRegistros() {
		return contador;
	}
	
}

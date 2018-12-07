package br.ufc.mercadoauto.repositorios;

public interface CRUD <T, V> {

	void inserir(T V);
	boolean listaVazia();
	T obter(T V);
	void delete(T V);
	Iterable<?> listar();
	
}

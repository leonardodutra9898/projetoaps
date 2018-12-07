package br.ufc.mercadoauto.interfaces;

public interface CRUD <T, V> {

	void inserir(T o);
	boolean listaVazia();
	T obter(long i);
	void delete(T i);
	void atualizar(T o);
	T pesquisar(String t);
	int totalRegistros();
	Iterable<T> listar();
	
}

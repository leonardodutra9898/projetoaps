package br.ufc.mercadoauto.model.fornecedor;

import br.ufc.mercadoauto.model.Pessoa;

public class Fornecedor extends Pessoa {

	public Fornecedor(long cod, String nome, String endereco, String telefone, String pais, String regiao) {
		super(cod, nome, endereco, telefone, pais, regiao);
	}

}

package br.ufc.mercadoauto.model;

import java.util.ArrayList;
import java.util.List;

import br.ufc.mercadoauto.model.fornecedor.Fornecedor;
import br.ufc.mercadoauto.model.peca.Pecas;

public class PecasFornecedor {

	private int quantidadeEstoque;
	private Fornecedor fornecedor;
	private List<Pecas> pecas;
	

	public PecasFornecedor() {
		pecas = new ArrayList<>();
	}

	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public List<Pecas> getPecas() {
		return pecas;
	}

}

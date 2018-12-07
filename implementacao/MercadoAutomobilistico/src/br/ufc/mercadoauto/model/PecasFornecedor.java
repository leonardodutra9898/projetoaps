package br.ufc.mercadoauto.model;

import br.ufc.mercadoauto.model.fornecedor.Fornecedor;
import br.ufc.mercadoauto.model.peca.Pecas;

public class PecasFornecedor {

	private int quantidadeEstoque;
	private Fornecedor fornecedor;
	private Pecas peca;

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

	public Pecas getPecas() {
		return peca;
	}

}

package br.ufc.mercadoauto.model.peca;

import java.util.Date;

public class Pecas {

	private long cod;	
	private String nome;
	private double precoVarejo;
	private String marca;
	private double tamanho;
	private double precoCompraFornecedor;
	private Date dataEnvioFornecedor;

	public Pecas(long cod, String nome, double precoVarejo, String marca, double tamanho, double precoCompraFornecedor,
			Date dataEnvioFornecedor) {
		super();
		this.cod = cod;
		this.nome = nome;
		this.precoVarejo = precoVarejo;
		this.marca = marca;
		this.tamanho = tamanho;
		this.precoCompraFornecedor = precoCompraFornecedor;
		this.dataEnvioFornecedor = dataEnvioFornecedor;
	}

	
	public long getCod() {
		return cod;
	}

	public void setCod(long cod) {
		this.cod = cod;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPrecoVarejo() {
		return precoVarejo;
	}

	public void setPrecoVarejo(double precoVarejo) {
		this.precoVarejo = precoVarejo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

	public double getPrecoCompraFornecedor() {
		return precoCompraFornecedor;
	}

	public void setPrecoCompraFornecedor(double precoCompraFornecedor) {
		this.precoCompraFornecedor = precoCompraFornecedor;
	}

	public Date getDataEnvioFornecedor() {
		return dataEnvioFornecedor;
	}

	public void setDataEnvioFornecedor(Date dataEnvioFornecedor) {
		this.dataEnvioFornecedor = dataEnvioFornecedor;
	}
	
}

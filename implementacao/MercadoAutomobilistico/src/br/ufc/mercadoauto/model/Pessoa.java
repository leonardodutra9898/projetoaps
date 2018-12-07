package br.ufc.mercadoauto.model;

public abstract class Pessoa {

	long cod;
	String nome;
	String endereco;
	String numTelefone;
	String pais;
	String regiao;
	
	public Pessoa(long cod, String nome, String endereco, String telefone, String pais, String regiao) {
		this.cod = cod;
		this.nome = nome;
		this.endereco = endereco;
		this.numTelefone = telefone;
		this.pais = pais;
		this.regiao = regiao;
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
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getNumTelefone() {
		return numTelefone;
	}
	public void setNumTelefone(String numTelefone) {
		this.numTelefone = numTelefone;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getRegiao() {
		return regiao;
	}
	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}	
	
}

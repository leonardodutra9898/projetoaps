package br.ufc.mercadoauto.model.pedido;

import java.util.Date;

import br.ufc.mercadoauto.model.cliente.Cliente;
import br.ufc.mercadoauto.model.enums.StatusEnum;
import br.ufc.mercadoauto.model.peca.Pecas;

public class Pedido {

	private long codPedido;
	private Date dataPedido;
	private Date dataEntregaPrevista;
	private StatusEnum status;
	private int quantidadePecas;
	private Cliente cliente;
	private Pecas peca;
	
	
	
	public Pedido(long codPedido, Date dataPedido, Date dataEntregaPrevista, StatusEnum status, int quantidadePecas, Cliente cli, Pecas peca) {
		super();
		this.codPedido = codPedido;
		this.dataPedido = dataPedido;
		this.dataEntregaPrevista = dataEntregaPrevista;
		this.status = status;
		this.quantidadePecas = quantidadePecas;
		this.cliente = cli;
		this.peca = peca;
	}
	
	
	
	public long getCodPedido() {
		return codPedido;
	}
	public void setCodPedido(long codPedido) {
		this.codPedido = codPedido;
	}
	public Date getDataPedido() {
		return dataPedido;
	}
	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}
	public Date getDataEntregaPrevista() {
		return dataEntregaPrevista;
	}
	public void setDataEntregaPrevista(Date dataEntregaPrevista) {
		this.dataEntregaPrevista = dataEntregaPrevista;
	}
	public StatusEnum getStatus() {
		return status;
	}
	public void setStatus(StatusEnum status) {
		this.status = status;
	}
	public int getQuantidadePecas() {
		return quantidadePecas;
	}
	public void setQuantidadePecas(int quantidadePecas) {
		this.quantidadePecas = quantidadePecas;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Pecas getPeca() {
		return peca;
	}
	public void setPeca(Pecas peca) {
		this.peca = peca;
	}	
	
}

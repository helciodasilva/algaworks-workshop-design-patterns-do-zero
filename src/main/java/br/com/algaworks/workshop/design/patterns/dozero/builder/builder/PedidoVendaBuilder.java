package br.com.algaworks.workshop.design.patterns.dozero.builder.builder;

import java.math.BigDecimal;
import java.util.ArrayList;

import br.com.algaworks.workshop.design.patterns.dozero.builder.Cliente;
import br.com.algaworks.workshop.design.patterns.dozero.builder.ItemPedido;
import br.com.algaworks.workshop.design.patterns.dozero.builder.PedidoVenda;

public class PedidoVendaBuilder {

	private PedidoVenda instancia;

	public PedidoVendaBuilder() {
		this.instancia = new PedidoVenda();
	}

	public PedidoVendaBuilder comClienteVip(String nome) {
		defininrclient(nome, true);
		return this;
	}

	public PedidoVendaBuilder comClienteNormal(String nome) {
		defininrclient(nome, false);
		return this;
	}

	private void defininrclient(String nome, boolean vip) {
		Cliente cliente = new Cliente();
		cliente.setNome(nome);
		cliente.setVip(vip);
		this.instancia.setCliente(cliente);
	}

	public PedidoVendaBuilder comItem(String nome, Integer quantidade, String valorUnitario) {
		ItemPedido item = new ItemPedido();
		item.setNome(nome);
		item.setValorUnitario(new BigDecimal(valorUnitario));
		item.setQuantidade(quantidade);

		if (this.instancia.getItensPedido() == null) {
			this.instancia.setItensPedido(new ArrayList<ItemPedido>());
		}

		this.instancia.getItensPedido().add(item);

		return this;
	}
	
	/*
	public PedidoVendaBuilder comNumero(String numero) {
		this.instancia.setNumero(numero);
		return this;
	}

	public PedidoVenda construir() {
		if (this.instancia.getNumero() == null) {
			throw new IllegalStateException("O número no pedido de venda é obrigatório");
		}
		return this.instancia;
	}
	*/
	
	public PedidoVendaBuilderValido comNumero(String numero) {
		this.instancia.setNumero(numero);
		return new PedidoVendaBuilderValido(instancia);
	}

}

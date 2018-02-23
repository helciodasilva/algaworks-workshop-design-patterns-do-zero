package br.com.algaworks.workshop.design.patterns.dozero.builder.builder;

import br.com.algaworks.workshop.design.patterns.dozero.builder.PedidoVenda;

public class PedidoVendaBuilderValido {

	private PedidoVenda instancia;

	public PedidoVendaBuilderValido(PedidoVenda instancia) {
		this.instancia = instancia;
	}

	public PedidoVenda construir() {
		if (this.instancia.getNumero() == null) {
			throw new IllegalStateException("O número no pedido de venda é obrigatório");
		}
		return this.instancia;
	}

}

package br.com.algaworks.workshop.design.patterns.dozero.builder.test;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import br.com.algaworks.workshop.design.patterns.dozero.builder.Cliente;
import br.com.algaworks.workshop.design.patterns.dozero.builder.ItemPedido;
import br.com.algaworks.workshop.design.patterns.dozero.builder.PedidoVenda;
import br.com.algaworks.workshop.design.patterns.dozero.builder.builder.PedidoVendaBuilder;

public class PedidoVendaTest {

	@Test
	public void deveCalcularValorTotalPedidoParaClienteVip() {
		PedidoVenda pedidoVenda = new PedidoVenda();

		Cliente cliente = new Cliente();
		cliente.setNome("Jo�o");
		cliente.setVip(true);
		pedidoVenda.setCliente(cliente);

		ItemPedido item1 = new ItemPedido();
		item1.setNome("Calculadora");
		item1.setValorUnitario(new BigDecimal("200"));
		item1.setQuantidade(2);

		ItemPedido item2 = new ItemPedido();
		item2.setNome("Mochila");
		item2.setValorUnitario(new BigDecimal("200"));
		item2.setQuantidade(1);

		List<ItemPedido> itensPedido = Arrays.asList(item1, item2);
		pedidoVenda.setItensPedido(itensPedido);

		BigDecimal valorTotal = pedidoVenda.getValorTotal();

		assertEquals(new BigDecimal("576").doubleValue(), valorTotal.doubleValue(), 0.0001);
	}
	
	@Test
	public void deveCalcularValorTotalPedidoParaClientVipComBuilder() {
		PedidoVenda pedidoVenda = new PedidoVendaBuilder()
										.comClienteVip("Jo�o Silva")
										.comItem("Calculador", 2, "200")
										.comItem("Mochila", 1, "200")
										.comNumero("02893")
										.construir();
		
		BigDecimal valorTota = pedidoVenda.getValorTotal();
		assertEquals(new BigDecimal("576").doubleValue(), valorTota.doubleValue(), 0.0001);
		
	}

}

package br.com.algaworks.workshop.design.patterns.dozero.factorymethod.maladireta;

import java.util.List;

import br.com.algaworks.workshop.design.patterns.dozero.factorymethod.contato.Contato;
import br.com.algaworks.workshop.design.patterns.dozero.factorymethod.contato.Contatos;

public abstract class MalaDireta {

	protected abstract Contatos criarContatos();

	public boolean enviaEmail(String mensagem) {
		List<Contato> contatos = criarContatos().todos();

		System.out.println("Conectando no servidor SMTP...");
		System.out.println("Mensagem a ser envada: " + mensagem);
		System.out.println();

		for (Contato contato : contatos) {
			System.out.println("From: <contato@algaworks.com>");
			System.out.printf("To: [%s] <%s>\n", contato.getNome(), contato.getEmail());
			System.out.println(mensagem);
			System.out.println();
		}

		return true;
	}

}

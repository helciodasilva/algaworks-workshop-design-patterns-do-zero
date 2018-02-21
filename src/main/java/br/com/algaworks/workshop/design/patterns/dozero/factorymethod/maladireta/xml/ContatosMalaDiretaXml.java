package br.com.algaworks.workshop.design.patterns.dozero.factorymethod.maladireta.xml;

import br.com.algaworks.workshop.design.patterns.dozero.factorymethod.contato.Contatos;
import br.com.algaworks.workshop.design.patterns.dozero.factorymethod.maladireta.MalaDireta;

public class ContatosMalaDiretaXml extends MalaDireta {

	private String nomeArquivo;

	public ContatosMalaDiretaXml(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}

	@Override
	protected Contatos criarContatos() {
		return new ContatosXml(nomeArquivo);
	}

}

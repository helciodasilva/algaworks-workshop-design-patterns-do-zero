package br.com.algaworks.workshop.design.patterns.dozero.factorymethod.maladireta.csv;

import br.com.algaworks.workshop.design.patterns.dozero.factorymethod.contato.Contatos;
import br.com.algaworks.workshop.design.patterns.dozero.factorymethod.maladireta.MalaDireta;

public class MalaDiretaCsv extends MalaDireta {

	private String nomeArquivo;

	public MalaDiretaCsv(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}

	@Override
	protected Contatos criarContatos() {
		return new ContatosCSV(nomeArquivo);
	}

}

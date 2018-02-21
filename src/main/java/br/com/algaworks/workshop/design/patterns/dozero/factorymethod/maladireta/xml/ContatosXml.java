package br.com.algaworks.workshop.design.patterns.dozero.factorymethod.maladireta.xml;

import java.net.URL;
import java.util.List;

import com.thoughtworks.xstream.XStream;

import br.com.algaworks.workshop.design.patterns.dozero.factorymethod.contato.Contato;
import br.com.algaworks.workshop.design.patterns.dozero.factorymethod.contato.Contatos;

public class ContatosXml implements Contatos {

	private String nomeArquivo;

	public ContatosXml(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Contato> todos() {
		XStream xstream = new XStream();
		xstream.alias("contatos", List.class);
		xstream.alias("contato", Contato.class);

		URL arquivo = this.getClass().getResource("/" + nomeArquivo);
		return (List<Contato>) xstream.fromXML(arquivo);
	}

}

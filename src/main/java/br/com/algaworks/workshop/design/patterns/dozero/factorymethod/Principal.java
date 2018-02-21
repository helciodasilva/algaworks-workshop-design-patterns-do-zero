package br.com.algaworks.workshop.design.patterns.dozero.factorymethod;

import javax.swing.JOptionPane;

import br.com.algaworks.workshop.design.patterns.dozero.factorymethod.maladireta.csv.MalaDiretaCsv;

public class Principal {

	public static void main(String[] args) {
		MalaDiretaCsv malaDireta = new MalaDiretaCsv("contatos.csv");
		String mensagem = JOptionPane.showInputDialog(null, "Informe a mensagem para o e-mail");

		boolean status = malaDireta.enviaEmail(mensagem);
		JOptionPane.showMessageDialog(null, "E-mails enviados: " + status);
	}

}

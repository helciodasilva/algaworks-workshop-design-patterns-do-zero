package br.com.algaworks.workshop.design.patterns.dozero.factorymethod;

import javax.swing.JOptionPane;

import br.com.algaworks.workshop.design.patterns.dozero.factorymethod.maladireta.MalaDireta;

public class Principal {

	public static void main(String[] args) {
		MalaDireta malaDireta = new MalaDireta();
		String mensagem = JOptionPane.showInputDialog(null, "Informe a mensagem para o e-mail");

		boolean status = malaDireta.enviaEmail("contatos.csv", mensagem);
		System.out.println(status);
	}

}

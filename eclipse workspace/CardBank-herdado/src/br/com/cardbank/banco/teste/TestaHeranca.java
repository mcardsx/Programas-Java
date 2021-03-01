package br.com.cardbank.banco.teste;

import br.com.cardbank.banco.modelo.Gerente;
import br.com.cardbank.banco.modelo.Funcionario;
import br.com.cardbank.banco.modelo.Designer;

public class TestaHeranca {
	public static void main(String[] args) {
		Funcionario jose = new Designer();
		Gerente mateus = new Gerente();

		jose.setNome("José das Quantas");
		jose.setCpf("104.231.454.65");
		jose.setSalario(1500);
		// mateus.setSalario(5000);

		System.out.println(jose.getNome());
		System.out.println(jose.getBonificacao());
		// System.out.println(mateus.getBonificacao());

		mateus.autentica(2101);

	}
}

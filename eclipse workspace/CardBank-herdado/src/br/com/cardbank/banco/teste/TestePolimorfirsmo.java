package br.com.cardbank.banco.teste;

import br.com.cardbank.banco.modelo.*;

public class TestePolimorfirsmo {
	public static void main(String[] args) {
		Autenticavel almir = new Gerente();
		Funcionario design = new Designer();
		Autenticavel editor = new Administrador();
		Gerente mateus = new Gerente();
		ControleBonificacao contador = new ControleBonificacao();

		// almir.setSalario(1000);
		design.setSalario(1000);
		// editor.setSalario(1000);
		// mateus.setSalario(1000);

		// contador.registra(almir);
		contador.registra(design);
		// contador.registra(editor);
		// contador.registra(mateus);

		System.out.println(contador.getSoma());
	}

}

package br.com.cardbank.banco.v2.teste;

import java.io.ObjectInputStream.GetField;

import br.com.cardbank.banco.v2.modelo.*;

public class TesteGuardadorDeContas {
	
	public static void main(String[] args) {
		
		GuardadorDeContas guardador = new GuardadorDeContas();
		
		Object contaPoupanca = new ContaCorrente(222, 2222);
		guardador.adiciona(contaPoupanca);
		
		Object contaCorrente = new ContaCorrente(333, 3333);
		guardador.adiciona(contaCorrente);
		
		int tamanho = guardador.getTamanhoGuardador();
		System.out.println(tamanho);
		
		Object ref = (Conta) guardador.getReferencia(0);
		
		System.out.println(ref);
	}

}

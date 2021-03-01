package br.com.cardbank.banco.v2.modelo;

import br.com.cardbank.banco.v2.modelo.Conta;

public class GuardadorDeContas {
	
	private Object referencias[];
	private int posicaoLivre;
	
	public GuardadorDeContas() {
		this.referencias = new Object[10];
		posicaoLivre = 0;
	}
	
	public void adiciona(Object ref) {
		referencias[this.posicaoLivre] = ref;
		this.posicaoLivre++;
	}
	
	public int getTamanhoGuardador() {
		
		return this.posicaoLivre;
	}

	public Object getReferencia(int pos) {

		return this.referencias[pos];
	}

}

package br.com.cardbank.banco.modelo;

public abstract interface Autenticavel {
	
	public void setSenha(int senha);
	
	public boolean autentica(int senha);
}

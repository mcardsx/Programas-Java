package br.com.cardbank.banco.modelo;

public class Gerente implements Autenticavel {

	private AutenticacaoUtil autenticador;
	private String nome;
	private String cpf;
	private double salario;
	private int senha;

	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}

//	public double getBonificacao() {
//		return super.getSalario();
//	}

	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
	
}
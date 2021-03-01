package br.com.cardbank.banco.modelo;

public class Administrador implements Autenticavel {
	private AutenticacaoUtil autenticador;

	// public double getBonificacao() {
	// return super.getSalario() * 0.5;
	// }

	public Administrador() {
		this.autenticador = new AutenticacaoUtil();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.autentica(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
}
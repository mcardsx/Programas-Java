package br.com.cardbank.banco.modelo;


public class AutenticacaoUtil {

	private int senha;

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			System.out.println("voc� foi aut�nicado com sucesso!");
			return true;
		} else {
			System.out.println("Voc� errou a senha.");
			return false;
		}
	}
}

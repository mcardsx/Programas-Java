package br.com.cardbank.banco.modelo;

public class SistemaInterno {

	private int senha = 0000;
	
	public void autentica(Autenticavel autenticavel) {
		boolean autenticou = autenticavel.autentica(senha);
		if(autenticou == true) {
			System.out.println("Você foi autenticado com sucesso!");
		}else {
			System.out.println("Você não foi autenticado.");
		}
	}
}


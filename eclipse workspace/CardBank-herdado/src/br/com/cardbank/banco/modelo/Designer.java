package br.com.cardbank.banco.modelo;

public class Designer extends Funcionario {

	public double getBonificacao(){
		return super.getSalario()*0.2;
	}
	
}
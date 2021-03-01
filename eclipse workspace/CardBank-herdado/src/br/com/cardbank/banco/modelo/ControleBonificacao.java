package br.com.cardbank.banco.modelo;

public class ControleBonificacao {

	private double soma;

	
	public void registra(Funcionario funcionario) {
		double bonificacao = funcionario.getBonificacao();
		this.soma += bonificacao; 
	}
	
	public double getSoma() {
		return this.soma;
	}
	
	public void setSoma(double soma) {
		this.soma = soma;
	}
}
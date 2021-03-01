
package br.com.cardbank.banco.v2.modelo;

import java.io.Serializable;

/**
 * classe que representa uma conta do CardBank.
 * 
 * @author Mateus
 * @version 0.1
 */
 public class Conta implements Comparable<Conta>, Serializable{

	private int numero;
	private int agencia;
	protected double saldo;
	private Cliente cliente;
	private static int total = 0;
/**
 * construtor responsavel por abrir conta CardBank com uma agencia e numero.
 * @param agencia
 * @param numero
 */
	public Conta(int agencia, int numero) {
		// System.out.println("Criando uma conta...");
		Conta.total++;
		this.agencia = agencia;
		this.numero = numero;
		// this.saldo = 100;
	}

	public void consulteSaldo() {
		System.out.println("-------CardBank-------");
		System.out.println("Seu saldo atual é de: " + this.saldo);
	}

	public void deposite(double valor) {
		this.saldo += valor;
	}
/**
 * O saldo precisa ser maior que o valor do saque.
 * 
 * @param valor
 * @throws SaldoInsuficienteException
 */
	public void saque(double valor) throws SaldoInsuficienteException{
		
	}

	public void transfira(Conta destino, double valor) throws SaldoInsuficienteException {
		this.saque(valor);
		destino.deposite(valor);

	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public String getCliente() {
		return this.cliente.getNome();
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public static int getTotal() {
		System.out.println("o total de contas foi de:");
		return Conta.total;
	}
	
	@Override
	public String toString() {
		
		return "Numero : " + this.numero + " Agência : " + this.agencia;
	}
	
	@Override
	public boolean equals(Object obj) {
		{
			Conta outra = (Conta) obj;
			
			if(this.agencia != outra.agencia) {
				return false;
			}
			
			if(this.numero != outra.numero) {
				return false;
			}
			
			return true;
		}
		
		
	}

	@Override
	public int compareTo(Conta outra) {
		
		return Double.compare(this.saldo, outra.saldo);
	}
}
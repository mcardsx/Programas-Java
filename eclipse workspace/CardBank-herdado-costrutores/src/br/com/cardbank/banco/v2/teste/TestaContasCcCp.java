package br.com.cardbank.banco.v2.teste;

import br.com.cardbank.banco.v2.modelo.*;


public class TestaContasCcCp {
	public static void main(String[] args) throws SaldoInsuficienteException{
		Conta contaCorrente = new ContaCorrente(232, 23345);
		Conta contaPoupanca = new ContaPoupanca(03445, 35677);
		
		//cC com taxa de 0.50$ ao sacar 
		contaCorrente.deposite(1000);
		contaCorrente.consulteSaldo();
		//try {
			contaCorrente.saque(1500);
		//}catch(SaldoInsuficienteException ex){
		//	ex.printStackTrace();
	//	}
		contaCorrente.consulteSaldo();
		//cP saque Normal
		contaCorrente.transfira(contaPoupanca, 200);
		contaPoupanca.consulteSaldo();
		contaCorrente.consulteSaldo();
		
		contaPoupanca.saque(150);
		contaPoupanca.consulteSaldo();
	}

}

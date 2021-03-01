package br.com.cardbank.banco.v2.teste.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.cardbank.banco.v2.modelo.Cliente;
import br.com.cardbank.banco.v2.modelo.Conta;
import br.com.cardbank.banco.v2.modelo.ContaCorrente;
import br.com.cardbank.banco.v2.modelo.ContaPoupanca;

public class TesteOrdenacaoPorString {
	
	public static void main(String[] args) {
		
		List<Conta> lista = new ArrayList<>();
		
		Conta cc1 = new ContaCorrente(22, 33);
		Cliente clienteCC1 = new Cliente();
		clienteCC1.setNome("Nico");
		cc1.setCliente(clienteCC1);
		cc1.deposite(333.0);
		lista.add(cc1);

		Conta cc2 = new ContaPoupanca(22, 44);
		Cliente clienteCC2 = new Cliente();
		clienteCC2.setNome("Guilherme");
		cc2.setCliente(clienteCC2);
		cc2.deposite(444.0);
		lista.add(cc2);

		Conta cc3 = new ContaCorrente(22, 11);
		Cliente clienteCC3 = new Cliente();
		clienteCC3.setNome("Paulo");
		cc3.setCliente(clienteCC3);
		cc3.deposite(111.0);
		lista.add(cc3);                              

		Conta cc4 = new ContaPoupanca(22, 22);
		Cliente clienteCC4 = new Cliente();
		clienteCC4.setNome("Ana");
		cc4.setCliente(clienteCC4);
		cc4.deposite(222.0);
		lista.add(cc4);
		
		lista.sort((c1, c2) -> Integer.compare(c1.getNumero(), c2.getNumero()));
		
		/*lista.sort(new Comparator<Conta>() {

		    @Override
		    public int compare(Conta c1, Conta c2) {
		        return Integer.compare(c1.getNumero(), c2.getNumero());
		    }
		} //fim da classe anonima

		);//fim do método*/
		
		/*for(Conta contas : lista) {
			System.out.println(contas + "," + contas.getCliente());
		}*/
		
		lista.forEach((contas) -> System.out.println(contas + ", " + contas.getCliente()));
	}

}

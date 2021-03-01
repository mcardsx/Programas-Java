package br.com.cardbank.banco.v2.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {
	
	public static void main(String[] args) {
		
		Integer idade = 29;//autoboxinng, é criado um objeto do tipo Integer por debaixo dos panos
		int numeroPrimitivo = new Integer(29);//unboxing (Tirar da caixa)
		
		List<Integer> lista = new ArrayList<>();
		lista.add(idade);
		lista.add(numeroPrimitivo);//autoboxing ocorre...
		
		int numero = lista.get(0);//unboxing 
		Integer numero2 = lista.get(1);// ok
		
		System.out.println(numero);
		System.out.println(numero2);
		
		Integer valueRef = Integer.valueOf(33); // delegando a criação para método valueOf
		
		int valorPego = valueRef.intValue(); //desembrulhando, pegando o valor primitivo do objeto wrapper
	
		Integer numeroAParsear = Integer.valueOf("29"); //parseando e devolvendo referencia
		int numeroParseado = Integer.parseInt("44"); //parseando e devolvendo primitivo
		
		//Constantes da classe Integer
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Integer.BYTES);
		System.out.println(Integer.SIZE);
	;
	}

}

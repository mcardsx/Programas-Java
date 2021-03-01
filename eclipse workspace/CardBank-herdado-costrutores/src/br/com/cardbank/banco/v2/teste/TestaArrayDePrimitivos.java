package br.com.cardbank.banco.v2.teste;

public class TestaArrayDePrimitivos {

	public static void main(String[] args) {

		int[] testes = new int[4];

		testes[0] = 18;
		testes[1] = 39;
		testes[2] = 23;
		testes[3] = 19;

		int teste4 = testes[3];

		System.out.println(teste4);
		System.out.println("Tamanho do array teste = " + testes.length);

		int[] idades = new int[5];

		for (int i = 0; i < idades.length; i++) {
			idades[i] = i; 
		}
		
		System.out.println("array idades:");
		for (int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);
		}
	}
}

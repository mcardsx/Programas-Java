
public class TestaCondicional {

	public static void main(String[] args) {

		System.out.println("testando condicionais");

		int idade = 17;
		int quantidadePessoas = 1;

		if (idade >= 18) {

			System.out.println("P�rabens voce � maior de idade!");
		} else {

			if (quantidadePessoas >= 2) {

				System.out.println("Voc� n�o � maior de idade, mas est� acompanhado!");
			} else {

				System.out.println("voc� n�o � maior de idade, e est� sozinho.");
			}

		}

	}

}
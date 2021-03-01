
public class TestaCondicional {

	public static void main(String[] args) {

		System.out.println("testando condicionais");

		int idade = 17;
		int quantidadePessoas = 1;

		if (idade >= 18) {

			System.out.println("Párabens voce é maior de idade!");
		} else {

			if (quantidadePessoas >= 2) {

				System.out.println("Você não é maior de idade, mas está acompanhado!");
			} else {

				System.out.println("você não é maior de idade, e está sozinho.");
			}

		}

	}

}
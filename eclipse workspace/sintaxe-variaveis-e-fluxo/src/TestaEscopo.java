
public class TestaEscopo {

	public static void main(String[] args) {

		int idade = 18;
		int quantidadePessoas = 1;
		// boolean acompanhado = quantidadePessoas >= 2;
		boolean acompanhado;

		if (quantidadePessoas >= 2) {

			acompanhado = true;

		} else {

			acompanhado = false;
		}

		if (idade >= 18 && acompanhado) {

			System.out.println("voce está nos conformes para entrar na boate dos casais!");

		} else {

			System.out.println("você não pode entrar na boate de casais");

		}

	}

}

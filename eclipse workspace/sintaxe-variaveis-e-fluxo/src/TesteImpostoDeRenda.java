
public class TesteImpostoDeRenda {

	public static void main(String[] args) {

		double salario = 1900.2;

		// ifs aqui

		if (salario >= 1900.0 && salario <= 2800.0) {

			System.out.println("Seu IR � de 7,5% com declara��o de R$ 142,00");

		}

		if (salario >= 2800.01 && salario <= 3751.0) {

			System.out.println("Seu IR � de 15% com declara��o de R$ 350,00");

		}

		if (salario >= 3751.0 && salario <= 4664.0) {

			System.out.println("Seu IR � de 22.5% com declara��o de R$ 636,00");
		}

	}

}

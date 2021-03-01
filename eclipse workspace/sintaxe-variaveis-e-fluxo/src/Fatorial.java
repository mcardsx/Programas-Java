
public class Fatorial {

	public static void main(String[] args) {

		int fatorial = 1;

		for (int contador = 1; contador <= 10; contador++) {

			for (int numero = contador ; numero >= 1; numero--) {

				fatorial = fatorial * numero;

				System.out.println(fatorial);
			}
			
			System.out.println();
		}
	}
}
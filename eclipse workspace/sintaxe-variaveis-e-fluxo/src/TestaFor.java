
public class TestaFor {

	public static void main(String[] args) {

		int contador;

		for (int multiplicador = 1; multiplicador <= 3; multiplicador++) {

			for (contador = 0; contador <= 3; contador++) {

				System.out.println("multiplicador � " + multiplicador);

				System.out.println("contador � " + contador);

				System.out.println(multiplicador * contador);
				
				System.out.println();
			}
			
		}
		
	}

}


public class TestaGetSet {
	public static void main(String[] args) {
		
		Conta conta = new Conta(232, 44444);
		Cliente mateus = new Cliente();
		
		conta.setNumero(232);
		conta.setAgencia(01);
		conta.setCliente(mateus);
		
		mateus.setNome("Mateus cardoso");
		
		System.out.println(conta.getNumero());
		System.out.println(conta.getAgencia());
		
		
	}

}

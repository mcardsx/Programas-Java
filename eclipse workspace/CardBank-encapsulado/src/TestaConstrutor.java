
public class TestaConstrutor {
	public static void main(String[] args) {
		
		Conta conta = new Conta(232, 283445);
		Conta conta2 = new Conta(333, 555555);
		Cliente mateus = new Cliente();
		Cliente babi = new Cliente();
		
		conta.setCliente(mateus);
		conta.deposite(500);
		conta.consulteSaldo();
		System.out.println(conta.getAgencia());
		System.out.println(conta.getNumero());
		
		conta2.setCliente(babi);
		conta2.consulteSaldo();
		System.out.println(conta2.getAgencia());
		System.out.println(conta2.getNumero());
		
		System.out.println();
		
		System.out.println(Conta.getTotal());
		
	}
}
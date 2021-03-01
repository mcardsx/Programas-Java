
public class Conta {

	private int numero;
	private int agencia;
	private double saldo;
	private Cliente cliente;
	private static int total = 0;

	public Conta(int agencia, int numero) {
		System.out.println("Criando uma conta...");
		Conta.total++;
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 100;	
	}

	public void consulteSaldo() {
		System.out.println("-------CardBank-------");
		System.out.println("Seu saldo atual é de: " + this.saldo);
	}

	public void deposite(double valor) {
		this.saldo += valor;
	}

	public boolean saque(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;

			return true;
		}
		return false;
	}

	public boolean transfira(Conta destino, double valor) {
		this.saque(valor);
		destino.deposite(valor);

		return true;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public static int getTotal() {
		System.out.println("o total de contas foi de:");
		return Conta.total;
	}
}
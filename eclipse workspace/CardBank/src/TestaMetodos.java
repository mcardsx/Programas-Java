
public class TestaMetodos {

	public static void main(String[] args) {
		Conta contaDoMateus = new Conta();
		contaDoMateus.deposite(2300);
		contaDoMateus.consulteSaldo();
		
		Conta contaDaBabi = new Conta();
		contaDaBabi.deposite(2600);
		contaDaBabi.consulteSaldo();
		
		Conta contaDaDrBeatriz = new Conta();
		contaDaDrBeatriz.deposite(3500);
		contaDaDrBeatriz.consulteSaldo();
		
		contaDoMateus.transfira(contaDaDrBeatriz, 500);
		contaDaDrBeatriz.consulteSaldo();
		contaDaDrBeatriz.saque(300);
		contaDaDrBeatriz.consulteSaldo();
	}

}

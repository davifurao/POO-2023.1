package conta;

public class Programa {

	public static void main(String[] args) {
		Conta contaDavi;
		Conta contaAmanda;
		contaDavi = new Conta("Davi","123A");
		contaAmanda= new Conta("Amanda","456B");
		
		contaDavi.realizarDeposito(100);
		contaAmanda.realizarDeposito(25);
		contaDavi.realizarSaque(50);
		contaAmanda.realizarDeposito(25);
		contaDavi.realizarTransferencia(50, contaAmanda);
		System.out.println(contaDavi.toString());
		System.out.println(contaAmanda.toString());
		
	}

}

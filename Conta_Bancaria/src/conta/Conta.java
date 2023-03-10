//Autor: Davi Souza de Luna
//Objetivo: aprendizado em relação à utilização de classes, a partir de um exemplo de uma implementação de uma Conta bancária np ramo de orientação à objetos

package conta;

public class Conta {

	String nomeProprietario;
	String numeroConta;
	float saldo;
	boolean status;
	private static int CONTADOR=0;
	
	public Conta(String nomeProprietario,String numeroConta) {
		this.nomeProprietario=nomeProprietario;
		this.numeroConta=numeroConta;
		this.saldo=0f;
		this.status=true;
		CONTADOR++;
	}
	
	public void desativarConta() {
		status=false; 
	}
	
	public static float consultarSaldo(Conta conta) {
		return conta.saldo;
	}
	
	public void realizarTransferencia(float quantia,Conta conta) {
		if(conta.status&&quantia>0&&this.saldo>quantia) {
			this.saldo-=quantia;
			conta.saldo+=quantia;
		}
	}
	
	public void realizarDeposito(float quantia) {
		if(status&&quantia>0) {
			saldo+=quantia;
			System.out.println("Foi depositado: "+quantia+" reais na conta: "+this.numeroConta+" Do proprietário "+this.nomeProprietario);
		}
	}
	
	public String toString() {
		return "Conta: [Proprietário= "+nomeProprietario+" numero da conta= "+numeroConta+
				" saldo= "+saldo+" status= "+status+"]";
	}
	
	public void realizarSaque(float quantia) {
		if(status&&quantia>0&&saldo>=quantia) {
			saldo-=quantia;
			System.out.println("Foi sacado: "+quantia+" reais");
		}
	}
	
	public static int getContador() {
		return CONTADOR;
	}
}

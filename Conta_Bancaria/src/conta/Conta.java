//Autor: Davi Souza de Luna
//Objetivo: aprendizado em relação à utilização de classes, a partir de um exemplo de uma implementação de uma Conta bancária np ramo de orientação à objetos

package conta;

import java.util.Objects;

public class Conta {

	String nomeProprietario;
	String numeroConta;
	float saldo;
	boolean status;
	private static int CONTADOR=0;
	
	//==================================*Construtor*================================================================
	
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
	//================================*Sobrescrição do toString*====================================================================
	public String toString() {
		return "Conta: [Proprietário= "+nomeProprietario+" numero da conta= "+numeroConta+
				" saldo= "+saldo+" status= "+status+"]";
	}
	//===============================================================================================================================
	public void realizarSaque(float quantia) {
		if(status&&quantia>0&&saldo>=quantia) {
			saldo-=quantia;
			System.out.println("Foi sacado: "+quantia+" reais");
		}
	}
	
	
	
	//================================*hash code===========================================================================
	public int hashCode() {
		return Objects.hash(nomeProprietario,numeroConta,saldo,status);
	}
	//==============================================================================================================================

	//=================================*Sobrescrição do equals*=====================================================================
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if(obj==null)
			return false;
		if(getClass()!=obj.getClass())
			return false;
		Conta aleatoria = (Conta) obj;
		return Objects.equals(nomeProprietario,aleatoria.nomeProprietario )
				&& Objects.equals(numeroConta, aleatoria.numeroConta)
				&& Float.floatToIntBits(saldo) == Float.floatToIntBits(aleatoria.saldo) && status == aleatoria.status;
	}



	//==============================*getters e setters*===============================================================================//
	public static int getContador() {
		return CONTADOR;
	}
	
	public float getSaldo() {
		return saldo;
	}
	public String getNumeroConta() {
		return numeroConta;
	}
	public boolean getStatus() {
		return status;
	}
	
	public String getNomeProprietario() {
		return nomeProprietario;
	}
	public void setContador(int contador) {
		Conta.CONTADOR=contador;
	}
	public void setSaldo(float saldo) {
		this.saldo=saldo;
	}
	public void setNumeroConta(String numeroConta) {
		this.numeroConta=numeroConta;
	}
	public void setStatus(boolean status) {
		this.status=status;
	}
	
}

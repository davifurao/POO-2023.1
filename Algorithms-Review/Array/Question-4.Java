//Crie um algoritmo que preencha um Array com 100 n´umeros inteiros aleatoriamente e imprima os
//elementos num´ericos que sejam primos.

import java.util.Random;
import java.util.Scanner;

public class q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//====================Declaração do array=========================
		int[] array;
		array = new int[100];
		//==============================================================
		int[] primo;
		primo = new int[100];
		
		//=============================================
		Random random=new Random();
		
		
		for(int i=0;i<100;i++) {
			int primo_contador=0;
			int divisores=0;
			array[i]= random.nextInt(200);
			for(int j=array[i];j>0;j--) {
				//===============Verificação de divisibilidade===================
				if((array[i]%j)==0) {
					divisores ++;	
				}
				//================Verificação se o valor é primo===========
				if(divisores==2) {
					primo_contador ++;
				}
				//===========================
			}primo[primo_contador]=array[i];
		}
		
		sc.close();

	}

}


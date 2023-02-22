//Crie um algoritmo que preencha um Array com 100 numeros inteiros aleatoriamente e imprima os
//elementos. Alem disso, deve-se realizar a impressao inversa tambem.

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class Question3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//============================================================
		int[] inverso;
		inverso=new int[100];
		//============================================================
		int[] array;//Declarando o array
		array= new int[100];
		//============================================================
		Random random = new Random();
		
		for(int i=0;i<100;i++) {
			array[i]=random.nextInt(200);
		}
		
		
		int contador_laco;
	    contador_laco=0;
		
		for(int i=99;i>-1;i--) {
			inverso[contador_laco]=array[i];
			contador_laco++;
		}
		System.out.println("Array em ordem normal: "+Arrays.toString(array));;
		System.out.println("Array inverso: "+Arrays.toString(inverso));
		sc.close();


	}

}

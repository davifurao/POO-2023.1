//Crie um algoritmo que preencha um Array com 100 numeros inteiros aleatoriamente e imprima os
//elementos numericos que sejam ımpares

import java.util.Arrays;
import java.util.Random;

public class Question5 {
	public static void main(String[] args) {
		int[] array;
		array = new int[100];
		
		int[] impares;
		impares = new int[100];
		
		Random random=new Random();
		
		for(int i=0; i<100;i++) {
			array[i]=random.nextInt(200);
		}
		
		int contador =0;
		
		for(int i=0;i<100;i++) {
			
			int valor=array[i];
			if((valor%2)!=0) {
				impares[contador]=array[i];
				contador++;
				
			}
			
		}
		System.out.println("Array completo: "+Arrays.toString(array));
		System.out.println("Array com valores primos: "+Arrays.toString(impares));
	}
	
}

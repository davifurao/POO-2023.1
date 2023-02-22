//Dada a entrada de 10 inteiros em sequˆencia, realize a impress˜ao da entrada inicial de forma inversa.

import java.util.Arrays;
import java.util.Scanner;
public class Question2 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	//============================================================
	int[] inverso;
	inverso=new int[10];
	//============================================================
	int[] array;//Declarando o array
	array= new int[10];
	//============================================================
	System.out.println("Diga qual o primeiro valor do array");
	array[0]=sc.nextInt() ;
	System.out.println("Diga o 2° valor do array");
	array[1]=sc.nextInt();
	System.out.println("Diga o 3° valor do array");
	array[2]=sc.nextInt();
	System.out.println("Diga o 4° valor do array");
	array[3]=sc.nextInt();
	System.out.println("Diga o 5° valor do array");
	array[4]=sc.nextInt();
	System.out.println("Diga o 6° valor do array");
	array[5]=sc.nextInt();
	System.out.println("Diga o 7° valor do array");
	array[6]=sc.nextInt();
	System.out.println("Diga o 8° valor do array");
	array[7]=sc.nextInt();
	System.out.println("Diga o 9° valor do array");
	array[8]=sc.nextInt();
	System.out.println("Diga o 10° valor do array");
	array[9]=sc.nextInt();
	//=============================================================
	int contador_laco=0;
	
	for(int i=9;i>-1;i--) {
		inverso[contador_laco]=array[i];
		contador_laco++;
	}
	System.out.println("Array inverso: "+Arrays.toString(inverso));
	sc.close();
}
}
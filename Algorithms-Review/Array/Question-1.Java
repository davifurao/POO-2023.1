//Escreva um algoritmo em Java que solicite 5 notas e realize o calculo da media aritmetica ao termino
//da execucao

import java.util.Scanner;
public class Question1 {

	public static void main(String[] args) {
		//Escreva um algoritmo em Java que solicite 5 notas e realize o calculo da media aritmetica ao termino
		//da execucao
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite sua primeira nota:");
		double nota1= sc.nextDouble();
		System.out.println("Digite sua Segunda nota:");
		double nota2=sc.nextDouble();
		System.out.println("Digite sua terceira nota:");
		double nota3=sc.nextDouble();
		System.out.println("Digite sua quarta nota:");
		double nota4=sc.nextDouble();
		System.out.println("Digite sua quinta e ultimna nota:");
		double nota5=sc.nextDouble();
		
		double media=(nota1+nota2+nota3+nota4+nota5)/5;
		
		System.out.println("Sua média é: "+media);
		sc.close();


	}

}

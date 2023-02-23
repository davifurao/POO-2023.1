import java.util.Arrays;
import java.util.Random;

public class q5 {
	public static void main(String[] args) {
		
		//================================================================
		int tamanho = 100;//variável que irá ser alterada(tamanho do array)
		
		
		
		
		//====================Instanciando as variaveis zero, arrau e array impar==
		
		int zero=0;
		
		int[] array;
		array = new int[tamanho];
		
		int[] impares;
		impares = new int[tamanho];
		
		Random random=new Random();
		
		//===========Preenchendo o array com valores aleatórios===============
		for(int i=0; i<tamanho;i++) {
			array[i]=random.nextInt(200);
		}
		
		int contador =0;
		
		for(int i=0;i<tamanho;i++) {
			
			int valor=array[i];
			if((valor%2)!=0) {
				impares[contador]=array[i];
				contador++;
				
			}
			
		}
		//================Descobrir o tamanho do array sem os zeros===========
		for(int i=0;i<tamanho;i++) {
			if(impares[i]==0) {
				zero++;
			}
			
		}
		//=========================Definindo o novo array sem o zero==========
		int tamanho_novo_array=tamanho-zero;
		int[] array_impar_sem_zero;
		array_impar_sem_zero = new int[tamanho_novo_array];
		
		//====================Preenchendo o novo array sem o zero=============
		for(int i=0;i<(tamanho_novo_array);i++) {
			array_impar_sem_zero[i]=impares[i];
		}
		System.err.println("Toma aqui teus arrays :");
		System.out.println("Array completo: "+Arrays.toString(array));
		System.out.println("Array com valores primos: "+Arrays.toString(array_impar_sem_zero));
		
	}
	
}

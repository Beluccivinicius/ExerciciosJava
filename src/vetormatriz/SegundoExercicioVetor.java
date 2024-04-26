package vetormatriz;

import java.util.Scanner;

public class SegundoExercicioVetor {

	public static void main(String[] args) {
		//****************************************************************************************************
		// Exercicio2
		//Elabore um algoritmo que leia 10 números inteiros e armazene em um vetor. Em seguida, mostre na tela:
		//Todos os elementos dos índices ímpares do vetor 
		//Todos os elementos do vetor que são números pares
		//A Soma de todos os elementos do vetor
		//A Média de todos os elementos do vetor, armazenada em uma variável do tipo real
		
		Scanner leiaScanner = new Scanner(System.in);
		
		int vetorCom10Numeros[] = new int[10];
		
		for(int i = 0; i < 10; i++) {
			
			System.out.println("Escreva um numero: " );
			int inputNumero = leiaScanner.nextInt();
			
			vetorCom10Numeros[i] = inputNumero;
			
			}
		
		System.out.println("Elementos nos índices ímpares: ");
		
		for(int i = 0; i < 10; i++) {
			
			if(i % 2 != 0) {
			
				System.out.println( vetorCom10Numeros[i] + " ");
			}
			
		}

		System.out.println("Elementos pares: " );
		
		for(int i = 0; i < 10; i++) {
			
			if(vetorCom10Numeros[i] % 2 == 0) {
				
				System.out.println( vetorCom10Numeros[i] + " ");
			}
			
		}
		
		double media = 1;
		int soma = 0;
		
		for(int num : vetorCom10Numeros) {
			soma += num;
		}
		
		media = soma *1.0 / 10;
		
		System.out.printf("Soma: %d\nMédia: %.2f", soma, media);
		
		leiaScanner.close();
		
	}

}

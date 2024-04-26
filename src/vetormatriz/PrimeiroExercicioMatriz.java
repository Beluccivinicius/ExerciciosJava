package vetormatriz;

import java.util.Scanner;

public class PrimeiroExercicioMatriz {

	public static void main(String[] args) {
		//****************************************************************************************************
		// Exercicio 1
		
		//Elabore um algoritmo que leia uma Matriz 3x3 de números inteiros e em seguida, mostre na tela:
		//Todos os elementos da Diagonal Principal
		//Todos os elementos da Diagonal Secundária
		//A Soma de todos os elementos da Diagonal Principal
		//A Soma de todos os elementos da Diagonal Secundária
		
		
		Scanner leiaScanner = new Scanner(System.in);
		
		int novaMatriz[][] = new int[3][3];
		
		int vetorDiagonalPrincipal[] = new int[3];
		
		int vetorDiagonalSecundario[] = new int[3];
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				
				System.out.println("Escreva um numero: ");
				
				novaMatriz[i][j] = leiaScanner.nextInt();
			}
		}

		for(int i = 0, contadorMatrizSecundaria = 2; i < 3; i++) {
			
			for(int j = 2; j > -1; j--) {
				
			System.out.println(contadorMatrizSecundaria + " " + j);
				
				if(j == i) {
					
					vetorDiagonalPrincipal[i] = novaMatriz[i][j];
				}
				
				if(j == contadorMatrizSecundaria) {
					
					vetorDiagonalSecundario[i] = novaMatriz[i][j];
				}

			}
			
			contadorMatrizSecundaria--;
			
		}
		
		System.out.println("Elementos da Diagonal Principal: \n" );
		
		for(int i = 0; i < 3; i++) {
			System.out.print(vetorDiagonalPrincipal[i]);
		}
		
		System.out.println("Elementos da Diagonal Secundária: \n" );
		
		for(int i = 0; i < 3; i++) {
			System.out.print(vetorDiagonalSecundario[i] + " ");
		}
		
		int somaDiagonalPrincipal = 0;
		int somaDiagonalSecundaria = 0;
		
		for(int i = 0; i < 3; i++) {
			somaDiagonalPrincipal += vetorDiagonalPrincipal[i];
			somaDiagonalSecundaria += vetorDiagonalSecundario[i];
		}
		
		System.out.println("Soma dos Elementos da Diagonal Principal: " + somaDiagonalPrincipal);
		System.out.println("Soma dos Elementos da Diagonal Secundária: " + somaDiagonalSecundaria);

		
		leiaScanner.close();

	}

}

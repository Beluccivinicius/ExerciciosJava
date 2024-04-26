package condicionais;

import java.util.Scanner;

public class PrimeiroExercicio {

	public static void main(String[] args) {
		// Exercicio 1
		//Faça um algoritmo em Java que leia 3 valores inteiros A, B e C e imprima na tela se a soma de A + B é 
		//maior, menor ou igual a C.

		Scanner leia = new Scanner(System.in);
		
		float numberA, numberB, numberC;
		
	
		System.out.println("Escreva o numero A: ");
		numberA = leia.nextFloat();
		
		System.out.println("Escreva o numero B: ");
		numberB = leia.nextFloat();
		
		System.out.println("Escreva o numero C: ");
		numberC = leia.nextFloat();
		
		
		if(numberA + numberB > numberC) {
		System.out.println("A Soma de A + B é MAIOR do que C");
		}
		else {
		System.out.println("A Soma de A + B é MENOR do que C");
		}
		leia.close();

		
	}

}

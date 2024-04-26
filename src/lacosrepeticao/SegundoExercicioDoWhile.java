package lacosrepeticao;

import java.util.Scanner;

public class SegundoExercicioDoWhile {

	public static void main(String[] args) {
		
		//***********************************************************************************************
		//Exercício 6 - do While
		//Escreva um algoritmo em Java, que leia números inteiros via teclado, até que o número zero seja 
		//digitado. Ao final, mostre na tela a média de todos os números digitados, que sejam múltiplos de 3.
		//Veja o exemplo abaixo:
		
		Scanner leia = new Scanner(System.in);
		
		int totalNumberDivivel3 = 0;
		
		int number = 0;
		int count = 0;
		
		do {
		System.out.println("Digite um número inteiro: ");
		
		number = leia.nextInt();
		
		if(number % 3 == 0 && number > 0) {
			
			totalNumberDivivel3 = totalNumberDivivel3 + number;
			count++;
			
		}
		
		} while (number != 0);
		
		
		double result = (totalNumberDivivel3 * 1.0)/ count * 1.0;
		
		System.out.println("A soma dos números positivos é: " + result);
		
		leia.close();
		

	}

}

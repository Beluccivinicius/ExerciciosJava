package lacosrepeticao;

import java.util.Scanner;

public class PrimeiroExercicioFor {

	public static void main(String[] args) {
		//Exercicio 1 - loop for
//		Escreva um algoritmo em Java, que leia 2 números inteiros via teclado, onde o 
//		primeiro número deve ser menor do que o segundo número. Caso contrário, deve 
//		ser exibida uma mensagem na tela informando que o intervalo é inválido e sair do programa.
		
		int num1, num2;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número do intervalo: ");
		
		num1 = leia.nextInt();
		
		System.out.println("Digite o último número do intervalo: ");
		
		num2 = leia.nextInt();
		
		if(num2 < num1) {
			System.out.println("Intervalo inválido!");
			return;
		}
		
		int count = 0;
		for(int i = num1; i < num2; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.println( i + " é múltiplo de 3 e 5");
				count++;
			}
		}
		
		if(count == 0) {
			System.out.println("Nenhum número é divisel por 5 e 3 nesse intervalo");
		}
		
		leia.close();

	}

}

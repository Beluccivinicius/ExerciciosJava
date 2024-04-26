package estruturadados;

import java.util.Scanner;

public class SegundoExercicioFor {

	public static void main(String[] args) {
		//***********************************************************************************************
		//Exercicio 2 - loop for
		//Escreva um algoritmo em Java, que leia 10 números inteiros via teclado e mostre na tela quantos 
		//números são pares e quantos número são ímpares. Veja o exemplo abaixo:
		
		Scanner leia = new Scanner(System.in);
		
		int countOdd = 0, countEven = 0;
		int currentValue;
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite o " + i + "º numero: ");
			
			currentValue = leia.nextInt();
			
			if(currentValue % 2 == 0) {
				countEven++;
				continue;
			}
			
			countOdd++;
		}
		
		System.out.println("Total de números pares: " + countEven + "\nTotal de números ímpares: " + countOdd);
		
		leia.close();

	}

}

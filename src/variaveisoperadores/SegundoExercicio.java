package variaveisoperadores;

import java.util.Scanner;

public class SegundoExercicio {

	public static void main(String[] args) {
		//Exercicio 2 - variaveis e operadores
//		Elabore um algoritmo em Java que leia 4 notas de um participante, em variáveis do tipo float e exiba na tela
//		a média final do participante. Veja o exemplo abaixo:

		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Nota 1: ");
		
		float nota1 = leia.nextFloat();
		
		leia.nextLine();

		System.out.println("Nota 2: ");
		
		float nota2 = leia.nextFloat();
		
		leia.nextLine();
		
		System.out.println("Nota 3: ");
		
		float nota3 = leia.nextFloat();
		
		leia.nextLine();
		
		System.out.println("Nota 4: ");
		
		float nota4  = leia.nextFloat();
		
		leia.nextLine();
		
		float media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.printf("A média é: %.2f", media);

	}

}

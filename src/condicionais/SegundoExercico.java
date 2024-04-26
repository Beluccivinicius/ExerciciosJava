package condicionais;

import java.util.Scanner;

public class SegundoExercico {

	public static void main(String[] args) {
		
		//******************************************************************************************
		//Exercicio 2
//		Escreva um algoritmo em Java, que leia um número inteiro via teclado e mostre na tela uma mensagem 
//		indicando se este número é par ou ímpar e se o número é positivo ou negativo. Veja os exemplos abaixo:

		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("Digite a nota 1: ");
		
		float nota1 = leia.nextFloat();
		
		leia.nextLine();
		
		System.out.println("Digite a nota 2: ");
		
		float nota2 = leia.nextFloat();
		
		leia.nextLine();
		
		System.out.println("Digite a nota 3: ");
		
		float nota3 = leia.nextFloat();
		
		leia.nextLine();

		System.out.println("Digite a nota 4: ");
		
		float nota4 = leia.nextFloat();
		
		leia.nextLine();
		
		float media = (nota1 + nota2 + nota3 + nota4) /4;
		
		System.out.printf("Média final: %.1f", media);
		
		
		

	}

}

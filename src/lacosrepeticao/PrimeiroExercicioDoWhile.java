package lacosrepeticao;

import java.util.Scanner;

public class PrimeiroExercicioDoWhile {

	public static void main(String[] args) {
		//Exercício 5 - do While
		//Uma empresa desenvolveu uma pesquisa interna para conhecer os colaboradores da área de Desenvolvimento 
		//e precisam de um sistema para analisar os dados. Escreva um algoritmo em Java, que leia via teclado as 
		//seguintes informações de cada colaborador:
		
		
		Scanner leia = new Scanner(System.in);
		
		Long totalNumber = 0l;
		
		Long number = 0l;
		
		do {
		System.out.println("Digite um número inteiro: ");
		
		number = leia.nextLong();
		
		if(number > 0) {
			
			totalNumber = totalNumber + number;
			
		}
		
		} while (number != 0);
		
		
		System.out.println("A soma dos números positivos é: " + totalNumber);
		
		leia.close();

	}

}

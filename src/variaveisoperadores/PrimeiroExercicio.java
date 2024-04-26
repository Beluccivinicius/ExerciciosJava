package variaveisoperadores;

import java.util.Scanner;

public class PrimeiroExercicio {

	public static void main(String[] args) {
		//Exercicio 1 - variaveis e operadores
		//Dado o Fluxograma abaixo, desenvolva o algoritmo abaixo na Linguagem Java: 

		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o salário: ");
		
		float salario = leia.nextFloat();
		
		leia.nextLine();
		
		System.out.println("Digite o abono: ");
		
		float abono = leia.nextFloat();
		
		float novoSalario = salario + abono;
		
		System.out.printf("Novo Salário: %.2f", novoSalario);
	}

}

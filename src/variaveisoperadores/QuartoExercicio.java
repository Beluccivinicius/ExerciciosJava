package variaveisoperadores;

import java.util.Scanner;

public class QuartoExercicio {

	public static void main(String[] args) {
		
		//Exercicio 1
		//Leia quatro valores float (n1, n2, n3, n4). A seguir, calcule e mostre a 
		//diferença do produto entre o n1 e n2 pelo produto entre o n3 e o n4. Veja os exemplos abaixo:

		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a numero 1: ");
		
		float numberOne = leia.nextFloat();
		
		leia.nextLine();
		
		System.out.println("Digite o numero 2: ");
		
		float numberTwo = leia.nextFloat();
		
		leia.nextLine();
		
		System.out.println("Digite a numero 3: ");
		
		float numberThree = leia.nextFloat();
		
		leia.nextLine();
		
		System.out.println("Digite a numero 4: ");
		
		float numberFour = leia.nextFloat();
		
		leia.nextLine();
		
		float diferenca = (numberOne * numberTwo) - (numberThree * numberFour);
		
		System.out.printf("Diferença: %.2f", diferenca);

	}

}

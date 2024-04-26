package lacosrepeticao;

import java.util.Scanner;

public class PrimeiroExercicioWhile {

	public static void main(String[] args) {
		//***********************************************************************************************
		//Exercício 1 - loop While
				
		//Escreva um algoritmo em Java, que leia a idade de várias pessoas (números inteiros), via teclado 
		//e mostre na tela o total de pessoas cuja idade seja menor que 21 anos e o total de pessoas cuja 
		//idade seja maior que 50 anos. A leitura dos dados deve ser finalizada ao digitar uma idade negativa. 
		//Veja o exemplo abaixo
				
		Scanner leia = new Scanner(System.in);
				
		int bigger50 = 0;
		int smaller21 = 0;
		int currentValue = 0;
				
		while (currentValue >= 0) {
					
			System.out.println("Digite uma idade: ");
					
			currentValue = leia.nextInt();
					
			if(currentValue > 50) {
				bigger50++;
						
			}else if(currentValue < 21 && currentValue > 0){
				smaller21++;
						
			}
					
		}
				
			System.out.println("Total de pessoas menores de 21 anos: " + smaller21 + "\nTotal de pessoas maiores de 50 anos: " + bigger50);
				
			leia.close();

	}

}

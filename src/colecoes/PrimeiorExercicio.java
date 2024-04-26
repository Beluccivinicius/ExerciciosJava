package colecoes;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeiorExercicio {

	public static void main(String[] args) {
		// ****************************************************************************************
		//Exercicio 1
				
		//Escreva um programa Java para criar uma Collection ArrayList de Objetos da Classe String. 
//		O programa deverá solicitar ao usuário, que ele digite via teclado 5 cores e deverá 
//		adicioná-las individualmente no ArrayList. Em seguida, faça o que se pede:
				
//		Mostre na tela todas as cores que foram adicionadas. 
//		Mostre na tela todas as cores que foram adicionadas ordenadas em ordem crescente.
				
		Scanner leiaScanner = new Scanner(System.in);
				
		ArrayList<String> coreStrings = new ArrayList<String>();
				
		for(int i = 0; i < 5; i++) {
			System.out.println("Digite uma cor: ");
					
			String cor = leiaScanner.next();
					
			coreStrings.add(cor.toLowerCase());
		}
				
		System.out.println(coreStrings);
			
		coreStrings.sort(null);
				
		System.out.println(coreStrings);
				
		leiaScanner.close();

	}

}

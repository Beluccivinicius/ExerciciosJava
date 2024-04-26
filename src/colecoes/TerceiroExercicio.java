package colecoes;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class TerceiroExercicio {

	public static void main(String[] args) {
		//****************************************************************************************
		//Exercicio 3	
//		Escreva um programa Java para criar uma Collection Set de Objetos da Classe Wrapper Integer.
//		O programa deverá solicitar ao usuário, que ele digite via teclado 10 valores inteiros não 
//		repetidos e adicione-os individualmente na Collection Set. Em seguida, faça o que se pede:
//		Mostre na tela todos os elementos da Collection Set, utilizando a Classe Iterator.

		
		Scanner leia = new Scanner(System.in);
		
		Set<Integer> numeros = new HashSet<Integer>();
		
		int i = 0;
		while(i < 10) {
			
			System.out.println("Escreva um numero inteiro: ");
			
			int entrada = leia.nextInt();
			
			numeros.add(entrada);
			
			i++;
		}
		
		Iterator<Integer> iNum = numeros.iterator();
		
		while(iNum.hasNext()) {
			System.out.println(iNum.next());
		}
		
		leia.close();

	}

}

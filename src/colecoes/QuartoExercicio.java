package colecoes;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class QuartoExercicio {

	public static void main(String[] args) {
		//****************************************************************************************
		//Exercicio 4	
//		Escreva um programa Java para criar uma Collection Set de Objetos da Classe Wrapper Integer, 
//		inicializada com 10 valores inteiros. O programa deverá solicitar ao usuário, que ele digite
//		via teclado 1 número inteiro e caso ele seja encontrado no Set, exiba na tela a mensagem: 
//		Número 00 Encontrado! Caso o número não seja encontrado, ele deverá exibir na tela a
//		mensagem: O número NN não foi encontrado!

		
		Scanner leia = new Scanner(System.in);
		
		Set<Integer> numeros = new HashSet<Integer>();
		
		Random numerosAleatorio = new Random();
		
		for(int contador = 0; contador < 11; contador++) {
			
			int numero = numerosAleatorio.nextInt(15);
			
			numeros.add(numero);
			
			if(numeros.size() < contador) {
				contador--;
				continue;
			}
			
		}
		
		System.out.println(numeros.size());
		System.out.println("Escreva um número: ");
		
		int input = leia.nextInt();
		
		if(numeros.contains(input)) {
			System.out.println("O número " + input + " foi encontrado");
		}else 
			System.out.println("O número " + input + " não foi encontrado");
		}


}

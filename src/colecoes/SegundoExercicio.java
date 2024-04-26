package colecoes;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class SegundoExercicio {

	public static void main(String[] args) {
		
		
		// ****************************************************************************************
		//Exercicio 2
//		Escreva um programa Java para criar uma Collection ArrayList de Objetos da Classe Wrapper 
//		Integer, inicializada com 10 valores inteiros. O programa deverá solicitar ao usuário, que 
//		ele digite via teclado 1 número inteiro e caso ele seja encontrado no ArrayList, exiba na 
//		tela a posição deste número na Collection. Caso o número não seja encontrado, ele deverá 
//		exibir na tela a mensagem: O número NN não foi encontrado!

		
		Scanner leia = new Scanner(System.in);
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		Random numerosAleatorio = new Random();
		
		for(int contador = 0; contador < 10; contador++) {
			
			int numero = numerosAleatorio.nextInt(15);
			
			if(numeros.indexOf(numero) > 0) {
				contador--;
				continue;
			}
			
			numeros.add(numero);
		}
		
		System.out.println("Escreva um número: ");
		
		int entrada = leia.nextInt();
		
		if(numeros.indexOf(entrada) > 0) {
			
			System.out.println("O numero " + entrada + " está localizado na posição: " + numeros.indexOf(entrada));
			
		}else {
			
			System.out.println("O numero " + entrada + " não foi encontrado!");
			
		}
		
		leia.close();
		

	}

}

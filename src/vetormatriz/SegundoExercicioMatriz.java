package vetormatriz;

import java.util.Arrays;
import java.util.Scanner;

public class SegundoExercicioMatriz {

	public static void main(String[] args) {
		//****************************************************************************************************
		// Exercicio 4
//		Elabore um algoritmo que leia as notas de uma classe com 10 participantes durante 4 bimestres de um ano. 
//		As 4 notas de cada participante serão armazenadas em uma linha de uma matriz de números reais, logo cada 
//		linha da matriz serão as notas de um participante. Em um vetor de números reais, armazene as médias de cada 
//		participante e exiba as médias de cada um na tela.
		
		Scanner leiaScanner = new Scanner(System.in);
		
		float matrizNotas[][] = new float[10][4];
		
		for(int contadorLinha = 0; contadorLinha < 10; contadorLinha++) {
			
			for(int contadorColuna = 0; contadorColuna < 4; contadorColuna++) {
				
				System.out.println("Escreve a nota " + (contadorColuna + 1) + " da criança " + (contadorLinha + 1));
				float nota = leiaScanner.nextFloat();
				
				matrizNotas[contadorLinha][contadorColuna] = nota;
			}
			
		}
		
		float vetorMediaNotas[] = new float[10];
		
		float soma = 0;
		
		float resultado = 0;
		
		for(int contadorLinha = 0; contadorLinha < 10; contadorLinha++) {
			
			for(int contadorColuna = 0; contadorColuna < 4; contadorColuna++) {
				
				soma += matrizNotas[contadorLinha][contadorColuna];
				
			}		
			
			vetorMediaNotas[contadorLinha] = soma/4;
			
			soma = 0;
			
		}
		
		System.out.println(Arrays.toString(vetorMediaNotas));
		
		leiaScanner.close();

	}

}

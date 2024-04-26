package vetormatriz;

import java.util.Scanner;

public class PrimeiroExercicioVetor {

	public static void main(String[] args) {
		//****************************************************************************************************
		// Exercicio1
		
//		Dado um vetor contendo 10 números inteiros não ordenados e não repetidos, construa 
//		um algoritmo que consiga pesquisar dados no vetor, onde o usuário irá digitar um 
//		número e o programa deve exibir na tela a posição deste número no vetor. Caso o número 
//		não seja encontrado, a mensagem: “Não foi encontrado!” deve ser exibida na tela. Veja 
//		os exemplos abaixo:

		Scanner leia = new Scanner(System.in);
		
		int arrayNum[] = {1,3,6,4,5,2};
		
		System.out.println("Digite o número que você deseja encontrar: ");
		
		int numeroPesquisar = leia.nextInt();
		
		int retornoParaUsuario = -1;
		
		for(int contador = 0; contador < arrayNum.length; contador++) {
			
			if(arrayNum[contador] == numeroPesquisar) {
				
				retornoParaUsuario = contador;
				break;
			}
		}
	
		if(retornoParaUsuario < 0) {
			
			System.out.println("O número " + numeroPesquisar +  " não foi encontrado!");
			return;
		}
		
		System.out.println("O número " + numeroPesquisar + " está localizado na posição: " + retornoParaUsuario);
		
			
		System.out.println(retornoParaUsuario);
		
		leia.close();

	}

}

package condicionais;

import java.util.Scanner;

public class TerceiroExercicio {

	public static void main(String[] args) {
		//******************************************************************************************************
		//Exercicio 3
//		Para doar sangue é necessário ter entre 18 e 69 anos de idade. Pessoas com idade entre 60 e 69 anos, só 
//		podem doar se não for a sua primeira doação. Escreva um Algoritmo em Java que obtenha via teclado o nome 
//		do doador (String), a idade (inteiro) do doador e se é a primeira doação (boolean). De acordo com as Regras
//		para a doação, mostre na tela se o doador está Apto ou Não Apto para doar sangue.
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o salário bruto: ");
		
		float salarioBruto = leia.nextFloat();
		
		leia.nextLine();
		
		System.out.println("Digite a adicional noturno: ");
		
		float adcBruto = leia.nextFloat();
		
		leia.nextLine();
		
		System.out.println("Digite as horas extras: ");
		
		float horasExtras = leia.nextFloat();
		
		leia.nextLine();
		
		System.out.println("Digite os descontos: ");
		
		float desconto = leia.nextFloat();
		
		leia.nextLine();
		

		float salarioLiquido = salarioBruto + adcBruto + (horasExtras * 5) - desconto;
		
		System.out.printf("Salário Liquido = %.2f", salarioLiquido);
		

	}

}

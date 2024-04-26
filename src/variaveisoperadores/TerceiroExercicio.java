package variaveisoperadores;

import java.util.Scanner;

public class TerceiroExercicio {

	public static void main(String[] args) {
		//Exercicio 3 - variaveis e operadores
		// Elabore um algoritmo em Java, que leia o Salário Bruto, o Adicional Noturno, 
//		as Horas Extras e os Descontos de um Colaborador, em variáveis do tipo float e 
//		exiba na tela o Salário Líquido. Veja o exemplo abaixo:
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite salario bruto: ");
		
		float salarioBruto = leia.nextFloat();
		
		leia.nextLine();

		System.out.println("Digite adicional noturno: ");
		
		float adicionalNoturno = leia.nextFloat();
		
		leia.nextLine();
		
		System.out.println("Digite horas extras: ");
		
		float horasExtras = leia.nextFloat();
		
		leia.nextLine();
		
		System.out.println("Digite descontos: ");
		
		float descontos  = leia.nextFloat();
		
		leia.nextLine();
		
		float media =  salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		
		System.out.printf("SALÁRIO LÍQUIDO =  %.2f", media);

	}

}

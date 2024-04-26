package lacosrepeticao;

import java.util.Scanner;

public class LacoSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Exercicio 1
		//Com base na tabela abaixo, escreva um algoritmo em Java que leia o código de um item (número inteiro de 1 a 6) e a
		//quantidade comprada deste item (número inteiro). A seguir, mostre na tela o valor total da conta e o nome do produto 
		//que foi comprado.

//		Scanner leia = new Scanner((System.in));
//		
//		System.out.println("*** Digite: 1 Cachorro Quente ***");
//		System.out.println("*** Digite: 2 X-Salada ***");
//		System.out.println("*** Digite: 3 X-Bacon ***");
//		System.out.println("*** Digite: 4 Bauru ***");
//		System.out.println("*** Digite: 5 Refrigerante ***");
//		System.out.println("*** Digite: 6 Suco de laranja ***");
//		System.out.println("Código do produto: ");
//		
//		
//		int codigoProduto = leia.nextInt();
//		
//		double precoProduto;
//		String produto = null;
//		
//		switch (codigoProduto) {
		
//		case 1:
		
//			precoProduto = 10.0;
//			produto = "Cachorro Quente";
//			break;
		
//		case 2:
		
//			precoProduto = 15.0;
//			produto = "X-Salada";
//			break;
		
//		case 3: 
		
//			precoProduto = 18.0;
//			produto = "X-Bacon";
//			break;
		
//		case 4: 
		
//			precoProduto = 12.0;
//			produto = "Bauru";
//			break;
		
//		case 5:
		
//			precoProduto = 8.0;
//			produto = "Refrigerante";
//			break;
		
//		case 6:
		
//			precoProduto = 13.0;
//			produto = "Suco de laranja";
//			break;
		
//		default:
		
//			precoProduto = 0.0;
//		}
//		
//		if(precoProduto == 0) {
//			System.out.println("Numero produto errado");
//			return;
//		}
//		
//		System.out.println("Quantidade de produto: ");
//		int quantidadeProduto = leia.nextInt();
//		
//		double resultado = quantidadeProduto * precoProduto;
//				
//		System.out.printf("Produto: %s\n Valor total: R$%.2f", produto, resultado);
//		
		
		
		//*********************************************************************************************************************
		
		//Exercicio 2
//		Com base na tabela abaixo, escreva um algoritmo em Java que leia o Nome do Colaborador (String), o Código do Cargo do 
//		Colaborador (número inteiro de 1 a 6) e o Salário (número float). A seguir, mostre na tela o Nome do Colaborador, o 
//		Cargo e o novo Salário reajustado.
		
		
//		Scanner leia = new Scanner((System.in));
//		
//		String nomeColaborador = null;
//		int codigoPosicaoColaborador;
//		String nomePosicaoColaborador = null;
//		float salario; 
//		float percentual;
//		
//		System.out.println("Escreva o nome do colaborador: ");
//		
//		nomeColaborador = leia.next();
//		
//		
//		
		
//		System.out.println("*** Digite: 1 Gerente ***");
//		System.out.println("*** Digite: 2 Vendedor ***");
//		System.out.println("*** Digite: 3 Supervisor ***");
//		System.out.println("*** Digite: 4 Motorista ***");
//		System.out.println("*** Digite: 5 Estoquista ***");
//		System.out.println("*** Digite: 6 Técnico em TI ***");
//		System.out.println("Cargo: ");
//		
//		
//		codigoPosicaoColaborador = leia.nextInt();
//		
//		switch (codigoPosicaoColaborador) {
//		case 1:
		
//			percentual = 1.10;
//			nomePosicaoColaborador = "Gerente";
//			break;
		
//		case 2:
		
//			percentual = 1.07;
//			nomePosicaoColaborador = "Vendedor";
//			break;
		
//		case 3: 
		
//			percentual = 1.09;
//			nomePosicaoColaborador = "Supervisor";
//			break;
		
//		case 4: 
		
//			percentual = 1.06;
//			nomePosicaoColaborador = "Motorista";
//			break;
		
//		case 5:
		
//			percentual = 1.05;
//			nomePosicaoColaborador = "Estoquista";
//			break;
		
//		case 6:
		
//			percentual = 1.08;
//			nomePosicaoColaborador = "Técnico em TI";
//			break;
		
//		default:
		
//			percentual = 0.0;
//		}
//		
//		if(percentual == 0.0) {
//			System.out.println("Código errado");
//			return;
//		}
//		
//		System.out.println("Salário: ");
//		salario = leia.nextFloat();
//		
//		double resultado = percentual * salario;
//		
//		System.out.printf("Nome do colaborador: %s\nCargo: %s\nSálario: %.2f", nomeColaborador, nomePosicaoColaborador, resultado);
		
		
		//******************************************************************************************************************************	
		//Exercicio 3
		
		//Com base na tabela abaixo, escreva um algoritmo em Java, que simule uma Calculadora simples. O programa deverá ler dois
		//números float: numero1 e numero2, e na sequência ler o Código da operação matemática (número inteiro de 1 a 4). A seguir,
		//mostre na tela o resultado da operação entre os 2 números. Caso a operação seja diferente do intervalo 1 a 4, mostre a
		//mensagem Operação Inválida!
		
		
		
//		 importar o método Scanner, para receber entrada de dados do usuário
//		Scanner leia = new Scanner(System.in);
//		
//		// declaração das variaveis que iremos usar no exemplo
//		int numero1, numero2, opcao, resultado;
//		
//		//solicitar a primeira entrada de dados do usuario
//		System.out.println("Por favor, ó grande usuário, digite o primeiro numero:");
//		numero1 = leia.nextInt();
//		
//		//solicitar a segunda entrada de dados do usuario
//		System.out.println("Por favor, ó grande usuário, digite o segundo numero:");
//		numero2 = leia.nextInt();
//		
//		System.out.println("Selecione uma opção:");
//       System.out.println("*** 1 - Somar os numeros ***");
//       System.out.println("*** 2 - Subtrair os numeros ***");
//       System.out.println("*** 3 - Multiplicar os numeros ***");
//       System.out.println("*** 4 - Dividir o primeiro pelo segundo ***");
//
//       //solicitar a escolha da opção
//       opcao = leia.nextInt();
//       
//       
//       // verificar qual opção foi selecionada, e direcionar para o caso especifico
//       switch(opcao) {
//       	case 1:
//       		resultado = numero1 + numero2;
//       		System.out.println("O resultado da soma é: " + resultado);
//       		// sempre dar um BREAK, para finalizar a execução do código
//       		break;
//   		
//       	case 2:
//       		if(numero1 > numero2) {
//       			resultado = numero1 - numero2;
//       			System.out.println("O resultado da subtração de N1 - N2 é: " + resultado);
//       		} else {
//       			resultado = numero2 - numero1;
//       			System.out.println("O resultado da subtração de N2 - N1 é: " + resultado);
//       		}
//       		break;
//       		
//       	case 3:
//       		resultado = numero1 * numero2;
//       		if(resultado % 2 == 0) {
//       			System.out.println("O resultado da multiplicação é: " + resultado + " e é um numero par");
//       		} else {
//       			System.out.println("O resultado da multiplicação é: " + resultado + " e é um numero impar");
//       		}
//       		
//       	case 4:
//       		resultado = numero1 / numero2;
//       		
//       		//O resultado da divisão não pode ser 0
//       		if(resultado < 1) {
//       			resultado = numero2 / numero1;
//       		}
//       		
//       		//Verifica se o número é real ou inteiro
//       		if(numero1 % numero2 == 0 || numero2 % numero2 == 0) {
//       			System.out.println("O resultado é um número real e o resultado arredondado é: " +  resultado);
//       			break;
//       		}
//       		
//       		System.out.println("O resultado é um número inteiro e o resultado é: " + resultado);
//       	
//       		break;
//       	default:
//       		System.out.println("Opção inválida!!!!!!!");
//       }
       
		
		//*****************************************************************************************************************
		
		//Exercício 4
		
//		Desenvolva um algoritmo em Java para uma conta bancária. O programa deverá ler o tipo de operação a ser realizada com 
//		base na tabela abaixo (número inteiro entre 1 e 3) e o valor a ser depositado ou sacado (somente nas opções 2 e 3). 
//		Considere que um saque só pode ser realizado caso haja saldo suficiente. Ao final de cada operação, exiba o novo Saldo 
//		na tela. A variável saldo (float), será inicializada com o valor de R$ 1000.00. Caso a operação seja diferente do intervalo
//		1 a 3, mostre a mensagem Operação Inválida!
		
		
		Scanner leia = new Scanner((System.in));
		
		int operacaoCaixa;
		String operacao = null;
		float saldoBancario = 1000.00f;
		float quantia;
		
		System.out.println("*** Digite: 1 Saldo ***");
		System.out.println("*** Digite: 2 Saque ***");
		System.out.println("*** Digite: 3 Deposito ***");
       
		operacaoCaixa = leia.nextInt();

		if(operacaoCaixa == 1) {
			System.out.println("Operação: Saldo\nSaldo: " + saldoBancario);
			return;
		}
		
		System.out.println("Valor: ");
		
		quantia = leia.nextFloat();				
		
		switch (operacaoCaixa) {
		
		case 1:
		
			operacao = "Saldo";
			break;
		
		case 2:
		
			operacao = "Saque";
			saldoBancario -= quantia;
			break;
		
		case 3: 
		
			operacao = "Depósito";
			saldoBancario += quantia;
			break;
			
		default:
			operacao = "Invalida";
			break;
}
		
		if(operacao.equalsIgnoreCase("invalida")) {
			System.out.println("Está operação é: " + operacao);
			return;
		}
		
		if(saldoBancario < 0) {
			System.out.println("Operação: Saque\nSaldo: insuficiente!!");
			return;
		}
		
		System.out.printf("Operação: %s\nSaldo: R$%.2f", operacao, saldoBancario);
		
		
	}

}

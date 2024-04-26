package estruturadados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PrimeiroExercicio {

	public static void main(String[] args) {
		//*********************************************************************************************
		//Exercicio 1
//		Escreva um programa Java contendo uma Collection Queue (Fila) de Objetos da Classe String, para 
//		organizar a ordem de chegada dos Clientes de um Banco. O programa deverá ter um Menu que aceitará 
//		as opções 0, 1, 2 e 3:
//			1: Adicionar um novo Cliente na fila. Deve solicitar o nome do Cliente.
//			2: Listar todos os Clientes na fila
//			3: Chamar (retirar) uma pessoa da fila 
//			0: O programa deve ser finalizado. 
//			Caso a fila esteja vazia, o programa deverá informar que a fila está vazia ao tentar retirar 
//			(chamar) um cliente da fila..
				
				
				Scanner leia = new Scanner(System.in);
				
				Queue<String> nomesQueue = new LinkedList<String>();
				
				int input;
				do {
					System.out.println("""            
					     	___________________________________________________
						   |          ***Clientes banco generation**           |
						   |             -----------------------               |
						   |    1 – Adicionar um novo Cliente na fila.         |
						   |    2 – Listar todos os Clientes na fila           |
						   |    3 – Chamar (retirar) uma pessoa da fila        |
						   |    0 – Sair                                       |   
						   |             -----------------------               |
						    ____________________________________________________
							
							""");
					System.out.println("Digite uma opção: ");
					
					input = leia.nextInt();
					leia.nextLine();
					
					if(input == 1) {
						System.out.println("Digite o nome: ");
						String inputnome = leia.next();
						
						nomesQueue.add(inputnome);
						
						System.out.println("Fila: ");
						
						for(String nome : nomesQueue) {
							System.out.println(nome);
						}
						
						System.out.println("Cliente adicionado!!");
						
					}else if (input == 2) {

						if(nomesQueue.isEmpty()) {
							System.out.println("A Fila está vazia! ");
							continue;
						}
						
						System.out.println("Lista de Clientes na Fila: ");
						
						for(String nome : nomesQueue) {
							System.out.println(nome);
						}
						
					} else if(input == 3){
						
						if(nomesQueue.isEmpty()) {
							System.out.println("A Fila está vazia! ");
							continue;
						}
						
						System.out.println("Fila: ");
						
						nomesQueue.poll();
						
						for(String nome : nomesQueue) {
							System.out.println(nome);
						}
						
						System.out.println("O Cliente foi Chamado! ");
						
					} else if(input > 3 || input < 0){
						
						System.out.println("Opção incorreta, digite um numero de 0 a 3");
					}
					
					
				} while(input != 0);
				
				System.out.println("Programa Finalizado!");
				
				
				
				
				
				

	}

}

package estruturadados;

import java.util.Scanner;
import java.util.Stack;

public class SegundoExercicio {

	public static void main(String[] args) {
		//Exercicio 2
//		Escreva um programa Java contendo uma Collection Stack (Pilha) de Objetos da Classe 
//		String, para organizar a retirada de livros em uma pilha. O programa deverá ter um Menu 
//		que aceitará as opções 0, 1, 2 e 3:
//		1: Adicionar um novo livro na pilha. Deve solicitar o nome do livro.
//		2: Listar todos os livros da Pilha
//		3: Retirar um livro da pilha 
//		0: O programa deve ser finalizado. 
//		Caso a pilha esteja vazia e o atendente tente retirar um livro da pilha, ele deverá 
//		informar que a pilha está vazia.
		
		Scanner leia = new Scanner(System.in);
		
		Stack<String> pilhaDeLivros = new Stack<String>();
		
		int input;
		
		do {
			
			System.out.println("""            
			     	___________________________________________________
				   |          ***Livros generation**                   |
				   |             -----------------------               |
				   |    1 – Adicionar livro na pilha.                  |
				   |    2 – Listar todos os livros                     |
				   |    3 – Retirar um livro da pilha                  |
				   |    0 – Sair                                       |   
				   |             -----------------------               |
				    ____________________________________________________
					
					""");
			
			System.out.println("Digite uma opção: ");
			
			input  = leia.nextInt();
			
			leia.nextLine();
			
			switch (input) {
			
			case 1:
				
				System.out.println("Digite o nome: ");
				
				String inputLivro = leia.nextLine();
				
				pilhaDeLivros.push(inputLivro);
				
				System.out.println("Pilha: ");
				
				for(String livro : pilhaDeLivros) {
					System.out.println(livro + "\n\n");
				}
				break;
				
			case 2:
				
				System.out.println("Pilha: ");
				
				for(String livro : pilhaDeLivros) {
					System.out.println(livro);
				}
				
				if(pilhaDeLivros.isEmpty()) {
					System.out.println("A Pilha está vazia!");
				}
				
				break;
				
			case 3 : 
				pilhaDeLivros.pop();
				
				for(String livro : pilhaDeLivros) {
					System.out.println(livro);
				}
				
				if(pilhaDeLivros.isEmpty()) {
					System.out.println("A Pilha está vazia!");
				}
				break;
				
			case 0:
				
				System.out.println("Programa Finalizado!");
				return;
				
			default:
				
				System.out.println("Escreve uma opção de 0 a 3 por favor!!!!");
				break;
			}	
			
			
		} while(input != 0);
		
	}

}

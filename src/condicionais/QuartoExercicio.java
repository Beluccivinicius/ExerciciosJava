package condicionais;

import java.util.Scanner;

public class QuartoExercicio {

	public static void main(String[] args) {
		//******************************************************************************************
		//Exercício 4
		
		//Escreva um algoritmo em Java, que leia 3 palavras (String), que definem as características de um tipo de animal possível segundo o 
		//diagrama abaixo, que deve ser lido da esquerda para a direita.
		
		Scanner leiaExercicio4 = new Scanner(System.in);
		
		String caracteristica1, caracteristica2, caracteristica3;
		
		System.out.println("Escreva vertebrado ou invertebrado: ");
		
		caracteristica1 = leiaExercicio4.next();
		
		//retorna se não escreveu vertebrado ou invertebrado
		if(!caracteristica1.equalsIgnoreCase("vertebrado") && !caracteristica1.equalsIgnoreCase("invertebrado")) {
			System.out.println("input errado");
			return;
		}
		
		//Próximas caracteristicas
		String proximaEtapa;
		String proximaEtapa2;
		
		if(caracteristica1.equalsIgnoreCase("invertebrado")) {
			proximaEtapa = "Inseto";
			proximaEtapa2 = "Anelideo";
			
		}else {
			proximaEtapa = "Ave";
			proximaEtapa2 = "Mamidero";
		}
		
		
		System.out.println("Escreva " + proximaEtapa + " ou " + proximaEtapa2);
		
		caracteristica2 = leiaExercicio4.next();
		
		//retorna se não escrever Inseto, Anelideo, Ave, Mamifero
		if(!caracteristica2.equalsIgnoreCase(proximaEtapa) && !caracteristica2.equalsIgnoreCase(proximaEtapa2)) {
			
			System.out.println("input errado");
			return;
		}
		
		//Vertebrado e Ave
		if(caracteristica1.equalsIgnoreCase("vertebrado") && caracteristica2.equalsIgnoreCase("ave")) {
			
			System.out.println("Escreva Carnivoro ou Onivoro");
			
			 caracteristica3 = leiaExercicio4.next();
			 
			if(caracteristica3.equalsIgnoreCase("Carnivoro")) {
				System.out.println("Águia");
				
			} else if(caracteristica3.equalsIgnoreCase("Onivoro")){
				System.out.println("Pomba");
				
			} 
			else {
				System.out.println("input errado");
			}
			
		}
		
		//Vertebrado e mamifero
		
		if(caracteristica1.equalsIgnoreCase("vertebrado") && caracteristica2.equalsIgnoreCase("mamifero")) {
			System.out.println("Escreva Herbivoro ou Onivoro");
			
			caracteristica3 = leiaExercicio4.next();
			
			if(caracteristica3.equalsIgnoreCase("Herbivoro")) {
				System.out.println("Vaca");
				
			}else if(caracteristica3.equalsIgnoreCase("Onivoro")){
				System.out.println("Homem");
				
			} else {
				System.out.println("input errado");
			}
		}
		
		//invertebrado e inseto
			
		if(caracteristica1.equalsIgnoreCase("Invertebrado") && caracteristica2.equalsIgnoreCase("Inseto")) {
			
			System.out.println("Escreva Hematofago ou Herbivoro");
			 caracteristica3 = leiaExercicio4.next();
			 
			if(caracteristica3.equalsIgnoreCase("Hematofago")) {
				System.out.println("Pulga");
				
			} else if(caracteristica3.equalsIgnoreCase("Herbivoro")){
				System.out.println("Lagarta");
				
			} 
			else {
				System.out.println("input errado");
			}
			
		}
		
		if(caracteristica1.equalsIgnoreCase("Invertebrado") && caracteristica2.equalsIgnoreCase("Anelideo")) {
			System.out.println("Escreva Herbivoro ou Onivoro");
			
			caracteristica3 = leiaExercicio4.next();
			
			if(caracteristica3.equalsIgnoreCase("Onivoro")) {
				System.out.println("Minhoca");
				
			}else if(caracteristica3.equalsIgnoreCase("Hematofago")){
				System.out.println("Sanguessuga");
			} 
			else {
				System.out.println("input errado");
			}
		}
		
		

	}

}

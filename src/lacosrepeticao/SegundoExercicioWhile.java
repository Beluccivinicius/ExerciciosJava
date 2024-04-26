package lacosrepeticao;

import java.util.Scanner;

public class SegundoExercicioWhile {

	public static void main(String[] args) {
		//***********************************************************************************************
				//Exercício 4 - loop While
				//Uma empresa desenvolveu uma pesquisa interna para conhecer os colaboradores da área de Desenvolvimento 
//				e precisam de um sistema para analisar os dados. Escreva um algoritmo em Java, que leia via teclado as 
//				seguintes informações de cada colaborador:
				
//				O número de pessoas desenvolvedoras Backend
//				O número de Mulheres Cis e Trans desenvolvedoras Frontend
//				O número de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos
//				O número de Não Binários desenvolvedores FullStack menores de 30 anos
//				O número total de pessoas que responderam à pesquisa
//				A média de idade das pessoas que responderam à pesquisa


				Scanner leia = new Scanner(System.in);
				
				int numeroDesenvolvedorBackend = 0;
				int mulherCisTransFrontend = 0;
				int homensCisTransMaior40 = 0;
				int naoBinariosFullStackMenor30 = 0;
				int totalPessoa = 0;
				int mediaIdade = 0;
				
				String continuar = "s";
				
				while(!continuar.equalsIgnoreCase("N")) {
					
					System.out.println("idade: ");
					
					int idade = leia.nextInt();
					
					System.out.println("""            
							
		                    ___________________________________________________
						   |           ***Identidade de gênero***              |
						   |             -----------------------               |
						   |    1 – Mulher Cis                                 |
						   |    2 – Homem Cis                                  |
						   |    3 – Não Binário                                |
						   |    4 – Mulher Trans                               |                
						   |    5 – Homem Trans                                |               
						   |    6 – Outros                                     |          
						   |             -----------------------               |
						    ____________________________________________________
							
							
							""");
					
					int identidadeGenero = leia.nextInt();
					
					
					System.out.println("""            
							
		                    ___________________________________________________
						   |            ***Pessoa Desenvolvedora***            |
						   |              -----------------------              |
						   |    1 – Backend                                    |
						   |    2 – Fronend                                    |
						   |    3 – Mobile                                     |
						   |    4 – FullStack                                  |        
						   |             -----------------------               |
						    ____________________________________________________
							""");
					
					int cargoEmpresa = leia.nextInt();
					
					
					if(identidadeGenero == 1 | identidadeGenero == 4 && cargoEmpresa == 2) {
						
						mulherCisTransFrontend++;
						
					}else if(identidadeGenero == 2 | identidadeGenero == 5 && cargoEmpresa == 3 && idade > 40) {
						
						homensCisTransMaior40++;
						
					}else if(identidadeGenero == 3 && cargoEmpresa == 4 && idade < 30) {
						
						naoBinariosFullStackMenor30++;
						
					}
					
					if(cargoEmpresa == 1) {
						
						numeroDesenvolvedorBackend++;
						
					}
					
					totalPessoa++;
					
					mediaIdade = mediaIdade + idade;
					
					
					leia.nextLine();
					
					System.out.println("deseja continuar a leitura dos dados de um novo colaborador ou não (S/N): ");
					
					continuar = leia.next();
					
				}
				
				float mediaIdadeFloat = mediaIdade/totalPessoa;
				
				System.out.println("Total de pessoas desenvolvedoras Backend: " + numeroDesenvolvedorBackend + 
						"\nTotal de Mulheres Cis e Trans desenvolvedoras Frontend: " + mulherCisTransFrontend +
						"\nTotal de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + homensCisTransMaior40 + 
						"\nTotal de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: " + naoBinariosFullStackMenor30 +
						"\nO número total de pessoas que responderam à pesquisa: " + totalPessoa +
						"\nA média de idade das pessoas que responderam à pesquisa: " + mediaIdadeFloat
						);
				
				leia.close();

	}

}

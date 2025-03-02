package ExerciciosFixacao;

import java.util.Scanner;

public class ListaDeExercicios2 {

	public static void main(String[] args) {
		
		//EXERCICIO 1
		Scanner sc = new Scanner(System.in);
		int x;
		
		System.out.println("Digite um número abaixo:");
		x = sc.nextInt();
		
		System.out.println("");
		if (x < 0) {
			System.out.println("O número escolhido é negativo");
		}
		else {
			System.out.println("O número escolhido é positivo");
		}
		
				System.out.println("");
				System.out.println("");
				
				
		//EXERCICIO 2
		int y = sc.nextInt();
			    
		System.out.println("Digite um valor abaixo:");
				
		System.out.println("");
		if (y % 2 == 0) {
			System.out.println("Par");
		}
		else {
			System.out.println("Ímpar");
		}
				
				System.out.println("");
				System.out.println("");
				
				
		//EXERCICIO 3
		System.out.println("Digite dois valores, um abaixo do outro:");
		int z = sc.nextInt();
		sc.nextLine();
		int j = sc.nextInt(); 
				
		System.out.println("");
		if (z % j == 0 || j % z == 0) {
			System.out.println("São múltiplos");
		}
		else {
			System.out.println("Não são múltiplos");
		}
				
				System.out.println("");
				System.out.println("");	
				
				
		//EXERCICIO 4
		System.out.println("Qual horário iniciou o jogo?");
		int horainicio = sc.nextInt();
				
			System.out.println("");
				
		System.out.println("Qual horário terminou o jogo?");
		int horafim = sc.nextInt();
				
		int calculo;
		if (horainicio < horafim) {
			calculo = Math.abs(horainicio - horafim);
		}
		else {
			calculo = Math.abs(24 - (horainicio - horafim));
		}
					
			System.out.println("");
				
		System.out.println("O jogo durou " + calculo + " hora(s)");
		
				System.out.println("");
				System.out.println("");	
				
				
		//EXERCICIO 5
				
				
				
		
		sc.close();
	}

}

package ExerciciosDeAprendizado;

import java.util.Scanner;

public class Exemplo5 {

	public static void main(String[] args) {
		
		//EXPRESSÕES CONDICIONAIS IF-ELSE:
		Scanner sc = new Scanner(System.in);
		int hora;
		
		System.out.println("Que horas são?");
		hora = sc.nextInt();
		
		System.out.println("");
		if (hora < 12) {
			System.out.println("Bom dia!");
		}
		else if (hora < 18) {
			System.out.println("Boa tarde!");
		}
		else {
			System.out.println("Boa noite!");
		}
		
				
		sc.close();
	}

}

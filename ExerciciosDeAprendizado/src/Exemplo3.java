package ExerciciosDeAprendizado;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo3 {

	public static void main(String[] args) {
		
		//Entrada de Dados:
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
			String x;
			int y;
			double z;
		
				x = sc.nextLine();
				y = sc.nextInt();
				sc.nextLine();
				z = sc.nextDouble();
				sc.nextLine();
		
				System.out.println("Você digitou: ");
				System.out.println(x);
				System.out.println(y);
				System.out.println(z);
		
		
		sc.close();
	}

}
package ExerciciosFixacao;

import java.util.Locale;

public class Exercicio1 {

	public static void main(String[] args) {
	
		String product1 = "Computer";
		String product2 = "Office desk";
			System.out.println("Products:");
			System.out.println(product1 + ", which price is $2100,00");
			System.out.println(product2 + ", which price is $650,50");
			
		System.out.println("");
	
		int age = 30;
		int code = 5290;
		char gender = 'F';
			System.out.printf("Record: %d years old, code %d and gender: %s %n", age, code, gender);
			
			System.out.println("");
			
		double measure = 53.234567;
			System.out.printf("Measue with eight decimal places: %.8f%n", measure);
			System.out.printf("Rounded (three decimal places): %.3f%n", measure);
			Locale.setDefault(Locale.US);
			System.out.printf("US decimal point: %.3f%n", measure);
			
	}

}

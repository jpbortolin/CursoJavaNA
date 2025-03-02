package ExerciciosDeAprendizado;

import java.util.Locale;

public class Exemplo1 {

	public static void main(String[] args) {
		
		//Declarando variáveis
		int y = 32;
		double x = 10.35784;
		
		System.out.println(y);
		System.out.println("Bom dia!");
		
		
		//Tipos de variáveis decimais
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		
		//Comando para colocar "." como separador ao invés da ","
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		
		//Concatenar elementos/palavras/variáveis
		System.out.println("Resultado = " + y + " Metros");
		System.out.printf("Resultado = %.2f metros%n", x);
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		
		System.out.printf("%s tem %d anos e ganha R$%.2f%n", nome, idade, renda);
					//ou
		System.out.printf("%s tem %d anos e ganha %.2f reais%n", nome, idade, renda);
	}

}

package ExerciciosFixacao;

import java.util.Locale;
import java.util.Scanner;

public class ListaDeExercicios1 {

	public static void main(String[] args) {
		
		//EXERCICIO 1
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*EXERCICIO 1*");
		int a, b, soma;
		
		System.out.println("");
		System.out.println("Digite abaixo um valor: ");
			a = sc.nextInt();
			sc.nextLine();
			System.out.println("");
			
		System.out.println("Digite abaixo um outro valor: ");	
			b = sc.nextInt();
			sc.nextLine();
			System.out.println("");
			
			soma = a + b;
			
			System.out.println("Soma = " + soma);
			
				System.out.println("");
				System.out.println("");
				System.out.println("");
			
		//EXERCICIO 2
		System.out.println("*EXERCICIO 2*");
		double raio, resultado;
		
		System.out.println("");
		System.out.println("Digite abaixo o valor do raio: ");
			raio = sc.nextDouble();
			sc.nextLine();
			
			resultado = 3.14159 * Math.pow(raio, 2.0);
			
			System.out.printf("O resultado é = %.4f%n", resultado);
			
				System.out.println("");
				System.out.println("");
				System.out.println("");
				
		//EXERCICIO 3
		System.out.println("*EXERCICIO 3*");
		int c, d, e, f, diferenca;
		
		System.out.println("");
		System.out.println("Digite o primeiro valor: ");
			c = sc.nextInt();
			sc.nextLine();
			System.out.println("");
					
		System.out.println("Digite o segundo valor: ");
			d = sc.nextInt();
			sc.nextLine();
			System.out.println("");
				
		System.out.println("Digite o terceiro valor: ");
			e = sc.nextInt();
			sc.nextLine();
			System.out.println("");
					
		System.out.println("Digite o quarto valor: ");
			f = sc.nextInt();
			sc.nextLine();
			System.out.println("");
					
			diferenca = c * d - e * f;
					
			System.out.println("A diferença do produto dos valores é = " + diferenca);
				
				System.out.println("");
				System.out.println("");
				System.out.println("");
				
		//EXERCICIO 4
		System.out.println("*EXERCICIO 4*");
		int number, hour;
		double salary, calculation;
		
		System.out.println("");
		System.out.println("What is the employee number?: ");
			number = sc.nextInt();
			sc.nextLine();
			System.out.println("");

		System.out.println("How many hours did he work?: ");
			hour = sc.nextInt();
			sc.nextLine();
			System.out.println("");
					
		System.out.println("And your salary?: ");
			salary = sc.nextDouble();
			sc.nextLine();
			System.out.println("");
					
			calculation = hour * salary;
					
			System.out.println("He's the number: " + number);
			System.out.printf("Your monthly salary is: U$ %.2f%n", calculation);
			
				System.out.println("");
				System.out.println("");
				System.out.println("");
				
				
		//EXERCICIO 5
		System.out.println("*EXERCICIO 5*");
		int cod1, n1, cod2, n2;
		double valor1, valor2, valortotal;
		
		System.out.println("");
		System.out.println("Digite abaixo, respectivamente, o código da peça 1, o número de peças 1 e o valor de cada peça 1: ");
			cod1 = sc.nextInt();
			n1 = sc.nextInt();
			valor1 = sc.nextDouble();
			System.out.println("");
					
		System.out.println("Digite abaixo, respectivamente, o código da peça 2, o número de peças 2 e o valor de cada peça 2: ");
			cod2 = sc.nextInt();
			n2 = sc.nextInt();
			valor2 = sc.nextDouble();
			System.out.println("");
					
			valortotal = n1 * valor1 + n2 * valor2;
					
			System.out.printf("Valor a pagar: R$ %.2f%n", valortotal);
			
				System.out.println("");
				System.out.println("");
				System.out.println("");
				
		//EXERCICIO 6
		System.out.println("*EXERCICIO 6*");
		double valorA, valorB, valorC, aTriang, aCirc, aTrap, aQuad, aRetang;
		
		System.out.println("");
		System.out.println("Digite os valores abaixo de A, B e C, respectivamente: ");
			valorA = sc.nextDouble();
			valorB = sc.nextDouble();
			valorC = sc.nextDouble();
			
			aTriang = (valorA * valorC) / 2;
			aCirc = 3.14159 * Math.pow(valorC, 2.0);
			aTrap = ((valorA + valorB) * valorC) / 2;
			aQuad = valorB * 4;
			aRetang = valorA * valorB;
			
			System.out.println("");
			System.out.printf("TRIÂNGULO: %.3f%n", aTriang);
			System.out.printf("CÍRCULO: %.3f%n", aCirc);
			System.out.printf("TRAPÉZIO: %.3f%n", aTrap);
			System.out.printf("QUADRADO: %.3f%n", aQuad);
			System.out.printf("RETÂNGULO: %.3f%n", aRetang);
			

		sc.close();
	}

}

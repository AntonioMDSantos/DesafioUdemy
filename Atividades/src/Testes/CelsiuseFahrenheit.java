package Testes;

import java.util.Scanner;

public class CelsiuseFahrenheit {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		//Fahrenheit
		int sub = 32;
		double div = 5.0 /9.0;
		//Celsius
		double mul = 9.0 / 5.0;
		
		
		System.out.println("Digite um valor em Fahrenheit: ");
		double f = entrada.nextDouble();
		
		double result = (f - sub) * div;
		
		System.out.printf("O valor em Celsius é %.2f:\n ", result);
		
		
		System.out.println("Digite um valor em Celsius: ");
		double c = entrada.nextDouble();
		
		double resultc = (c * mul) + sub;
		
		System.out.printf("O valor em Fahrenheit é %.2f: ", resultc);
		
		entrada.close();
		
		
		
	}
}

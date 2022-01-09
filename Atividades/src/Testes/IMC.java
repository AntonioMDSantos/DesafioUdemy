package Testes;

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite o seu peso: ");
		double peso = entrada.nextDouble();
		
		System.out.println("Digite sua altura: ");
		double altura = entrada.nextDouble();
		
		
		double alt = Math.pow(altura, 2);
		double result = peso / alt;
		
		System.out.println(result);
		
		boolean adp = result <= 18.5;
		boolean pi = result >= 18.6 && result <= 24.9;
		boolean ladp = result >= 25 && result <= 29.9;
		boolean ogi = result >= 30 && result <= 34.9;
		boolean ogii = result >= 35 && result <= 39.9;
		boolean oii = result >= 40;
		
		System.out.println("Abaixo do peso: " + adp);
		System.out.println("Peso Ideal: " + pi);
		System.out.println("Levemente acima do peso: " + ladp);
		System.out.println("Obesidade grau 1: " + ogi);
		System.out.println("Obesidade grau 2(severa): " + ogii);
		System.out.println("Obesidade 3 (mórbida): " + oii);
		
		entrada.close();
		
	}
}

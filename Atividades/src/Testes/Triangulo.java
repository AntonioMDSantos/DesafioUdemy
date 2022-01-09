package Testes;

import java.util.Scanner;

public class Triangulo {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor da base em cm: ");
		double base = entrada.nextDouble();
		
		System.out.println("Digite o valor da altura em cm: ");
		double altura = entrada.nextDouble();
		
		
		double area = (base * altura) / 2;
		
		System.out.println("A Area desse triangulo é de " + area + "cm²");
		
		
		
		entrada.close();
	}

}

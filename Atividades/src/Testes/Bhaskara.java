package Testes;

import java.util.Scanner;

public class Bhaskara {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um valor para a: ");
		int a = entrada.nextInt();
		
		System.out.println("Digite um valor para b: ");
		int b = entrada.nextInt();
		
		System.out.println("Digite um valor para c: ");
		int c = entrada.nextInt();
		
		double quadrado = Math.pow(b, 2);
		
		double delta = quadrado - 4 * a * c;
		
		System.out.println("O delta é: " + delta);
		
		entrada.close();
		
	}

}

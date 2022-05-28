package application;

import java.util.Scanner;

public class Problema_Ciculos {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		double raio;
		
		System.out.println("Digite o valor do raio do circulo: ");
			raio = scan.nextDouble();
		scan.close();

		
		System.out.printf("\nAREA = %.3f", (Math.PI * Math.pow(raio,2)) );
	}

}
package application;

import java.util.Scanner;

public class Problema_Consumo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int distancia;
		double combustivel;
		
		System.out.println("Distancia percorrida: ");
			distancia = scan.nextInt();
		System.out.println("Combustível gasto: ");
			combustivel = scan.nextDouble();
		scan.close();
		
		System.out.printf("Consumo medio = %.3f", distancia / combustivel);
	}

}
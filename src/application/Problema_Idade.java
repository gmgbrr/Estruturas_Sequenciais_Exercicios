package application;

import java.util.Scanner;

public class Problema_Idade {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String nome[] = new String[2];
		double idade[] = new double[2];
		
		
		System.out.println("Insira os dados da primeira pessoa: ");
			System.out.println("\nNome: ");	
				nome[0] = scan.nextLine();
			System.out.println("Idade: ");
				idade[0] = scan.nextDouble();
				
		System.out.println("\nInsira os dados da segunda pessoa: ");		
			System.out.println("\nNome: ");	
				nome[1] = scan.nextLine();
					nome[1] += scan.nextLine();
			System.out.println("Idade: ");
				idade[1] = scan.nextDouble();
		scan.close();					
		
		System.out.printf("\nA idade média de %s e %s é de %.1f anos", nome[0], nome[1], (idade[1] + idade[0]) / 2);
	}

}
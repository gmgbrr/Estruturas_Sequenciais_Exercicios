package application;

import java.util.Scanner;

public class Problema_Terreno {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double medidas[] = new double[2], valorM2, areaTerreno, precoTerreno;
		
		System.out.println("Digite a largura do terreno: ");
			medidas[0] = scan.nextDouble();
			
		System.out.println("\nDigite o comprimento do terreno: ");
			medidas[1] = scan.nextDouble();
			
		System.out.println("\nDigite o valor do metro quadrado: ");
			valorM2 = scan.nextDouble();
		scan.close();
			
		areaTerreno = medidas[0] * medidas[1];
		precoTerreno = areaTerreno * valorM2;
		
			System.out.printf("\nArea do terreno = %.2f", areaTerreno);
			System.out.printf("\nPreco do terreno = %.2f", precoTerreno);
			
	}

}

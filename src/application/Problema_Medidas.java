package application;

import java.util.Scanner;

public class Problema_Medidas {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		double medida[] = new double[3];
		
		System.out.println("Digite a medida A: ");
		 	medida[0] = scan.nextDouble();
		System.out.println("Digite a medida B: ");
			medida[1] = scan.nextDouble();
		System.out.println("Digite a medida B: ");
		 	medida[2] = scan.nextDouble();
		 scan.close();
		 	
		System.out.printf("\nAREA DO QUADRADO = %.4f", Math.pow(medida[0], 2));
		 System.out.printf("\nAREA DO TRIANGULO = %.4f", (medida[0] * medida[1]) / 2);	
		  System.out.printf("\nAREA DO TRAPEZIO = %.4f", (medida[0] + medida[1]) * medida[2] / 2); 	
	}

}
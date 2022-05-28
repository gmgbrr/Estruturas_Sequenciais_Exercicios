package application;

import java.util.Scanner;

public class Problema_Retangulo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);		
		double medidas[] = new double[2], areaRet, perimetroRet, diagonalRet;
		
		
		System.out.println("Digite a base do retângulo: ");
			medidas[0] = scan.nextDouble();
			
		System.out.println("Digite a altura do retângulo: ");
			medidas[1] = scan.nextDouble();
		scan.close();
				
		areaRet = medidas[0] * medidas[1];
		perimetroRet = medidas[0] * 2 + medidas[1] * 2;
		diagonalRet = Math.sqrt(Math.pow(medidas[0],2) + Math.pow(medidas[1],2));
		
		System.out.printf("\nAREA = %.4f", areaRet);
		System.out.printf("\nPERIMETRO = %.4f", perimetroRet);
		System.out.printf("\nDIAGONAL = %.4f", diagonalRet);	
	}

}

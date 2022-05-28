package application;

import java.util.Scanner;

public class Problema_Soma {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int valor[] = new int[2];
		
		System.out.println("Digite o valor de x: ");
			valor[0] = scan.nextInt();	
		System.out.println("Digite o valor de y: ");
			valor[1] = scan.nextInt();
		scan.close();
			
		System.out.println("SOMA = " + (valor[0] + valor[1]));
		
		

	}

}

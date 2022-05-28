package application;

import java.util.Scanner;

public class Problema_Duracao {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int horas[] = new int[3], duracaoSec;
		
		System.out.println("Digite a duracao em segundo: ");
			duracaoSec = scan.nextInt();
		 scan.close();
		 
		 
		horas[0] = duracaoSec / 3600;
		 horas[1] = (duracaoSec % 3600) / 60;
		  horas[2] = (duracaoSec % 3600) % 60;
		
		System.out.printf("%d:%d:%d", horas[0], horas[1], horas[2]);
	}

}

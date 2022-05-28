package application;

import java.util.Scanner;

public class Problema_Pagamento {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String nome;
		double valorHora;
		int horasTrabalhadas;
		
		System.out.println("Nome: ");
			nome = scan.nextLine();
		System.out.println("Valor por hora: ");
			valorHora = scan.nextDouble();
		System.out.println("Horas trabalhadas: ");
			horasTrabalhadas = scan.nextInt();
		scan.close();
		
		System.out.printf("\nO pagamento para %s deve ser de R$%.2f", nome, valorHora * horasTrabalhadas);
	}

}
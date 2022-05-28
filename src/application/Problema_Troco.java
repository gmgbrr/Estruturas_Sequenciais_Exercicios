package application;

import java.util.Scanner;

public class Problema_Troco {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double preco, pagamento;
		int quantidade;
		
		System.out.println("Preço unitário do produto: ");
			preco = scan.nextDouble();
		System.out.println("Quantidade comprada: ");
			quantidade = scan.nextInt();
		System.out.println("Dinheiro recebido: ");
			pagamento = scan.nextDouble();
		scan.close();
			
		System.out.printf("\nTROCO = R$%.2f", pagamento - (preco * quantidade));	
	}

}
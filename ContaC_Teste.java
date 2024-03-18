package atividades_poo;

import java.util.Scanner;

public class ContaC_Teste {

	public static void main(String[] args) {
		
		ContaCorrente cc1 = new ContaCorrente(12345, "João da Silva", 0);
		cc1.exibir();
		
		ContaCorrente cc2 = new ContaCorrente(54321, "Mariana", 500);
		cc2.exibir();
	
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Depósito: ");
		cc1.deposito(reader.nextDouble());
		cc1.exibir();
		
		System.out.print("Saque: ");
		cc2.saque(reader.nextDouble());
		cc2.exibir();
	}
}

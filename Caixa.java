package atividades_poo;

import java.util.Scanner;

/*
 * Um comerciante precisa informatizar o caixa de sua loja. Codifique um programa que:
 * Leia uma série de valores correspondendo aos preços das mercadorias compradas por um cliente
 * (o valor zero finaliza a entrada);
 * Calcule o valor total;
 * 
 * Aplique o desconto conforme tabela abaixo:
 * - n < R$50,00 	= 5%
 * - n até R$100,00 = 10%
 * - n até R$200,00 = 15%
 * - n > R$200,00	= 20%
 * 
 * Mostre o valor a ser pago
 */

public class Caixa {

	public static void main(String[] args) {
		
		double n, sum = 0;
		Scanner reader = new Scanner(System.in);
		
		do {
			System.out.print("R$ ");
			n = reader.nextDouble();
			sum += n;
		} while(n != 0);
		
		if(sum < 50) {
			sum -= sum * 0.05;
		}
		else if(sum <= 100) {
			sum -= sum * 0.10;
		}		
		else if(sum <= 200) {
			sum *= 0.85;
		}
		else {
			sum *= 0.80; 
		}
		
		System.out.printf("Valor a ser pago R$%.2f", sum);
	}

}

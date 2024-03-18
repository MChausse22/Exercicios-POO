package atividades_poo;

import java.util.Scanner;

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

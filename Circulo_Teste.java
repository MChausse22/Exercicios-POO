package atividades_poo;

import java.util.Scanner;

public class Circulo_Teste {

	public static void main(String[] args) {
		
		double n;
		
		Scanner reader = new Scanner(System.in);
		System.out.print("Raio = ");
		n = reader.nextDouble();
		
		Circulo c1 = new Circulo(n);
	}

}

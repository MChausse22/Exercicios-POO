package atividades_poo;

import java.util.Scanner;

public class Temperaturas {
   
   public static void main(String[] args){
     System.out.println("CONVERSOR DE TEMPERATURAS");
     System.out.println("=============================\n");
     
     double f, c;     
     Scanner read = new Scanner(System.in);
      
     System.out.print("Fahrenheit: ");
     f = read.nextDouble();
     
     c = (f-32) * 5/9;
     System.out.printf("Celsius: %.2f°C", c);
   }
}

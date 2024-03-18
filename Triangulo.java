package atividades_poo;

import java.util.Scanner;

public class Triangulo {

   public static void main(String[] args){
   
      System.out.println("ATIVIDADE 04 - TRIANGULO");
      System.out.println("========================");
      
      Scanner reader = new Scanner(System.in);
      double a, b, c;
      
      System.out.print("A = ");
      a = reader.nextDouble();
      
      System.out.print("B = ");
      b = reader.nextDouble();
      
      System.out.print ("C = ");
      c = reader.nextDouble();
      
      //Condição de triângulo
      if(a + b > c && b + c > a && c + a > b){
         
         //Triângulo Equiátero
         if(a == b && b == c){
            System.out.println("Triangulo Equilatero");
         } 
         //Triângulo Isóceles
         else if(a == b || b == c || c == a){
            System.out.println("Triangulo Isoceles");
         }
         //Triângulo Escaleno
         else {
            System.out.println("Triangulo Escaleno");
         }
      }
      else {
         System.out.println("Nao e um triangulo");
      }
   }
}
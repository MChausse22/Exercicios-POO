package atividades_poo;

import java.util.Scanner;

public class ContaBancaria {
   public static void main(String[] args){
      
      System.out.println("CONTA BANC�RIA");
      System.out.println("==============");
      
      Scanner reader = new Scanner(System.in);
      
      int n, s=0, d, cb;
      
      System.out.print("Conta bancaria: ");
      n = reader.nextInt();
      cb = n;
      
      while(n != 0){
         s += n % 10;
         n /= 10;
      }            
      
      d = s % 10;
      
      System.out.printf("R = %06d-%d", cb, d);
   }
}
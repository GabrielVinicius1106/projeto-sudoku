package Aulas;

import java.util.Scanner;

public class Numerosprimos {
    
    public static void main(String[] args){
        int inicio, fim, primo = 0;

        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Insira o valor de INÍCIO -> ");
        inicio = entrada.nextInt();
        System.out.print("Insira o valor FINAL -> ");
        fim = entrada.nextInt();

        for (int i = inicio; i <= fim; i++){
            for(int j = 1; j <= i; j++ ){
                if (i % j == 0){
                    primo++;
                }
              }
              if (primo == 2){
                  System.out.println("O número " + i + " é PRIMO");

              }
              primo = 0;
            }
            entrada.close();       
        
        }

        
    }




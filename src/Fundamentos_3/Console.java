
package Fundamentos_3;

import java.util.Scanner;


public class Console {
    public static void main(String[] args) {
        
        System.out.print("Bom");
        System.out.print(" Dia");
        
        System.out.println(" \nBom");
        System.out.println("Dia");
        
        System.out.printf("Resultado da Telesena: 10, 20, 30, 40, 50, 60\n");
        System.out.printf("Salário: %.1f%n", 12345.678);
        System.out.printf("Nome: %s%n", "André");
        
        
        Scanner entrada= new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();
        
        System.out.print("Digite seu sobrenome: "); 
        String sobrenome = entrada.nextLine();
        
        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();
        
        System.out.printf("A funcionário %s %s tem %d anos de idade.\n",nome, sobrenome, idade );
        
        entrada.close();
        
        
                
    }    
               
}
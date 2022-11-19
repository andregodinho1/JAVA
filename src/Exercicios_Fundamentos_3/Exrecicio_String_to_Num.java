package Exercicios_Fundamentos_3;

import java.util.Scanner;

public class Exrecicio_String_to_Num {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Infomre a primeira nota");
        String valor1 = entrada.next();
        
        System.out.println("Informe a segunda nota");
        String valor2 = entrada.next();
        
        double nota1 = Double.parseDouble(valor1);
        double nota2 = Double.parseDouble(valor2);
        
        double media = (nota1 + nota2)/2;
        
        System.out.println("A média das notas é: " + media);
        
        entrada.close();       
                
    }
    
}

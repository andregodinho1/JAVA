package Desafios_Classes_Metodos;

import java.util.Locale;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner entrada = new Scanner(System.in)) {
            float A = entrada.nextFloat();
            float B = entrada.nextFloat();
            
            double AX = (A * 3.5);
            double BX = (B * 7.5);
            double M = (AX + BX)/11;
            
            
            System.out.printf("MEDIA = %.5f", M);
            
            entrada.close();
                    
        }
   
    }
} 
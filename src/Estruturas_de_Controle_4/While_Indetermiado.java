package Estruturas_de_Controle_4;

import java.util.Scanner;

public class While_Indetermiado {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
            String valor = "";

            while(!valor.equalsIgnoreCase("Paysandu")) {  //|| paysandu!valor.equalsIgnoreCase("Papão")) {
            System.out.println("Qual o melhor time do Norte??");
            valor = entrada.nextLine();
            }
            entrada.close();
            
            
    }
}




package Secao2_Est_de_Controle;

import java.util.Scanner;

public class Do_While {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String texto = "";

        do {
            System.out.println("Você precisa falar as palavras mágicas");
            System.out.println("Você quer sair??");
            texto = entrada.nextLine();
        } while (!texto.equalsIgnoreCase("por favor"));
        System.out.println("Obrigado!!");

        entrada.close();

    }
}

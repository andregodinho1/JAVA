package Estruturas_de_Controle_4;

import java.util.Scanner;

public class If {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        {

            System.out.println("Informe a média");
            double media = entrada.nextDouble();

            if (media <= 10 && media >= 7.0) {
                System.out.println("Aprovado");
                System.out.println("Parabéns!!!");
            }

            if (media >= 4.0 && media < 7.0) {
                System.out.println("Em recuperação");
                boolean criterio_de_rec_atingido = media >= 4.0 && media < 7.0;

                if (criterio_de_rec_atingido) {
                    System.out.println("Critério de recuperação atingido, Em recuperação!");
                }

                if (media < 4.0) {
                    System.out.println("Reprovado");
                }
            }

        }
    }
}

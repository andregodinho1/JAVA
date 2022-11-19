package Exercícios_Est_Controle_4;

import java.util.Scanner;

public class DEsafio_While {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int qtd_notas = 0;
        double nota = 0;
        double total = 0;

        while (nota != -1 && qtd_notas <3) {
            System.out.println("Digite uma nota ou (-1) para sair. ");
            nota = entrada.nextDouble();

            if (nota >= 0 && nota <= 10) {
                total += nota;
                qtd_notas++;
            } else if (nota != -1) {
                System.out.println("Nota inválida");
            }
        }
        //CÁLCULO DA MÉDIA
        double media = (total/qtd_notas);
        System.out.println("Média: " + media);
    }
}

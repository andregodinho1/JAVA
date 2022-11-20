package Secao2_Est_de_Controle;

import java.util.Scanner;

public class If_Else_If {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a nota do aluno: ");

        double nota = entrada.nextDouble();

        if (nota < 0 || nota > 10) {
            System.out.println("Notas Inválidas, digite novamente! ");
        } else if (nota >= 8) {
            System.out.println("Conceito A, Parabéns! ");
        } else if (nota >= 6) {
            System.out.println("Conceito B ");
        } else if (nota >= 4) {
            System.out.println("Conceito C ");
        } else if (nota >= 2) {
            System.out.println("Conceito D");
        } else if (nota < 2) {
            System.out.println("Conceito E");
        } 
        
    }
    }


 
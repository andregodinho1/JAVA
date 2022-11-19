package Arrays_6;

import java.util.Arrays;
import java.util.Scanner;

public class Desafio_Array {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //UM SCANNER É O SUFICIENTE PARA TODO O CÓDIGO
        
        

        System.out.println("Qual a quantidade de notas?? ");
        int qtd_notas = entrada.nextInt();

        double[] notas_alunos = new double[qtd_notas];

        for (int i = 0; i < notas_alunos.length; i++) {
            System.out.println("Digite a nota do aluno " + (i + 1) + ": ");
            notas_alunos[i] = entrada.nextDouble();// VALOR DE ENTRADA ARMAZENADO NO ARRAY ATRAVÉS DOS COLCHETES
        }
        System.out.println(Arrays.toString(notas_alunos));

        double total = 0;
        for (double nota : notas_alunos) {
            total += nota;
        }

        double media = total / qtd_notas;
        System.out.println("Média: " + media + " !!");

        entrada.close();
    }

    }




package Secao4_Arrays;

import java.util.Arrays;

public class Exercicios_array {

    public static void main(String[] args) {

        double[] notas_alunoA = new double[4];
        System.out.println(Arrays.toString(notas_alunoA));

        notas_alunoA[0] = 8;
        notas_alunoA[1] = 7.5;
        notas_alunoA[2] = 6.9;
        notas_alunoA[3] = 8.9;

        System.out.println(Arrays.toString(notas_alunoA));

        double total_aluno_A = 0;
        for (int i = 0; i < notas_alunoA.length; i++) {
            total_aluno_A += notas_alunoA[i];
        }
        System.out.println("Média alunos A: " + total_aluno_A / notas_alunoA.length);
        double nota_aramazenada = 7.8;
        double[] notas_AlunoB = {7, 8.8, 7.4, nota_aramazenada, 5.9};

        double total_aluno_B = 0;
        for (int i = 0; i < notas_AlunoB.length; i++) {
            total_aluno_B += notas_AlunoB[i];
        }
        System.out.println("Média alunos B: " + total_aluno_B / notas_AlunoB.length);
    }
}




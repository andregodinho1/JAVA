package Secao4_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual a quantidade de aluno");
        int qtd_aluno = entrada.nextInt();

        System.out.println("Qual a quantidade de notas por aluno");
        int qtd_notas = entrada.nextInt();

        double[][] notas_da_turma = new double[qtd_aluno][qtd_notas]; //USA-SE DOIS COLCHETES PARA DUAS DIMENSÕES DA MATRIZ
        //'ALUNO' = LINHAS E 'NOTAS POR ALUNO' = COLUNAS

        double total = 0;
        for (int a = 0; a < notas_da_turma.length; a++) {
            for (int n = 0; n < notas_da_turma.length; n++) {
                System.out.printf("Informe a nota %d do aluno %d: ", n + 1, a + 1);
                notas_da_turma[a][n] = entrada.nextDouble();
                total += notas_da_turma[a][n];
            }
        }

        double media = total/(qtd_aluno * qtd_notas);
        System.out.println("A média da turma é: " + media);
        
        for(double[] notas_aluno: notas_da_turma){
            System.out.println(Arrays.toString(notas_aluno));
        }
        
        entrada.close();
    }

}

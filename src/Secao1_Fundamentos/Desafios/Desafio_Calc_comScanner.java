package Secao1_Fundamentos.Desafios;

import java.util.Scanner;

public class Desafio_Calc_comScanner {
    public static void main(String[] args) {
        
    Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o primeiro valor: ");
        double valor1 = entrada.nextDouble();
        
        System.out.println("Informe o segundo valor: ");
        double valor2 = entrada.nextDouble();
        
        System.out.println("Informe a operação: ");
        String op = entrada.next();
        
        //Lógica
        double resultado = "+".equals(op)? valor1 + valor2 : 0;//SE O SINAL DE (+) APARECER NA VARIÁVEL (OP) SOMA-SE AS VARIÁVEIS VALOR1 + VALOR2
        resultado = "-".equals(op)? valor1 - valor2 : resultado;
        resultado = "*".equals(op)? valor1 * valor2 : resultado;
        resultado = "/".equals(op)? valor1 / valor2 : resultado;
        resultado = "%".equals(op)? valor1 % valor2 : resultado;
        
        System.out.printf("%.2f %s %.2f = %.2f\n",
        valor1, op, valor2, resultado);
        
    }
                
}

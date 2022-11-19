package Desafos_Fundamentos_3;

import javax.swing.JOptionPane;

public class Desafio_Calculadora_1 {
    public static void main(String[] args) {
        
        String numero_um = JOptionPane.showInputDialog("Digite o primeiro número");
        String numero_dois = JOptionPane.showInputDialog("Digite o segundo número");
        String operacao = JOptionPane.showInputDialog("Digite a operacao");
        
        double valor1 = Double.parseDouble(numero_um);
        double valor2 = Double.parseDouble(numero_dois);
        
        //Lógica
        double resultado = "+".equals(operacao)? valor1 + valor2 : 0;
        resultado = "-".equals(operacao)? valor1 - valor2 : resultado;
        resultado = "*".equals(operacao)? valor1 * valor2 : resultado;
        resultado = "/".equals(operacao)? valor1 / valor2 : resultado;
        resultado = "%".equals(operacao)? valor1 % valor2 : resultado;
        
        System.out.printf("%.2f %s %.2f = %.2f\n",
        valor1, operacao, valor2, resultado);
        
        JOptionPane.showMessageDialog(null, "resultado: " + resultado);
        
        
                
                
        
        
        
                
                
        
    }
    
}

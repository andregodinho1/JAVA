package Estruturas_de_Controle_4;

import javax.swing.JOptionPane;

public class If_Else {
    
    public static void main(String[] args) {

        String valor = JOptionPane.showInputDialog("Digite o valor desejado: ");
        int numero = Integer.parseInt(valor);

        if (numero % 2 == 0) {
            System.out.println("Este numero é PAR");
        } else {
            System.out.println("Este numero é ÍMPAR");
        }
            
    }
}
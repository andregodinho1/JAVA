package Estruturas_de_Controle_4;

import java.util.Scanner;

public class Switch_com_break {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        String conceito = "";
        System.out.println("Informe a nota: ");
        int nota = entrada.nextInt();
       
        
        switch(nota) {
            case 10:
               conceito = "Parabéns, você foi incrível!!";
               break;
            case 9:
                 conceito = "Parabéns, você foi excelente!!";
                break;
            case 8:
                 conceito = "Parabéns!!";
                break;
            case 7: case 6:
                 conceito = "Você foi mediano!!";
                break;
            case 5: case 4:
                 conceito = "Você está de recuperação!!";
                break;
            case 3: case 2: case 1:
                conceito = "Você está reprovado";
                break;
            default:
                conceito = "Nota inválida";
                
        }
        
            System.out.println("conceito: " + conceito);
                entrada.close();
        }
    }




package Secao2_Est_de_Controle;

import java.util.Scanner;

public class Switch_sem_Break {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String faixa = "";
        System.out.println("Digite a sua faixa");
        faixa = entrada.nextLine();

        switch (faixa.toLowerCase()) {

            case "preta":
                System.out.println("Permitidos todos os golpes das faixas branca/azul/roxa e marrom, além de chave de calcanhar");
            case "marrom":
                System.out.println("Permitido golpes das branca/faixas azul/roxa e leg lock");
            case "roxa":
                System.out.println("Permitido os golpes das faixas branca/azul e chave de panturrilha");
            case "azul":
                System.out.println("Permitido dar tiro de guarda e trinagulo/arm lock voador e mão de vaca");
            case "branca":
                System.out.println("Permitido golpes como arm-lock da montada/omoplata, proibido golpes voadores");
                break;
            default:
                System.out.println("Faixa não encontrada");
        }
        entrada.close();

    }
}


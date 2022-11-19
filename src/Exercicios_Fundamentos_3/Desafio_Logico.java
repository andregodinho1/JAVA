package Exercicios_Fundamentos_3;
public class Desafio_Logico {

    public static void main(String[] args) {
        
        boolean trabalho1 = true;
        boolean trabalho2 = true;
        
        boolean comprouTv50 = trabalho1 && trabalho2;
        boolean comprouTv32 = trabalho1 ^ trabalho2;
        boolean gastou_dinheiro = trabalho1 || trabalho2;
        
        //Operador Unário
        boolean economizou = !gastou_dinheiro;
        
        
        System.out.println("Comprou Tv de 50 pl? " + comprouTv50);
        System.out.println("Comprou Tv de 32 pl? " + comprouTv32);
        System.out.println("Gastou dinheiro? " + gastou_dinheiro);
        System.out.println("Economizou dinheiro? " + economizou);
        
        
        
        
    }
    
}

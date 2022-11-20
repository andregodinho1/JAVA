package Secao5_Colecoes;

import java.util.HashSet;
import java.util.Set;

public class Conjunto_Baguncado {
    public static void main(String[] args) {
        
        HashSet conjunto = new HashSet ();
        
        conjunto.add(1.2); //Há a conversão automática de primitivos para objetos//
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add('x');
        
        conjunto.add("Teste");
        System.out.println("O tamanho é de " + conjunto.size());
        
        System.out.println(conjunto.remove("Teste"));
        System.out.println(conjunto.remove('x'));
        
        System.out.println("O tamanho atual é de " + conjunto.size());

        System.out.println(conjunto.contains('x'));// Verifica se a variável está na coleção//
        System.out.println(conjunto.contains(1));
        System.out.println(conjunto.contains(true));

        Set num = new HashSet ();
        num.add(1);
        num.add(2);
        num.add(3);
        
        System.out.println(num);
        System.out.println(conjunto );
        
        conjunto.addAll(num);// União entre dois conjuntos//
        conjunto.retainAll(num);//Interceção ente os dois conjuntos
        System.out.println(conjunto);  
        
        conjunto.clear();
        System.out.println(conjunto);
        
        
    }
}

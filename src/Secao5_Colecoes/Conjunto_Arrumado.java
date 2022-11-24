package Secao5_Colecoes;

import java.util.SortedSet;
import java.util.TreeSet;

public class Conjunto_Arrumado {
    public static void main(String[] args) {
       // Set<String> listaAprovados = new HashSet<> ();
        SortedSet<String> listaAprovados = new TreeSet<> ();
        listaAprovados.add("Ana");
        listaAprovados.add("Carlos");
        listaAprovados.add("Luca"); 
        listaAprovados.add("Pedro");
        
        for(String candidato: listaAprovados) {
            System.out.println(candidato);
        }
    }
    
}


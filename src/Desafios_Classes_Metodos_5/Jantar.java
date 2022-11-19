package Desafios_Classes_Metodos_5;

public class Jantar {

    public static void main(String[] args) {

        Comida c1 = new Comida("Arroz", 0.150);
        Comida c2 = new Comida("Feijão", 0.300);

        Pessoa p1 = new Pessoa("Osvaldo", 100);

        System.out.println(p1.apresentar());
        
        p1.comer(c1); // FOI ADICIONADO ATRAVÉS DO MÉTODO "COMER()" O PESO DA COMIDA AO PESO DA PESSOA, ONDE O PESO ESTÁ PARAMETRIZADO!!
        System.out.println(p1.apresentar());
        
        p1.comer(c2);
        System.out.println(p1.apresentar());
    }

}

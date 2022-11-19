package Classe.Desafio_5;
public class Pessoa {
String nome_pessoa;
double peso_pessoa;

    public Pessoa(String nome_pessoa, double peso_pessoa) {
        this.nome_pessoa = nome_pessoa;
        this.peso_pessoa = peso_pessoa;
    }

    void comer(Comida comida) {
        if (comida != null) {
            this.peso_pessoa += comida.peso_comida;
        }
    }

    String apresentar() {
        return "Olá eu sou o " + nome_pessoa + " e tenho " + peso_pessoa + " Kgs.";
    }

}


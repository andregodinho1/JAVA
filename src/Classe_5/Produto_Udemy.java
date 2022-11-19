package Classe_5;
public class Produto_Udemy {
    String nome;
    double preço;
    static double desconto = 0.25;
    //int quantidade;

    Produto_Udemy(String nome_Inicial, double preco_Inicial) {
        nome = nome_Inicial;
        preço = preco_Inicial;
       
    }
    
    Produto_Udemy () {
    } 
    //MÉTODO CRIADO PARA SER CHAMADO NA MAIN E FALICITAR O USO DA FUNÇÃO DESCONTO//
    double preco_com_desconto() {
        return preço * (1 - desconto);
}
    
}

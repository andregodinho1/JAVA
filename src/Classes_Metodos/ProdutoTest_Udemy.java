package Classes_Metodos;
public class ProdutoTest_Udemy {
    
    public static void main(String[] args) {
  
        
        //ObJETO COM CONSTRUTOR PARAMETRIZADO
        Produto_Udemy p1 = new Produto_Udemy("Notebook", 5000);
        
        //OBJETO COM CONSTRUTOR NÃO PARAMETRIZADO
        Produto_Udemy p2 = new Produto_Udemy();
        p2.nome = "Arroz";
        p2.preço = 5;
        
        //NOTA: DEIXAR O CÓDIGO EXPLÍCITO RENOMEANDO A VARIÁVEL PARA MOSTARR QUE TODOS OS PRODUTOS FORAM INSERIDOS DESCONTOS///
        Produto_Udemy.desconto = 0.3;
        //p2.quantidade = 1;
        
        double preco_final1 = p1.preco_com_desconto();
        double preco_final2 = p2.preco_com_desconto();
        
        System.out.println(p1.nome);
        System.out.printf("R$ %.2f", preco_final1);
        System.out.println("");
        System.out.println(p2.nome);
        System.out.printf("R$ %.2f", preco_final2);
        System.out.println("");
        
        
    }
    
}

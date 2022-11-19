package Classe_5;

public class Valor_vs_Referencia {
    
    public static void main(String[] args) {
        
    double a = 2;
    double b = 3; // ATRIBUIÇÃO POR VALOR (TIPO PRIMITIVO)
    
    a++;
    b--;
        System.out.println(a + " --- " + b);
        
        Data d1 = new Data(1, 1, 2022 );
        Data d2 = d1; // ATRIBUIÇÃO POR REFERÊNCIA
                      //NOTA: Tanto "d1" quanto "d2" apontam para o mesmo objeto em memória 
        d1.dia = 6;
        d1.mes = 4;
        d1.ano = 1991;
        
        System.out.println(d1.data_formatada());
        System.out.println(d2.data_formatada());
        
        voltar_data_padrão(d1); //quanto inserimos o objeto "d1" no parametro do método (função) "voltar_data_padrão" -
                                   // tetona-se o valor dos valores inseridos nesta função tanto para "d1" quanto para "d2"
        
        System.out.println(d1.data_formatada());
        System.out.println(d2.data_formatada());
        
        int c = 5; // Nota: não muda os valores do parametro, pois são valores primitivos alocados em outro lufar da memória.
        alterar_primitivo(c);
        System.out.println(c);
    }
    //A PARTIR DE UM MÉTODO ESTÁTICO PODE-SE ACESSAR OUTRO MÉTODO ESTÁTICO, NO CASO A MAIN.    
    static void voltar_data_padrão(Data dp){ // Nota: O objeto "Data dp" repassado para o parametro não é uma cópia
                                            // e sim uma referência, uma instância, ou seja, o próprio objeto em questão.
        dp.dia = 9;                        // o que pode mudar conforme os valores inseridos no método.
        dp.mes = 9;
        dp.ano = 2022;
                
    }
         
    static void alterar_primitivo(int a){
        a++;
        
    }
}

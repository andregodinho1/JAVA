package Classes_Metodos;
public class Data_teste {
    public static void main(String[] args) {
        
        //CONSTRUTOR PARAMETRIZADO//
        Data d1 = new Data();
        
        //CONSTRUTOR NÃO PARAMETRIZADO
        Data d2 = new Data(7, 9, 1985);
        
        System.out.println("Dia: " +d1.dia );
        System.out.println("Mês: " +d1.mes );
        System.out.println("Ano: " +d1.ano );
        
        //REFATORAR O CÓDIGO = "ENXUGAR" O CÓDIGO, CORRIGIR ERRO    S EM D.2
        String dataString = d2.data_formatada();
                
        //COM FORMAT
        System.out.printf("\nCom format: %d/%d/%d\n", d1.dia, d1.mes, d1.ano);
        // RETORNANDO O MÉTODO
        System.out.println("\nRetornando o método: \n" + d1.data_formatada());
        //ARMAZENADA NA VARIÁVEL
        System.out.println("\nArmazendada no construtor de teste\n" + dataString);
        
        
        
        System.out.println("\nImpressão retornando o método vazio");
        d1.imprime_data_formatada(); 
        d2.imprime_data_formatada();
        
        }
}

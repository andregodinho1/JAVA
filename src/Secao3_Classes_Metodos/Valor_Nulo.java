package Secao3_Classes_Metodos;
public class Valor_Nulo {
    
    public static void main(String[] args) {
        
        String s1 = "";
        System.out.println(s1.concat("!!!!"));
        
        Data d1 =  Math.random() > 0.5 ? new Data () : null;
        
        if(d1 != null) {
            d1.mes = 3;
            System.out.println(d1.data_formatada());
        }
        
        String s2 = Math.random() > 0.5 ? "Opa" : null;
        
        if (s2 != null) {
            System.out.println("??????");
            
        }
    }
}
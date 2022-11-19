package Fundamentos_3;
public class Logicos {
    public static void main(String[] args) {
        
        boolean condicao1 = true;
        boolean condicao2 = 3>7;
            
        System.out.println("Condições");
        System.out.println(condicao1 && !condicao2);
        System.out.println(condicao1  || condicao2);
        System.out.println(condicao1  ^ condicao2);
        System.out.println(!!condicao1);
        System.out.println(!condicao2);
        
        System.out.println("Tabela verdade E (AND)");
        System.err.println(true && true);
        System.err.println(true && false);
        System.err.println(false && true);
        System.err.println(false && false);
        
        System.out.println("Tabela verdade OU (OR) ");
        System.err.println(true || true);
        System.err.println(true || false);
        System.err.println(false || true);
        System.err.println(false || false);
                
        System.out.println("Tabela verdade OU exclusivo (XOR)");
        System.err.println(true ^ true);
        System.err.println(true ^ false);
        System.err.println(false ^ true);
        System.err.println(false ^ false);
        
        System.out.println("Tabela da Verdade NOT");
        System.err.println(!true);
        System.err.println(!false);
        
    }
    
}

package Exercicios_Fundamentos_3;
public class DesafioAritmetico {
    public static void main(String[] args) {
        
       int a =  6*(3+2);
       int a1 = (3*2);
       
       int a2 = (int) Math.pow(a, 2);
       double a3 = a2/a1;
       
       System.out.println("Resultado a: " + a3);
       
       int b = (1-5)*(2-7)/2;
       double b1 = Math.pow(b, 2);
       
        System.out.println("Resultado b: " + b1);
       
       double c = a3 - b1;
        System.out.println("Resultado c: " + c);
       
       double d = Math.pow(c, 3);
       System.out.println("Resultado d: " + d);
       
       double e = Math.pow(10, 3);
       System.out.println("Resultado e: " + e);
       
        System.out.println("Resultado final: " + (d/e));
        
                    
                
    }
    
}

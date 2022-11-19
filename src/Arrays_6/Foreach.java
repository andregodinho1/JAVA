package Arrays_6;
public class Foreach {
    public static void main(String[] args) {
      
 double[] pontos = { 8.8, 9.9, 7.8 };
 
 double total = 0;
 for(double ponto: pontos) {
     total += ponto;
          System.out.println(ponto + " ");
 } 
          System.out.printf("%.2f ",total);
        }
    }
 


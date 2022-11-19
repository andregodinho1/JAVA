package Estruturas_de_Controle_4;

public class Break {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 1) {
                continue;
            }
            
            System.out.println(i);
        }
        
        for (int i = 1; i <= 10; i++) {
            if (i == 5) 
            continue;
           System.out.println(i);
        }
    }
}





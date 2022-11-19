package Classe_5;
public class Area_Circulo {
    
    double raio;
    final static double PI = 3.1415;

    Area_Circulo( double raio_inicial) {
        raio = raio_inicial;
    }
    
    double area() {
        return PI * Math.pow(raio, 2);
    }
    
    static double area (double raio) {
        return PI * Math.pow(raio, 2);        
    }
}

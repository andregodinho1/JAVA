package Classes_Metodos;
public class Area_Circulo_Teste {

    public static void main(String[] args) {
        
        //IMPRIMINDO RESULTADO ATRAVÉS DE INSTÂNCIA 
        Area_Circulo a1 = new Area_Circulo(10);
        a1.raio = 10;
        System.out.println(a1.area());
        
        //RESULTADO ATRAVÉS DE MÉTODO
        System.out.println(Area_Circulo.area(5));
        
        //RESULTADO SOMENTE COM OS VALORES DE PI
        System.out.println(Area_Circulo.PI);
        System.out.println(Math.PI);
    }
    
}

package Secao7_Orientacao_a_Objetos;
public class Motor {
    
    boolean ligado = false;
    double fatorInjecao = 1;
    
    int giros() {
        if(!ligado){ //se diferete(!) de ligado (deligado) irá retornar zero, caso contrário, retornará a função.
            return 0;
        } else {
        return (int) Math.round(fatorInjecao * 3000);
        }
    }
}

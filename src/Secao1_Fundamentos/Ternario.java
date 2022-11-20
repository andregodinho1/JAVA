package Secao1_Fundamentos;
public class Ternario {
    public static void main(String[] args) {
        double media = 4.1;
        String parcial_resultado = media <= 5 ? "de recuperação" : "reprovado";
        String final_resultado = media >= 7 ? "aprovado" : parcial_resultado;
        
        
        System.out.println("O aluno está " + final_resultado);
        
        double nota = 8;
        boolean bomComportamento = true;
        boolean passou_por_media = nota >= 7;
        boolean temDesconto = bomComportamento && passou_por_media;
        String resultado = temDesconto ? "Sim." : "Não.";
        
        
        System.out.println("Tem desconto? " + resultado);
       
        
        

               
                
        
        
        
    }
    
}

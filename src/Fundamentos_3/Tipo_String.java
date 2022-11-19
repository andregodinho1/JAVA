package Fundamentos_3;

public class Tipo_String {
    
    public static void main(String[] args) {
        System.out.println("Olá pessoal".charAt(0));
        
        String s = "Boa Tarde";
       
        System.out.println(s.concat("!!!"));
        System.out.println(s + " !!");
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.toLowerCase().startsWith("boa"));        
        System.out.println(s.toUpperCase().endsWith("TARDE"));
        System.out.println(s.length());
        System.out.println(s.toLowerCase().equals("boa tarde"));
        System.out.println(s.toLowerCase().equalsIgnoreCase("boa tarde"));
                
          
        String nome = "André";
        String sobrenome = "Godinho";
        int idade = 31;
        double salario = 2500;
                       
        
 System.out.println("Nome: " + nome + " \nSobrenome: " + sobrenome + " \nIdade: " + idade + " \nSalário: " + salario);
 
        System.out.printf("\nO senhor %s %s tem %d anos e ganha R$%.2f.\n",
                nome, sobrenome, idade, salario);           
                               
    }
    
}

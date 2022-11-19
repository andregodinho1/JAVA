package Classe_5;
public class Data {
      
    int dia;
    int mes;
    int ano;
    
      Data() {
//    dia = 1;
//    mes = 1;
//    ano = 1970;

//      "THIS" ultilizada como construtor das variáveis 
        this(6, 4, 1991);
    }

    
    //UTILIZANDO A PALAVRA-THIS REFERENCIANDO A VARIÁVEL DE INSTÂNCIA
    
     Data (int dia, int mes, int ano) {
     this.dia = dia;
     this.mes = mes;
     this.ano = ano;
//     
     
    }
    
         //RETORNANDO A VARÁVEL CRIADA EM STRING "DATA_FORMATADA"
   
    String data_formatada () {
       return String.format("%d/ %d / %d", this.dia, this.mes, this.ano );
    }

    
    void imprime_data_formatada() {
        System.out.println(this.data_formatada());
        
        
    }    
        
    
}




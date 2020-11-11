package sample;

public class SomandoValores {
    
    public static void main(String[] args) {
        
        int valor1=1;
        int valor2=4;
        String mensagem = "Ocorreu um ajuste no valor da soma já que: ";
        boolean eMaior=false;
        int soma=valor1+valor2;

        //o uso do if

        System.out.println(valor1>valor2);

        
        if(valor1>valor2){
            soma+=2;
            eMaior=true;
        }else if(valor1<valor2){
            soma-=5;
        }      
        
        System.out.println((" "+valor1).concat(" + "+valor2).concat(" = "+soma));

        System.out.println(mensagem
                .concat(""+valor1)
                .concat(eMaior?" + ":" < ")
                .concat(""+valor2));
    }
}
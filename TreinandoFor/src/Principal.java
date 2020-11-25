package src;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        ///SPLIT, SUBSTRING, LOWERCASE


        /*String[]a="marcus".split("");
        String[]b={"m","a","r","c","u","s"};
        String texto="Marcos,Fabiano,Icaro,Renata";
        String [] nomes=texto.split(",");pega palavra inteira separada por ","

        for(String i:nomes){
            System.out.println(i);
        }
        //Quando a string tiver a letra "a" pule 2 caracteres se possível

        Scanner sc=new Scanner(System.in);
        String textob=sc.nextLine();
        //System.out.println(texto.substring(0,1));
        //substring?pegar trechos da string
        
        for(int i=0;i<textob.length();i++){
            System.out.println(textob.substring(i,(i+1)));
                if(textob.substring(i,(i+1)).toLowerCase().equals("a") &&
                    (i+2)<textob.length()){
                        i=i+2;
                }
        }*/

        //////////////////////////////////////////////////////////////
        //quebra palavras e caracteres e pula 2 após achar a letra "a"
        /*String textoc="Marcos,Fabiano,Icaro,Renata";
        String [] nomes=textoc.split("");
        for(String i:nomes){
            System.out.println(i);
        }
        for(int i=0;i<textoc.length();i++){
            System.out.println(textoc.substring(i,(i+1)));
                if(textoc.substring(i,(i+1)).toLowerCase().equals("a") &&
                    (i+2)<textoc.length()){
                        i=i+2;
                }
        }*///CORRIGIDO

        String texto;
        Scanner sc = new Scanner(System.in);
        texto=sc.nextLine();
        System.out.println("Digite uma palavra:");

        int controleAchouA=0;
        //contains... verifica se a string sontem o caracter informado
        /*for(String a: texto.split("")){
            if(controleAchouA==0){
                System.out.println(a);
            }else{
                controleAchouA--;
            }
            if(a.toLowerCase().contains("a")){
                controleAchouA=2;
            }
        }*///FUNCIONOU E VERIFICAR CONSOLE

            for(String a: texto.split("")){
                if(a.toLowerCase().contains("b")){
                    System.out.println("Encontrei um b");
                    /*continue;SOBE e testa a condição novamente
                    pegar todas as ocorrências e não executa um outro trecho
                    antes de acabar*/
                    break;
                    /*acha uma ocorrência e para, não testa a palavra ou frase
                    toda*/
                }
            System.out.println("Não encontrei um b");
            }
    }
}
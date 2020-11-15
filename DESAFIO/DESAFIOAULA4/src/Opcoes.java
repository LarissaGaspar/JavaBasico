import java.util.Scanner;

public class Opcoes {
    

    public void selecionaOpcao1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o nome do seu animal preferido?");

        while(!animal.equals("gato")){
            System.out.println("Eu prefiro gato");
            System.out.println("Qual o nome do seu animal preferido?");
            animal=sc.nextLine();
        }
        System.out.println("O meu também!");
    }

    public void selecionaOpcao2(){
        int idade;
        idade=sc.nextInt();

        System.out.println("Ele já é um adulto.");

        if(idade>0 && idade<12){
            System.out.println("Ele ainda é uma criança.");
        }else if(idade>11 && idade<19){
            System.out.println("Adolescente é fogo!");
        }else if(idade>18){
            System.out.println("Qual a idade do seu filho?");
        }
    }

    public void selecionaOpcao3(){
        System.out.print("Em construção... será que vamos");
        System.out.println(" aprender a usar o for...");
    }
}
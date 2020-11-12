package sample;

import java.util.Scanner;

public class TreinandoScanner {
    public static void main(String[] args) throws Exception {
        /*crie um programa que leia o seu nome
        meu nome é
        minha idade é
        meu peso é
        Realize um teste para informa se a pessoa esta com o
        peso maior de 80kg
        caso maior: você precisa correr mais
        caso menor: coma mais carboidratos
        */

        String nome;
        int idade;
        float peso;

        Scanner leitor = new Scanner(System.in);
        String controle="C";
        while(controle.equals("C")){
            
        System.out.println("Olá, qual é o seu nome:");
        nome=leitor.nextLine();
        System.out.println("Digite sua idade:");
        idade=leitor.nextInt();
        System.out.println("Digite seu peso:");
        peso=leitor.nextFloat();

        //respostas

        System.out.println("Meu nome é: "+nome);
        System.out.println("Minha idade é: "+idade+" anos");
        System.out.println("Meu peso é: "+peso+"Kg");
        //System.out.printf("Meu nome é %s\n Minha idade é %d\n
        //Meu peso é %.2f\n", nome, idade, peso)
        
        
        //metodo verificaIdade(peso, idade, nome)
        verificaIdade(peso, idade, nome);

        //inteiro, string, char
        verificaIdadeComSwitch(idade);
        }
    }

    //AQUI ESTÃO SÓ OS METODOS A SEREM CHAMADOS E O FECHAMENTO DA CLASSE
    public static void verificaIdade(float peso,int idade, String nome) {
        if((peso>80 && idade>40) || nome.equals("Marcus")){
            System.out.println("Você precisa corre mais.");
        }else{
            System.out.println("Coma mais carboidratos.");
        }
    }
    public static void verificaIdadeComSwitch(int idade) {
        switch(idade){
            case 80:
                System.out.println("Parabéns pelos seus 80 anos!");
            break;
            
            case 40:
            System.out.println("Você ainda é jovem!");
            break;
    
            default:
            System.out.println("Você ainda é jovem!");
            break;
            }
    }
}
import java.util.Scanner;

public class Leitor {

    Scanner sc = new Scanner(System.in);

    //pergunta+entrada de dados+receber dado do tipo inteiro
    public static Integer lerValor(String pergunta, Scanner sc, Integer valor){//wrapper
        System.out.println(pergunta);
        return sc.nextInt();
    }

    //pergunta+entrada de dado
    public static String lerValor(String pergunta, Scanner sc) {
        System.out.println(pergunta);//na variavael que vai receber STRING, uso o metodo
        return sc.next();
    }

    //pergunta+entrada de dado+receber dado do tipo string
    public static String lerValor(String pergunta, Scanner sc, String valor) {//(PERGUNTA E ENTRADA STRING)
        System.out.println(pergunta);//na variavael que vai receber STRING, uso o metodo
        return sc.next();//puxando a pergunta e o Scanner para pegar o valor(STRING) do teclado
    }
}
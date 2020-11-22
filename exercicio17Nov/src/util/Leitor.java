package util;

import java.util.Scanner;

public class Leitor {

    Scanner sc = new Scanner(System.in);

    //pergunta+entrada de dados+receber dado do tipo inteiro
    public static Integer lerValor(String pergunta, Scanner sc, Integer valor){//wrapper
        System.out.println(pergunta);
        return sc.nextInt();
    }

    //String é um array de Character
    public static Float lerValor(String pergunta, Scanner sc, Float valor){//wrapper
        System.out.println(pergunta);
        return sc.nextFloat();
    }

    //pergunta+entrada de dado
    public static String lerValor(String pergunta, Scanner sc) {
        System.out.println(pergunta);//na variavael que vai receber STRING, uso o metodo
        return sc.next();
    }

    //pergunta+entrada de dado+receber dado do tipo caracter
    public static Character lerValor(String pergunta, Scanner sc, Character valor) {//(PERGUNTA E ENTRADA STRING)
        System.out.println(pergunta);//na variavael que vai receber STRING, uso o metodo
        String returno = sc.next();//puxando a pergunta e o Scanner para pegar o valor(STRING) do teclado
        return returno.charAt(0);
    }

    public static Boolean lerValor(String pergunta, Scanner sc, Boolean b){//wrapper
        String retorno="";
        do{
            System.out.println(pergunta);
            retorno=sc.next();
        }while (!retorno.toUpperCase().equals("SIM")||!retorno.toUpperCase().equals("NAO"));
        if(retorno.toUpperCase().equals("SIM")){
            return true;
        }else{
            return false;
        }
    }

    public static Long lerValor(String pergunta, Scanner sc, Long l) {
		System.out.println(pergunta);
		return sc.nextLong();
    }
    
    /*public static void limparConsole() {
		try {

			if (System.getProperty("os.name").contains("Windows"))
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			else
				Runtime.getRuntime().exec("clear");
		} catch (Exception e) {
			System.out.println("Erro....");
		}

	}*/
}
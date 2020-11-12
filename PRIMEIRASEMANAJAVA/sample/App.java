package sample;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Calculadora c = new Calculadora();

        System.out.println(c.realizarMultiplicacao(10));

        System.out.println(c.realizaSoma(10));

        //System.out.println(Calculadora.valorPadraoSomaInteiro);

        byte b;
        short s;// -32000 ate 32000
        int i;// -2147483648 ate 2147483648
        long l;// -9223372036854775808 ate 
        float f;// 6
        double d; //15
        boolean bol; //true ou false
        char ch = 23;//'a'

        System.out.println(ch);

        Scanner sc = new Scanner (System.in);

        float numF=sc.nextFloat();
        System.out.println(numF);
        int num1=sc.nextInt();
        System.out.println(num1);
        byte byte1=sc.nextByte();
        System.out.println(byte1);
        long lg1=sc.nextLong();
        System.out.println(lg1);
        boolean b1=sc.nextBoolean();
        System.out.println(b1);
        double num2=sc.nextDouble();
        System.out.println(num2);
        String nome=sc.nextLine();
        System.out.println(nome);

    }
}
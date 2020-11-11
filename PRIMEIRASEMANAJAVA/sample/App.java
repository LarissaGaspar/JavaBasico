package sample;

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
    }
}
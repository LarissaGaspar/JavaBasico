public class WrappersJava{

    public static void main(String[] args) {
        //quase não se trabalha com PRIMITIVAS
        int i=1;
        Integer wrapperInt = Integer.valueOf(3);
        //vazio não ficará zerado mas NULO. Facilita manipulação
        float f=3.4f;
        Float wrapperFloat = Float.valueOf(f);
        char c='c';
        Character wrapperChar = Character.valueOf(c);
        byte b=32;
        Byte wrapperByte = Byte.valueOf(b);
        long l=34433L;
        Long wrapperLong = Long.valueOf(l);
        short s=12;
        Short wrappersShort = Short.valueOf(s);
        double d=12.3;
        Double wrapperDouble = Double.valueOf(d);
        boolean bol=false;
        Boolean wrapperBoolean = Boolean.valueOf(bol);

        //TEMOS que usar WRAPPERS para envolopar a variavel e dar novas FUNÇÕES



    }
}
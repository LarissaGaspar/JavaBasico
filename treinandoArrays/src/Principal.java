import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        String[] nomes={"Marcus","Renata","Janaína","Fabrícia","Samuel"};
        int[] idades={10,20,30,40,50};
        //Imprima idade e nome percorrendo os arrays
        /*altere os valores dos nome das posições pares utilizando
        array[posicao]=valor;utilize oo Scanner        
        */
        /*altere os valores das idades das posições impares utilizando
        array[posicao]=valor;utilize oo Scanner        
        */

        //imprimir nome e idades
        for(int i=0;i<nomes.length;i++){
            System.out.println(nomes[i]+" tem "+idades[i]);
        }

        Scanner sc=new Scanner(System.in);
        int controle=0;
        
        //verificar par(%2)        
        for(String nome:nomes){
            
            System.out.println(nome);
            if(controle%2==0){
                System.out.println("A nome"+nome+"está sendo alterado"+
                " ,informe o novo valor:");
                nome=sc.nextLine();
                System.out.println(nome);
                nomes[controle]=nome;
            }
            controle++;
        }

        controle=0;
        for(int idade:idades){
            
            System.out.println(idade);
            if(controle%2!=0){
                System.out.println("A idade"+idade+"está sendo alterada"+
                " ,informe o novo valor:");
                idade=sc.nextInt();
                System.out.println(idade);
                idades[controle]=idade;
            }
            controle++;
        }

        System.out.println("Resultado das modificações:");
        for(int i=0;i<nomes.length;i++){
            System.out.println(nomes[i]+" tem "+idades[i]);
        }
    }//TESTAR
}
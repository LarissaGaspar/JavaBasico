import java.util.Scanner;

public class DesafioAula6 {

    public static String lerValor(String pergunta, Scanner sc) {//(PERGUNTA E ENTRADA STRING)
        System.out.println(pergunta);//na variavael que vai receber STRING, uso o metodo
        return sc.next();//puxando a pergunta e o Scanner para pegar o valor(STRING) do teclado
    }

    public static int lerValor(String pergunta, Scanner sc, int valor){
        System.out.println(pergunta);
        return sc.nextInt();
    }

    public static float lerValor(String pergunta, Scanner sc, float valor){
        System.out.println(pergunta);
        return sc.nextFloat();
    }
    
    public static char lerValor(String pergunta, Scanner sc, char valor){
        System.out.println(pergunta);
        String retorno=sc.next();
        return retorno.charAt(0);
    }

    public static void main(String[] args) {
        /*crie 3 arrays com 6 posições
        primeiro array com nome
        segundo array peso
        terceiro array com sexo(char)
        */

        /*String[] nomes={"Arthur","Vinícius","Maria","Matheus","Lavínia","Aline"};
        float[] pesos={56.5f,67.7f,87.3f,98.0f,63.2f,59.8f};//TEM Q pôr "f"
        char[] sexos={'M','M','F','M','F','F'};//char NÃO PODE SER VAZIO

        for(int i=0;i<6;i++){

            System.out.println(nomes[i]);
            System.out.println(pesos[i]);
            System.out.println(sexos[i]);
        }*/
        //adicione novos valores a cada posição dos arrays
        //atraves do Scanner

        /*String[] nomes={"","","","","",""};
        float[] pesos={0,0,0,0,0,0};//TEM Q pôr "f"
        char[] sexos={'N','N','N','N','N','N'};//char NÃO PODE SER VAZIO*/

        /*for(int i=0;i<6;i++){

            System.out.println("Informe o nome:");
            nomes[i]=sc.next();
            System.out.println("Informe o peso:");
            pesos[i]=sc.nextFloat();
            System.out.println("Informe o sexo (F/M):");
            String sexo=sc.next();
            sexos[i]=sexo.charAt(0);//?????*/

        
        Scanner sc = new Scanner(System.in);
        int tamanho=lerValor("Qual o tamanho do array?", sc, 0);

        String[] nomes=new String[tamanho];
        float[] pesos=new float[tamanho];
        char[] sexos=new char[tamanho];
        int opcao=0;

        do{
            opcao=lerValor("Informe a opção que deseja acessar:", sc, opcao);
            switch(opcao){
                case 0:
                    System.out.println("Saindo...");
                    break;
                case 1:
                    for(int i=0;i<6;i++){

                        System.out.printf("Nome: %s\nPeso: %.2f\nSexo: %s\n",nomes[i],pesos[i],sexos[i]);                 
                    }
                break;

                case 2:
                    for(int i=0;i<tamanho;i++){
                        System.out.printf("Registro nr %d\n",(i+1));
                        adicionarValorArray(nomes, pesos, sexos, i, sc);
                        System.out.println("----------------------------------------");
                    }
                break;

                case 3:
                    int nrRegistro=lerValor("Informe o nr do registro para alteração:", sc, 0);
                    adicionarValorArray(nomes, pesos, sexos, (nrRegistro-1), sc);
                break;

                /* criar opção de escolher qual registro deseja alterar*/
                case 4:
                    String infoEscolhida=lerValor("Qual informação quer alterar:", sc);
                        if(infoEscolhida.equals("nome")){
                            nrRegistro=lerValor("Informe o nr do registro para alteração:", sc, 0);
                            nomes[nrRegistro-1]=lerValor("Escolha o nome", sc);
                        }else if(infoEscolhida.equals("peso")){
                            nrRegistro=lerValor("Informe o nr do registro para alteração:", sc, 0);
                            pesos[nrRegistro-1]=lerValor("Escolha um peso:", sc, pesos[nrRegistro-1]);
                        }else if(infoEscolhida.equals("sexo")){
                            nrRegistro=lerValor("Informe o nr do registro para alteração:", sc, 0);
                            sexos[nrRegistro-1]=lerValor("Escolha o sexo (F/M):", sc, sexos[nrRegistro-1]);
                        }//ARRUMAR ISSO MELHOR
                break;
                case 5:
                    //imprimir valores por registro
                    nrRegistro=lerValor("Informe o nr do registro para imprimir valores:", sc, 0);
                    System.out.printf("Nome: %s\nPeso: %.2f\nSexo: %s\n",nomes[nrRegistro-1],pesos[nrRegistro-1],sexos[nrRegistro-1]);
                break;
                default:
                    System.out.println("Opção Inválida!");
                break;
            }
        
        }while(opcao!=0);
    }

    private static void adicionarValorArray(String[]nomes,float[]pesos,char[]sexos, int i, Scanner sc){
        nomes[i]=lerValor("Informe o nome", sc);//repete muito podemos por em um metodo
        pesos[i]=lerValor("Informe o peso:", sc, pesos[i]);
        sexos[i]=lerValor("Informe o sexo (F/M):", sc, sexos[i]);
    }

    /*private static void adicionarValorArray(String[]nomes,float[]pesos,char[]sexos, int i, Scanner sc, String infoEscolhida){
                    int nrRegistro;
                    infoEscolhida=lerValor("Qual informação quer alterar:", sc);
                    if(infoEscolhida.equals("nome")){
                        nrRegistro=lerValor("Informe o nr do registro para alteração:", sc, 0);
                        nomes[nrRegistro-1]=lerValor("Escolha o nome", sc);
                    }else if(infoEscolhida.equals("peso")){
                        nrRegistro=lerValor("Informe o nr do registro para alteração:", sc, 0);
                        pesos[nrRegistro-1]=lerValor("Escolha um peso:", sc, pesos[nrRegistro-1]);
                    }else if(infoEscolhida.equals("sexo")){
                        nrRegistro=lerValor("Informe o nr do registro para alteração:", sc, 0);
                        sexos[nrRegistro-1]=lerValor("Escolha o sexo (F/M):", sc, sexos[nrRegistro-1]);
                    }
    }*/

}
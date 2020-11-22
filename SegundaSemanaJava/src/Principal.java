import java.util.Scanner;

public class Principal {

    public static String lerValor(String pergunta, Scanner sc) {//(PERGUNTA E ENTRADA STRING)
        System.out.println(pergunta);//na variavael que vai receber STRING, uso o metodo
        return sc.next();//puxando a pergunta e o Scanner para pegar o valor(STRING) do teclado
    }

    public static Integer lerValor(String pergunta, Scanner sc, Integer valor){//wrapper
        System.out.println(pergunta);
        return sc.nextInt();
    }

    public static Float lerValor(String pergunta, Scanner sc, Float valor){
        System.out.println(pergunta);
        return sc.nextFloat();
    }
    
    public static Character lerValor(String pergunta, Scanner sc, Character valor){
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
        Integer tamanho=lerValor("Qual o tamanho do array?", sc, 0);
        //crie um array de pessoas e passem a utiliza-lo no programa

        Pessoa[] pessoas= new Pessoa[tamanho];
        //{null,null}
        //String[] nomes=new String[tamanho];
        //float[] pesos=new float[tamanho];
        //char[] sexos=new char[tamanho];
        Integer opcao=0;
        Integer nrRegistro=0;
        String sexo;

        do{
            opcao=lerValor("Informe a opção que deseja acessar:", sc, opcao);
            switch(opcao){
                case 0:
                    System.out.println("Saindo...");
                    break;
                //mostrar pessoas da lista
                case 1:
                    for(int i=0;i<tamanho;i++){
                        Pessoa pConsulta=pessoas[i];
                        if(pConsulta!=null){
                            System.out.printf("Nome:%s \nPeso: %.2f\nSexo: %s\n ",
                            pConsulta.getNome(),pConsulta.getPeso(),pConsulta.getSexo());
                        }
                    }
                break;
                
                //inserir registros
                case 2:
                    for(int i=0;i<tamanho;i++){
                        System.out.printf("Registro nr %d\n",(i+1));
                        pessoas[i]=adicionarValorArray(pessoas[i], sc);//pega a pessoa com os atributos
                        System.out.println("----------------------------------------");
                    }
                break;
                
                //alteração de um registro específico
                case 3:
                    nrRegistro=lerValor("Informe o nr do registro para alteração:", sc, 0);
                    pessoas[nrRegistro-1]=adicionarValorArray(pessoas[nrRegistro-1], sc);
                break;

                /* criar opção de escolher qual registro deseja alterar*/
                case 4:
                    nrRegistro=lerValor("Informe o nr do registro:", sc, nrRegistro);
                    int campoAlterado=lerValor("Qual opção deseja alterar", sc, 0);
                    pessoas[nrRegistro-1]=adicionarValorPessoa(pessoas[nrRegistro-1], sc, campoAlterado);
                break;
				
                case 5:
                    //imprimir todos os dados de um registro específico
                    nrRegistro=lerValor("Informe o nr do registro para imprimir valores:", sc, 0);
                    Pessoa pConsulta2=pessoas[nrRegistro-1];
                    if(pConsulta2!=null){
                        System.out.printf("Nome: %s\nPeso: %.2f\nSexo: %s\n",
                        pConsulta2.getNome(),pConsulta2.getPeso(),pConsulta2.getSexo());
                    }                    
                break;

                default:
                    System.out.println("Opção Inválida!");
                break;
            }
        
        }while(opcao!=0);
    }


    private static Pessoa adicionarValorArray(Pessoa p, Scanner sc){
        if(p==null){
            p=new Pessoa();
        }
        p.setNome(lerValor("Informe o nome", sc));
        p.setPeso(lerValor("Informe o peso:", sc, p.getPeso()));
        p.setSexo(lerValor("Informe o sexo (F/M):", sc, p.getSexo()));
        return p;
    }


    private static Pessoa adicionarValorPessoa(Pessoa p, Scanner sc,int campoAlterado){
        if(campoAlterado==1){
            p.setNome(lerValor("Informe o nome", sc));
        }else if(campoAlterado==2){
            p.setPeso(lerValor("Informe o peso", sc, p.getPeso()));
        }else if(campoAlterado==3){
            p.setSexo(lerValor("Informe o sexo", sc, p.getSexo()));
        }
        return p;
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
                    }(MEU)
    }*/

}
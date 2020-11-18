import java.util.Scanner;

/**
 * Principal
 */
public class Principal {

    public static Integer lerValor(String pergunta, Scanner sc, Integer valor){//wrapper
        System.out.println(pergunta);
        return sc.nextInt();
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Integer tamanho=lerValor("Quantas gavetas de livro você quer ter?", sc, 0);
        Livro[] pessoas= new Livro[tamanho];
        Integer opcao=0;
        Integer nrRegistro=0;

        do{
            //menu
            opcao=lerValor("MENU\n1-Listar todos os livros\n2-Cadastrar livro\n"+
            "3-Editar informação de um livro\n4-Apresentar livro\n5-Deletar livro\n"+
            "Informe a opção que deseja acessar:", sc, opcao);
            switch(opcao){
                case 0:
                    System.out.println("Saindo...");
                    break;
                //mostrar livros da lista
                case 1:
                    for(int i=0;i<tamanho;i++){
                        Livro lConsulta=pessoas[i];
                        if(lConsulta!=null){
                            System.out.printf("Nome:%s \nAutor: %s\nEditora: %s\nAno de Publicação: " 
                            +"%s\nClassificação: %s ",
                            lConsulta.getNome(),lConsulta.getAutor(),lConsulta.getEditora(),
                            lConsulta.getAnoPublic(),lConsulta.getClassific());
                        }
                    }
                break;        
            }   
        }while(opcao!=0);
    }
}
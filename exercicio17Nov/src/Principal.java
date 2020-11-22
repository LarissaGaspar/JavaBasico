import java.util.Scanner;
import util.Leitor;

/**
 * Principal
 */
public class Principal {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Integer tamanho=Leitor.lerValor("Qual tamanho do seu acervo de livros?", sc, 0);
        Livro[] livros= new Livro[tamanho];
        Integer opcao=0;
        Integer nrRegistro=0;
        menu(opcao,new Livro[tamanho], sc);

    }

    public static void menu(Integer opcao, Livro[] livros, Scanner sc){
        Integer nrRegistro=0;//usa o scanner+usa dado para menu(inteiro)+recebe dado tipo arraylivro
    
        do{
            opcao=Leitor.lerValor("\n-----MENU-----\n0-Sair\n1-Listar todos os livros\n2-Cadastrar livro\n"+
            "3-Editar informação de um livro\n4-Apresentar livro\n5-Deletar livro\n"+"-------------"+
            "\nInforme a opção que deseja acessar:", sc, opcao);
            switch(opcao){
                case 0:
                    System.out.println("Saindo...");
                    break;
                //mostrar todos livros da lista
                case 1:
                    ControleDeLivros.imprimirLivros(livros);
                break;
                
                //cadastrar livros
                case 2:
                    nrRegistro=Leitor.lerValor("Qual registro deseja inserir?", sc, nrRegistro);
                    livros[nrRegistro-1]=ControleDeLivros.criarRegistroDeLivro(livros[nrRegistro-1],sc);
                break;

                //editar informação específica do livro
                case 3:
                    nrRegistro=Leitor.lerValor("Qual registro deseja editar?", sc, nrRegistro);
                    livros[nrRegistro-1]=ControleDeLivros.editarRegistroDeLivro(livros[nrRegistro-1],sc);
                break;
                
                case 4:
                    //imprimir todos os dados de um registro específico
                    nrRegistro=Leitor.lerValor("Qual registro deseja imprimir?", sc, nrRegistro);
                    ControleDeLivros.imprimirRegistro(livros[nrRegistro-1]);
                break;

                case 5://deletar livros
                    nrRegistro=Leitor.lerValor("Qual registro deseja deletar?", sc, nrRegistro);
                    livros[nrRegistro-1]=ControleDeLivros.deletarLivros(livros[nrRegistro-1]);
                break;
            }

        }while(opcao!=0);
    }
    
}
import java.util.Scanner;
import util.Leitor;

public class ControleDeLivros {
    
    public static Livro editarRegistroDeLivro(Livro livro, Scanner sc) {
        int opcaoEdicao=0;
        if(livro!=null){//dado nrRegistro verifica se esse local tem dados para edição
            do{
                opcaoEdicao=Leitor.lerValor("Qual informação deseja editar?", sc, opcaoEdicao);
                switch(opcaoEdicao){
                    case 0:
                        System.out.print("Saindo da edição");
                    break;
                    case 1:
                        livro.setNome(Leitor.lerValor("Qual nome do livro", sc));
                        System.out.println("Nome do livro editado com sucesso.");
                    break;
                    case 2:
                        livro.setAutor(Leitor.lerValor("Qual autor do livro", sc));
                        System.out.println("Nome do autor editado com sucesso.");
                    break;
                    case 3:
                        livro.setClassif(Leitor.lerValor("Qual a classificação?",sc,livro.getClassific()));
                        System.out.println("Classificação do livro editado com sucesso.");
                    break;
                    case 4:
                        livro.setEditora(Leitor.lerValor("Qual a editora", sc));
                        System.out.println("Editora do livro editado com sucesso.");
                    break;
                    case 5:
                        livro.setAnoPublic(Leitor.lerValor("Qual o ano de publicação", sc, livro.getAnoPublic()));
                        System.out.println("Ano de publicação do livro editado com sucesso.");
                    break;
                    default:
                    break;
                }
            }while (opcaoEdicao!=0);            
        }else{
            System.out.print("Não existe registro com esse número");//pede um registro na
            //principal, e se o registro existir deverá estar nulo para ser preenchido com valores
            
    }return livro;
}

    public static Livro criarRegistroDeLivro(Livro livro, Scanner sc) {//no inicio o array é criado
        if(livro==null){//nulo--local existe mas vazio
            livro=new Livro();//precisa criar um livro para então pôr atributos
            livro.setNome(Leitor.lerValor("Qual o nome", sc));//cadastrar livro e seus atributos
            livro.setAutor(Leitor.lerValor("Qual o autor:", sc));
            livro.setEditora(Leitor.lerValor("Qual a editora:", sc));
            livro.setAnoPublic(Leitor.lerValor("Qual o ano de publicação:", sc, livro.getAnoPublic()));
            livro.setClassif(Leitor.lerValor("Qual a classificação:", sc, livro.getClassific()));
            //os Integer's tem o terceiro parametro
        }else{
            System.out.println("Já existe um registro com esse número!");//pede um registro na
            //principal, e se o registro existir deverá estar nulo para ser preenchido com valores
        }
        return livro;
    }
    
    public static void imprimirLivros(Livro[] livros){//todos os livros com todos os atributos
        Boolean verificaSeTemValor=false;//só vai imprimir se receber "true"
        for(Livro l: livros){//var. local "l" para mostrar cada livro(+atrib) do arraydelivros
            if(l!=null){ 
                verificaSeTemValor=true;
                System.out.printf("Nome:%s \nAutor: %s\nEditora: %s\nAno de Publicação: " 
                            +"%d\nClassificação: %d ",
                            l.getNome(),l.getAutor(),l.getEditora(),
                            l.getAnoPublic(),l.getClassific());
            }
        }
        if(!verificaSeTemValor){
            System.out.println("Nenhum livro cadastrado!");
        }
    }

    public static void imprimirRegistro(Livro l) {
        if(l!=null){
            System.out.printf("Nome:%s \nAutor: %s\nEditora: %s\nAno de Publicação: " 
                            +"%d\nClassificação: %d ",
                            l.getNome(),l.getAutor(),l.getEditora(),
                            l.getAnoPublic(),l.getClassific());
        }else{
            System.out.println("Nenhum livro cadastrado!");
        }
    }

    public static Livro deletarLivros(Livro livro) {//dado nrRegistro verifica se esta vazio(null)
        if(livro!=null){//para então deletar(return null para aquele livro e seus atributos)
            System.out.println("Registro deletado com sucesso!");
        }else{
            System.out.println("Não existe registro!");//se aquele local já estiver vazio, avisa que
                }//não existe registro
        return null;
    }

}
import java.util.Scanner;

public class ControleDeLivros {
    
    public static Livro editarRegistroDeLivro(Livro livro, Scanner sc) {
        int opcaoEdicao=0;
        if(livro!=null){
            do{
                opcaoEdicao=Leitor.lerValor("Qual informação deseja editar?", sc, opcaoEdicao);
                switch(opcaoEdicao){
                    case 0:
                        System.out.print("Saindo da opcao");
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
                        livro.setEditora(Leitor.lerValor("Qual a editora", sc, livro.getEditora()));
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
            System.out.print("Não existe registro com esse número");
    }return livro;
}

    public static Livro criarRegistroDeLivro(Livro livro, Scanner sc) {
        if(livro==null){//nulo--local existe mas vazio
            livro=new Livro();//precisa criar um livro para então ocupá-lo
            livro.setNome(Leitor.lerValor("Qual o nome", sc));
            livro.setAutor(Leitor.lerValor("Qual o autor:", sc));
            livro.setEditora(Leitor.lerValor("Qual a editora:", sc));
            livro.setAnoPublic(Leitor.lerValor("Qual o ano de publicação:", sc, livro.getAnoPublic()));
            livro.setClassif(Leitor.lerValor("Qual a classificação:", sc, livro.getClassific()));
            //os Integer's tem o terceiro parametro
        }else{
            System.out.println("Já existe um registro com esse número!");
        }
        return livro;
    }
    
    public static void imprimirLivros(Livro[] livros){
        Boolean verificaSeTemValor=false;
        for(Livro l: livros){
            if(l!=null){
                verificaSeTemValor=true;
                System.out.printf("Nome:%s \nAutor: %s\nEditora: %s\nAno de Publicação: " 
                            +"%d\nClassificação: %d ",
                            l.getNome(),l.getAutor(),l.getEditora(),
                            l.getAnoPublic(),l.getClassific());
            }
        }
        if(!verificaSeTemValor){//(!verificaSeTemValor)
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

    public static Livro deletarLivros(Livro livro) {
        if(livro!=null){
            System.out.println("Registro deletado com sucesso!");
        }else{
            System.out.println("Não existe registro!");
        }
        return null;
    }

}
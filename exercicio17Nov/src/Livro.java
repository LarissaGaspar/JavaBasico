public class Livro {
    
    private String nome, autor, editora;
    private Integer anoPublic, classif;

    /*public Livro(){

    }

    public Livro(String nome,String autor,String editora, Integer anoPublic, Integer classif){
        this.nome=nome;
        this.autor=autor;
        this.editora=editora;
        this.anoPublic=anoPublic;
        this.classif=classif;
    }*/

    //publico sera uma STRING o retorno(vamos pegar)
    public String getNome(){
        return nome;
    }

    public String getAutor(){
        return autor;
    }

    public String getEditora(){
        return editora;
    }

    public Integer getAnoPublic(){
        return anoPublic;
    }

    public Integer getClassific(){
        return classif;
    }


    //SETAR nao tem retorno só acesso
    public void setNome(String nome) {
        this.nome=nome;
    }

    
    public void setAutor(String autor) {
        this.autor=autor;
    }

    public void setEditora(String editora) {
        this.editora=editora;
    }

    public void setAnoPublic(Integer anoPublic) {
        this.anoPublic=anoPublic;
    }

    
    public void setClassif(Integer classif) {
        this.classif=classif;
    }

}
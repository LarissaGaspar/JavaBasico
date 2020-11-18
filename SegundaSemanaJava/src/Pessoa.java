public class Pessoa {
    /*String[] nomes=new String[tamanho];
    float[] pesos=new float[tamanho];
    char[] sexos=new char[tamanho];*/


    private String nome;
    private Float peso;
    private Character sexo;

    //Método construtor

    public Pessoa(){

    }

    public Pessoa(String nome,Float peso, Character sexo){
        this.nome=nome;
        this.peso=peso;
        this.sexo=sexo;
    }

    //publico sera uma STRING o retorno(vamos pegar) 
    public String getNome(){
        return nome;
    }

    public Float getPeso(){
        return peso;
    }

    public Character getSexo(){
        return sexo;
    }

    //TROCAR nao tem retorno só acesso
    public void setNome(String nome) {
        this.nome=nome;
    }

    //public Pessoa setPeso
    public void setPeso(Float peso) {
        //VAI USAR NA CLASSE QUE O CHAMA
        this.peso=peso;
        //return this
    }//////////////////
    //USAR RETORNO NO "SET" DA PRA SETTAR MAIS DE UM DADO NA MESMA LINHA
    //p.setNome("Marcus").setPeso(83.3f).setSexo('M');

    public void setSexo(Character sexo) {
        this.sexo=sexo;
    }
}
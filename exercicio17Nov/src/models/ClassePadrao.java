package models;

public class ClassePadrao {

	protected String nome;

	public ClassePadrao() {//construtor

	}

	public ClassePadrao(String nome) {//construtor com parametro
		this.nome = nome;
	}

	public String getNome() {
		return "Meu nome é : " + nome;//return personalizado
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
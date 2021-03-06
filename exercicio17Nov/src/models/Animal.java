package models;

public class Animal {

	protected String nome;//acessivel somente aos filhos
	protected Integer idade;
	protected Float tamanho;
	protected Float peso;
	protected Long identificador;//sempre para identificador

	public Animal() {
		super();
	}

	public Animal(Long identificador, String nome, Integer idade, Float tamanho, Float peso) {
		super();
		this.identificador=identificador;
		this.nome = nome;
		this.idade = idade;
		this.tamanho = tamanho;
		this.peso = peso;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Float getTamanho() {
		return tamanho;
	}

	public void setTamanho(Float tamanho) {
		this.tamanho = tamanho;
	}

	public Float getPeso() {
		return peso;
	}

	public void setPeso(Float peso) {
		this.peso = peso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void dizerOla() {//novo metodo diferenciado
		System.out.println("Olá eu sou um Animal!");
	}

	public Long getIdentificador() {
		return identificador;
	}

	public void setIdentificador(Long identificador) {
		this.identificador = identificador;
	}

}
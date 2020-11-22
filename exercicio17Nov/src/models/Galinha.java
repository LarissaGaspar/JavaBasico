package models;

public class Galinha extends Animal {

	private Float tamanhoDoPoleiro;

	public Float getTamanhoDoPoleiro() {
		return tamanhoDoPoleiro;
	}

	public void setTamanhoDoPoleiro(Float tamanhoDoPoleiro) {
		this.tamanhoDoPoleiro = tamanhoDoPoleiro;//metodo diferenciado
	}

	@Override
	public void dizerOla() {
		System.out.println("Olá eu sou uma Galinha!");
	}
	
	
}
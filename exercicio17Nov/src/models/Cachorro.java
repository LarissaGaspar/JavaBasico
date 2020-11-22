package models;

import util.Tradutor;

public class Cachorro extends Animal {

	private Boolean possuiCama;

	public Cachorro() {

	}

	public Boolean getPossuiCama() {
		return possuiCama;
	}

	public void setPossuiCama(Boolean possuiCama) {//metodo específico para essa classe
		this.possuiCama = possuiCama;
	}
	@Override
	public void dizerOla() {//metodo presente na classe extendida(Animal)
		System.out.println("Olá eu sou uma Cachorro!");
	}

	public String getTraducaoPossuiCama(){
		return Tradutor.traduzir(this.possuiCama);//valor de pussuiCama
	}
}
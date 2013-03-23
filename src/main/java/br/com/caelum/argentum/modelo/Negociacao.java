package br.com.caelum.argentum.modelo;

import java.util.Calendar;

public final class Negociacao {
	private final double preco;
	private final int quantidade;
	private final Calendar data;

	public Negociacao(double preco, int quantidade, Calendar data) {
		if (data == null){
			throw new IllegalArgumentException("A data não pode ser nula!");
		}
		this.preco = preco;
		this.quantidade = quantidade;
		this.data = data;
	}

	public double getPreco() {
		return preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public Calendar getData() {
		// return this.data;
		return (Calendar) this.data.clone();
	}
	
	public double getVolume(){
		return quantidade * preco;
	}
	
}

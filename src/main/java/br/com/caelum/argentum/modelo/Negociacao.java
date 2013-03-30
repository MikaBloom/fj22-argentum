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
		return (Calendar) this.data.clone(); // sure the data is immutable 
	}
	
	public double getVolume(){
		return quantidade * preco;
	}

	public boolean isMesmoDia(Calendar outraData) {
		return 	data.get(Calendar.DATE) == outraData.get(Calendar.DATE) &&
				data.get(Calendar.MONTH) == outraData.get(Calendar.MONTH) &&
				data.get(Calendar.YEAR) == outraData.get(Calendar.YEAR) ;
	}
	
}

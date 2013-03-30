package br.com.caelum.argentum.modelo;

import java.text.SimpleDateFormat;
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

//	@Override
//	public int compareTo(Negociacao outraNegociacao) {
//		final int BEFORE = -1;
//		final int EQUAL = 0;
//		final int AFTER = 1;
//		
//		// Comparacao de referencia 
//		if (this == outraNegociacao) return EQUAL;
//		
//		if (this.getData().get(Calendar.DATE) == outraNegociacao.getData().get(Calendar.DATE) &&
//			this.getData().get(Calendar.MONTH) == outraNegociacao.getData().get(Calendar.MONTH) &&
//			this.getData().get(Calendar.YEAR) == outraNegociacao.getData().get(Calendar.YEAR))
//			return EQUAL;
//			
//		if (this.getData().get(Calendar.YEAR) > outraNegociacao.getData().get(Calendar.YEAR) ||
//			this.getData().get(Calendar.MONTH) > outraNegociacao.getData().get(Calendar.MONTH) ||
//			this.getData().get(Calendar.DATE) > outraNegociacao.getData().get(Calendar.DATE))
//			return AFTER;
//		
//		else if (this.getData().get(Calendar.YEAR) < outraNegociacao.getData().get(Calendar.YEAR) ||
//				this.getData().get(Calendar.MONTH) < outraNegociacao.getData().get(Calendar.MONTH) ||
//				this.getData().get(Calendar.DATE) < outraNegociacao.getData().get(Calendar.DATE))
//			return BEFORE;
//	
//		assert this.equals(outraNegociacao);
//		return EQUAL;
//	}
//	
//	public boolean equals(Negociacao outraNegociacao){
//		return 	this.getData().get(Calendar.DATE) == outraNegociacao.getData().get(Calendar.DATE) &&
//				this.getData().get(Calendar.MONTH) == outraNegociacao.getData().get(Calendar.MONTH) &&
//				this.getData().get(Calendar.YEAR) == outraNegociacao.getData().get(Calendar.YEAR) ;
//		
//	}
	
//
	@Override
	public String toString() {
		
		return "Negociacao [preco=" + preco + ", quantidade=" + quantidade
				+ ", data=" + new SimpleDateFormat("dd/MM/yyyy").format(data.getTime()) + "]";
	}

//		public String toString() {
//		
//		return "Negociacao [data=" + new SimpleDateFormat("dd/MM/yyyy").format(data.getTime()) + "]";
//	
//		
//		}
	
		
	
}

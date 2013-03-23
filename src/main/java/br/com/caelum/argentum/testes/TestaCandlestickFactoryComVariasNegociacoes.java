package br.com.caelum.argentum.testes;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import br.com.caelum.argentum.modelo.Candlestick;
import br.com.caelum.argentum.modelo.CandlestickFactory;
import br.com.caelum.argentum.modelo.Negociacao;

public class TestaCandlestickFactoryComVariasNegociacoes {

	public static void main(String[] args) {
		Calendar hoje = Calendar.getInstance();
		
		CandlestickFactory fabrica = new CandlestickFactory();
		
//		Negociacao nego1 = new Negociacao(40.5,100,hoje);
//		Negociacao nego2 = new Negociacao(45.0,100,hoje);
//		Negociacao nego3 = new Negociacao(49.8,100,hoje);
//		Negociacao nego4 = new Negociacao(53.3,100,hoje);
		
		Negociacao nego1 = new Negociacao(53.3,100,hoje);
		Negociacao nego2 = new Negociacao(49.8,100,hoje);
		Negociacao nego3 = new Negociacao(45.0,100,hoje);
		Negociacao nego4 = new Negociacao(40.5,100,hoje);
		
		List<Negociacao> negociacoes = Arrays.asList(nego1,nego2,nego3,nego4);
		
		
		Candlestick candle = fabrica.constroiCandleParaData(hoje, negociacoes);
		
		System.out.println(candle);
		
	}
	
}

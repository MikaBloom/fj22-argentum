package br.com.caelum.argentum.modelo;

import java.util.Calendar;

import junit.framework.Assert;

import org.junit.Test;

public class CandlestickTest {

	@Test(expected = IllegalArgumentException.class)
	public void precoMaximoNaoPodeSerMenorQueMinimo() {
		new Candlestick(10, 20, 20, 10, 10000, Calendar.getInstance());
	}

	@Test(expected = IllegalArgumentException.class)
	public void dataNaoPodeSerNula() {
		new Candlestick(30, 45, 10, 55, 150000, null);
	}

	@Test(expected = IllegalArgumentException.class)
	public void valoresNaoPodemSerNegativos() {
		new Candlestick(-10, -20, -30, -10, -150000, Calendar.getInstance());
	}
	
	@Test
	public void quandoAberturaIgualFechamentoEhAlta(){
		Candlestick candle = new Candlestick(45.0, 45.0, 20, 55.5, 4050.0, Calendar.getInstance());
		Assert.assertTrue(candle.isAlta());
	}
	
}

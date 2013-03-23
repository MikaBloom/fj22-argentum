package br.com.caelum.argentum.modelo;


import java.util.Calendar;

import org.junit.Test;

public class CandlestickTest {
	
	@Test(expected=IllegalArgumentException.class)
	public void precoMaximoNaoPodeSerMenorQueMinimo(){
		new Candlestick(10,20,20,10,10000,Calendar.getInstance());
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void dataNaoPodeSerNula(){
		new Candlestick(30,45,10,55,150000,null);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void valoresNaoPodemSerNegativos(){
		new Candlestick(-10,-20,-30,-10,-150000,Calendar.getInstance());
	}

}

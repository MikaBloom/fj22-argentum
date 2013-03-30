package br.com.caelum.argentum.modelo;


import java.util.Calendar;
import java.util.GregorianCalendar;

import junit.framework.Assert;

import org.junit.Test;

public class NegociacaoTest {

	@Test
	public void dataDaNegociacaoEhImutavel() {
		// criando o negocio no dia 15
		Calendar c = Calendar.getInstance();
		c.set(Calendar.DAY_OF_MONTH, 15);
		Negociacao n = new Negociacao(10, 5, c);

		// tentando mudar para dia 20
		n.getData().set(Calendar.DAY_OF_MONTH, 20);

		Assert.assertEquals(15, n.getData().get(Calendar.DAY_OF_MONTH));

	}

	@Test(expected = IllegalArgumentException.class)
	public void naoCriaNegociacaoComDataNula() {
		new Negociacao(10, 5, null);
	}

	@Test
	public void mesmoMilissegundoEhDoMesmoDia(){
		Calendar agora = Calendar.getInstance();
		Calendar mesmoMomento = (Calendar) agora.clone();
		Negociacao negociacao = new Negociacao(40.0, 100, agora);
		
		Assert.assertTrue(negociacao.isMesmoDia(mesmoMomento));
	}
	
	@Test
	public void comHorariosDiferentesEhMesmoDia(){
		// GregorianCalendar(ano, mes, dia, hora, minuto)
		Calendar manha = new GregorianCalendar(2011,10,20,8,30);
		Calendar tarde = new GregorianCalendar(2011,10,20,15,30);
		
		Negociacao negociacao = new Negociacao(40.0, 100, manha);
		
		Assert.assertTrue(negociacao.isMesmoDia(tarde));
		
	}
	
	@Test
	public void mesmoDiaMasMesesDiferentesNaoSaoDoMesmoDia(){
		Calendar mes = new GregorianCalendar(2011,10,20,8,30);
		Calendar outroMes = new GregorianCalendar(2011,11,20,15,30);
		
		Negociacao negociacao = new Negociacao(40.0, 100, mes);
		
		Assert.assertFalse(negociacao.isMesmoDia(outroMes));
		
	}
	@Test
	public void mesmoDiaMasAnosDiferentesNaoSaoDoMesmoDia(){
		Calendar ano = new GregorianCalendar(2011,10,20,8,30);
		Calendar outroAno = new GregorianCalendar(2012,10,20,15,30);
		
		Negociacao negociacao = new Negociacao(40.0, 100, ano);
		
		Assert.assertFalse(negociacao.isMesmoDia(outroAno));
		
	}
	
	
	
	
}

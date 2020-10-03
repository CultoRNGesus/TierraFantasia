package Razas;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;


public class NortaichianTest {
	
	@Test
	void TestRecibirDano() {
		Nortaichian Nort = new Nortaichian();
		RazaParaTest otro = new RazaParaTest();
		otro.atacar(Nort);
		assertEquals(Nort.salud,54);
	}
	
	
	@Test
	void AtaquesCargados() {
		Nortaichian Nort = new Nortaichian();
		RazaParaTest otro = new RazaParaTest(new Punto(5,5));
		Nort.recibirAtaque(1);
		Nort.recibirAtaque(1);
		Nort.recibirAtaque(1);
		Nort.atacar(otro);
		assertEquals(otro.salud,0);
	}
	
	@Test
	void AtacarTest() {
		Nortaichian Nort = new Nortaichian();
		RazaParaTest otro = new RazaParaTest();
		Nort.atacar(otro);
		
	}
}

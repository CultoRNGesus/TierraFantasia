package Razas;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import Misc.Punto;

public class NortaichianTest {
	
	@Test
	void TestRecibirDano() {
		Nortaichian Nort = new Nortaichian();
		RazaParaTest otro = new RazaParaTest();
		otro.atacar(Nort);
		assertEquals(Nort.salud,54);
	}
	
	@Test
	void TestDescansar() {
		Nortaichian Nort = new Nortaichian();
		Nort.recibirAtaque(64*0.03);
		Nort.descansar();
		assertEquals(Nort.salud,63);
		
	}
	
	@Test
	void AtaquesCargados() {
		Nortaichian Nort = new Nortaichian();
		RazaParaTest otro = new RazaParaTest(new Punto(5,5));
		Nort.recibirAtaque(1);
		Nort.recibirAtaque(1);
		Nort.recibirAtaque(1);
		Nort.atacar(otro);
		assertEquals(otro.salud,85);
	}
	
	@Test
	void AtacarTest() {
		Nortaichian Nort = new Nortaichian();
		RazaParaTest otro = new RazaParaTest();
		Nort.atacar(otro);
		
	}
}
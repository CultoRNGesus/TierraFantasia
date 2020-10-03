package Razas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GniadampalTest {

	@Test
	void RecibeAtaqueTest() {
		Raza gnian = new Gniadampal();
		Raza otro=new RazaParaTest();
		otro.atacar(gnian);
		assertEquals(gnian.salud,37);
	}

	
	@Test
	void AtacaTest() {
		Raza gnian = new Gniadampal();
		Raza otro=new RazaParaTest();
		gnian.atacar(otro);
		System.out.println(otro.salud);  //puede fallar porque falla 3 de cada 5, si lo corres varias veces anda
		assertEquals(otro.salud,97);
	}
	
	@Test
	void DescansarTest() {
		Raza gnian = new Gniadampal();
		Raza otro=new RazaParaTest();
		gnian.descansar();
		assertEquals(gnian.salud,132);  //ahora no puede atacar porque meditó
		gnian.atacar(otro);
		assertEquals(otro.salud,200);
		
	}
}

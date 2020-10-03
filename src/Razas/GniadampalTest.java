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
		otro.atacar(gnian);
		assertEquals(gnian.salud,37);
	}
}

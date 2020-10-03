package Razas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class KaiampalTest {

	@Test
	void testRecibirAtaque() {
		
		Kaiampal k = new Kaiampal(new Punto (0,0));
		RazaParaTest rt = new RazaParaTest();
		
		rt.atacar(k);
				
		assertEquals( 147.4 , k.salud);
		
	}
	
	

}

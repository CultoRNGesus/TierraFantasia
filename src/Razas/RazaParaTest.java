package Razas;

public class RazaParaTest extends Raza {

	public RazaParaTest() {
		super(200,new Punto(0,0),10);
	}
	
	@Override
	public void descansar() {
		// TODO Auto-generated method stub
		super.descansar();
	}

	@Override
	public void atacar(Raza otro) {
		super.atacar(otro);
		otro.recibirAtaque(danoAtaque);
	}

	@Override
	public void recibirAtaque(double dano) {
		super.recibirAtaque(dano);
	}

	
}

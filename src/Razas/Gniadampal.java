package Razas;

public class Gniadampal extends Raza{
	
	private static double saludMax;
	
	public Gniadampal() {
		super(57,new Punto(0,0),103);
	}

	@Override
	public void atacar(Raza otro) {
		super.atacar(otro);
		
	}

	@Override
	public void descansar() {
		super.descansar();
	}

	@Override
	public void recibirAtaque(double dano) {
		
	}
	
}

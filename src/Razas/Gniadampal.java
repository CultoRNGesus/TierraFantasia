package Razas;

public class Gniadampal extends Raza {

	private double saludMax;
	private boolean puedeAtacar;
	private static int rangoAtaque = 18;

	public Gniadampal() {
		super(57, new Punto(0, 0), 103);
	}

	@Override
	public void atacar(Raza otro) {
		if (this.puedeAtacar == false)
			return;
		super.atacar(otro);
		if (otro.posicion.distAPunto(this.posicion) > rangoAtaque)
			return;
		int randomNum = (int) (Math.random() * 5) + 1;
		if (randomNum > 2)
			return;
		otro.recibirAtaque(this.danoAtaque);

	}

	@Override
	public void descansar() {
		super.descansar();
		this.puedeAtacar = false;
		this.saludMax += 75;
		this.salud += 75;
		if (this.salud > this.saludMax)
			this.salud = this.saludMax;
	}

	@Override
	public void recibirAtaque(double dano) {
		super.recibirAtaque(dano * 2);
	}

}

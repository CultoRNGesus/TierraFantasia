package Razas;

public class Nortaichian extends Raza {

	private int saludMax = 64;
	private int ataquesCargados = 0;
	private static int rangoMin = 6;
	private static int rangoMax = 45;

	public Nortaichian() {
		super(64, new Punto(0, 0), 115);
		// TODO Auto-generated constructor stub
	}

	public Nortaichian(Punto posicion) {
		super(64, posicion, 115);
		// TODO Auto-generated constructor stub
	}

	public void atacar(Raza otro) {
		super.atacar(otro);
		int dist = (int) this.posicion.distAPunto(otro.posicion);
		if (this.salud > 0 && otro.salud > 0 && dist >= rangoMin && dist <= rangoMax) {
			if (this.ataquesCargados > 0) {
				otro.recibirAtaque(this.danoAtaque * 4);
				this.ataquesCargados--;
			} else {
				otro.recibirAtaque(this.danoAtaque);
			}
			this.salud+=this.saludMax*0.03;
		}
	}

	public void descansar() {
		super.descansar();
		this.ataquesCargados = 3;
	}

	public void recibirAtaque(double dano) {
		super.recibirAtaque(dano);
	}
}

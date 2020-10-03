package Razas;

import Misc.Punto;

public class Erseanian extends Raza {

	private int saludMax = 176;
	private int ataquesRecibidos = 0;
	private static int rangoMax = 45;
	private static int rangoMin = 15;
	private int turnosPiedra = 0;

	public Erseanian() {
		super(176, new Punto(0, 0), 40);
	}

	public Erseanian(Punto posicion) {
		super(176, posicion, 40);
	}

	public void descansar() {
		super.descansar();
		this.salud = this.saludMax;
		turnosPiedra = 3;

	}

	public void atacar(Raza otro) {
		super.atacar(otro);
		if (this.turnosPiedra > 0) {
			this.turnosPiedra--;
			return;
		}
		double dist = this.getPosicion().distAPunto(otro.getPosicion());
		if (this.salud > 0 && otro.getSalud() > 0 && dist >= rangoMin && dist <= rangoMax) {
			otro.recibirAtaque(this.danoAtaque + Math.pow(3, this.ataquesRecibidos));
		}
		
	}

	public void recibirAtaque(double dano) {
		if (turnosPiedra == 0) {
			super.recibirAtaque(dano * 0.5);
			this.turnosPiedra--;
		}
		ataquesRecibidos++;
	}

}

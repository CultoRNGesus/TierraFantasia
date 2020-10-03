package Razas;

public abstract class Raza {

	private int salud;
	private Punto posicion;
	private int danoAtaque;
	private static int turno = 0 ;
			
	public Raza(int salud, Punto posicion, int danoAtaque) {
		this.salud = salud;
		this.posicion = posicion;
		this.danoAtaque = danoAtaque;
	}

	public static int getTurno() {
		return turno;
	}
		
	public static void setTurno(int turno) {
		Raza.turno = turno;
	}
	
	public void descansar() {
		turno++;
	}
	
	public void atacar( Raza otro) {
		turno++;
	}
	
	public void recibirAtaque( double dano) {}
		
}
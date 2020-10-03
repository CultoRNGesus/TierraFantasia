package Razas;

public abstract class Raza {

	private int salud;
	private int saludMax;
	private Punto posicion;
	private int danoAtaque;
	private static int turno = 0 ;
	
		
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

package Razas;

public class Punto {

	private double coordx, coordy;

	public Punto(double x, double y) {
		this.coordx = x;
		this.coordy = y;

	}

	public double distAPunto(Punto p) {

		double dx = p.coordx - this.coordx;
		double dy = p.coordy - this.coordy;

		return (Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2)));
	}

}

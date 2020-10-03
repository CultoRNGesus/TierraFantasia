package Razas;

public class Kaiampal extends Raza{

	private static int rangoMax = 10;
	
	public Kaiampal( Punto pos ) {
		
		super( 144 , pos , 29 );		
				
	}

	@Override
	public void descansar() {
		super.descansar();
				
	}

	@Override
	public void atacar(Raza otro) {
		super.atacar(otro);
		if( super.posicion.distAPunto( otro.posicion ) < rangoMax ) {
			otro.recibirAtaque( super.danoAtaque * 0.6 );
		}
	}

	@Override
	public void recibirAtaque(double dano) {
		super.recibirAtaque(dano);
		salud += super.salud * 0.10;
	}
	
	
	
	

}

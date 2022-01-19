package ej3;

public class Vendedor {

	Movil moviles[];


	public Vendedor(Movil[] moviles) {
		super();
		this.moviles = moviles;
	}

	public Movil[] getMoviles() {
		return moviles;
	}

	public void setMoviles(Movil[] moviles) {
		this.moviles = moviles;
	}
	
	//METODOS
	
	public void addMovil(Movil movil, int i) {
		moviles[i]=movil;
	}
	
	public void mostarListaMovil(int i, Vendedor v) {
		
		System.out.println(v.getMoviles()[i].getMarca());
		System.out.println(v.getMoviles()[i].getModelo());
		System.out.println(v.getMoviles()[i].getPrecio());
		System.out.println();
	}
	
}

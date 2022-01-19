package ej2;


public class Hotel {

	private Habitacion[] habitaciones;

	public Hotel(Habitacion[] habitaciones) {
		this.habitaciones = habitaciones;
	}
	
	public Hotel() {
	}
	
	public Habitacion[] getHabitaciones() {
		return habitaciones;
	}



	public void setHabitaciones(Habitacion[] habitaciones) {
		this.habitaciones = habitaciones;
	}


//METODOS
	
	public void altaHabitacion(Habitacion habitacion, int i) {
		
		habitaciones[i]=habitacion;
		i++;
	}
	
	public void addLong(int i) {
		
		habitaciones= new Habitacion[i];
	}
	
	public void bajaHabitacion(Hotel h, int i) {
		
		h.getHabitaciones()[i].setCliente(null);
		h.getHabitaciones()[i].setnDias(0);
		h.getHabitaciones()[i].setServicioExtra(0);

	}
	
	public void cambiarLimpieza(int i, Hotel h, int num) {
		if(num==1) {
			h.getHabitaciones()[i].setLimpio(true);
		}
		else if(num==2) {
			h.getHabitaciones()[i].setLimpio(false);

		}
		
	}
	
	public void cambiarOcupado(int i, Hotel h, int num) {
		if(num==1) {
			h.getHabitaciones()[i].setOcupada(true);
		}
		else if(num==2){
			h.getHabitaciones()[i].setOcupada(false);
		}
	}
	
	public boolean comprobarLimpieza(int i) {
		return habitaciones[i-1].isLimpio();
	}
	
	public void imprimirLimpieza(int i) {
		if(comprobarLimpieza(i)) {
			System.out.print("Limpia");
		}
		else {
			System.out.print("Sucia");
		}
	}
	
	public double precioFinal(Hotel h, int i) {
		
		double precioFinal;
		precioFinal=h.getHabitaciones()[i].getPrecio()*h.getHabitaciones()[i].getnDias();	
		
		return precioFinal;
	}


	public void mostarDatos(Hotel h, int i) {
		System.out.println("Cliente: "+h.getHabitaciones()[i].getCliente());
		System.out.println("Tipo habitacion: "+h.getHabitaciones()[i].getTipo());
		System.out.println("Precio al dia: "+h.getHabitaciones()[i].getPrecio());
		System.out.println("Numero de dias: "+h.getHabitaciones()[i].getnDias());
		System.out.print("Estado limpieza: ");imprimirLimpieza(i);
	}
	
	
	
}

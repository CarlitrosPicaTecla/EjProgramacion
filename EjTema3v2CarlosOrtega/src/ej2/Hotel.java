package ej2;

public class Hotel {

	private Habitacion[] habitaciones;

	public Hotel(Habitacion[] habitaciones) {
		super();
		this.habitaciones = habitaciones;
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
	
	
	public double precioFinal() {
		
	}
}

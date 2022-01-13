package ej9;

public class Maquina {

	private Ticket billete;
	
	
	public Maquina() {
		
	}
	
	public double comprarBillete(int cant, Ticket ticket) {
		
		double total;
		total=ticket.getPrecio()*cant;
		return total;
	}
	
	public double cambioDinero(double total, double dinero) {
		double cambio;
		cambio=dinero-total;
		return cambio;
	}
	
	public void imprimirBillete(int cant, double total) {
		System.out.println("-------------------------------------");
		System.out.println("-                                   -");
		System.out.println("- Ticket de metro                   -");
		System.out.println("-                                   -");
		System.out.println("-                                   -");
		System.out.println("-                                   -");
		System.out.println("-                                   -");
		System.out.println("-           Precio:"+total+"€             -");
		System.out.println("-    valido para "+cant+" personas         -");
		System.out.println("-------------------------------------");


	}
	
	
}


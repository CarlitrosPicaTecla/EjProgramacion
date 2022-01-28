package ej2;

public class TarjetaVisita extends Documento{

	private String nombrePersona;
	private int tlf;
	private String email;
	
	public TarjetaVisita(String nombre, String cif, String direccion, String nombrePersona, int tlf, String email) {
		super(nombre, cif, direccion);
		this.nombrePersona = nombrePersona;
		this.tlf = tlf;
		this.email = email;
	}

	public String getNombrePersona() {
		return nombrePersona;
	}

	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}

	public int getTlf() {
		return tlf;
	}

	public void setTlf(int tlf) {
		this.tlf = tlf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	//Metodos
	
	
	
	public void imprimirTarjeta() {
		System.out.println(getNombre());
		super.imprimirDocumento();
		System.out.println("E-Mail"+getEmail());
		System.out.println("Telefono: "+getTlf());
	}

	@Override
	public String toString() {
		return "TarjetaVisita [nombrePersona=" + nombrePersona + ", tlf=" + tlf + ", email=" + email + "]";
	}
	
	
	}



	
	
	


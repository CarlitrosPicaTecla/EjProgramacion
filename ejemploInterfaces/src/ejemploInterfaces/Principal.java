package ejemploInterfaces;

public class Principal {

	public static void main(String[] args) {

		Musica m= new Musica(); 
		Instrumento[] orquesta = new Instrumento[5];

		int i = 0;
		orquesta[i++] = new Guitarra();
		orquesta[i++] = new Piano();
		orquesta[i++] = new Saxofon();
		orquesta[i++] = new Guzla();
		orquesta[i++] = new Ukelele();
		m.afinarTodo(orquesta);
	}

}

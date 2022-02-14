package ejemploInterfaces;

public class Musica {
	static void afinar(Instrumento i) {
		// ...
		i.tocar();
		 }
		 static void afinarTodo(Instrumento[] e) {
		for(int i = 0; i<e.length; i++)
		afinar(e[i]);
		}
}

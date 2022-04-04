package ej1v2;

import java.time.Duration;
import java.util.HashSet;
import java.util.Set;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Cancion>lista=new HashSet<Cancion>();
		Cancion c;
		int numMenu;
		String aux="";
		Long segundos;
		
		Duration d=Duration.ofSeconds(0);
		
		lista.add(c=new Cancion("War Pigs", "Black Sabbath", Duration.ofSeconds(480), "Metal"));
		lista.add(c=new Cancion("L.A. Woman","Doors", Duration.ofSeconds(475), "Rock"));
		lista.add(c=new Cancion("HearthBreaker", "Led Zeppelin", Duration.ofSeconds(240), "Rock"));
		lista.add(c=new Cancion( "Cant Stand Loosing You", "The Police", Duration.ofSeconds(200), "Rock"));
		lista.add(c=new Cancion( "Oye como va", "Santana", Duration.ofSeconds(220), "Rock"));
		lista.add(c=new Cancion( "Oso Panda", "Lendakaris Muertos", Duration.ofSeconds(80), "Punk"));
		lista.add(c=new Cancion( "Cerebros destruidos", "Eskorbuto", Duration.ofSeconds(200), "Punk"));
		lista.add(c=new Cancion( "Como Camaron", "Estopa", Duration.ofSeconds(160), "Rumba"));
		lista.add(c=new Cancion( "Nube de Pegatina", "Los delinquentes", Duration.ofSeconds(260), "Rumba"));
		lista.add(c=new Cancion( "Diva Virtual", "Don Omar", Duration.ofSeconds(200), "Regueton"));
		lista.add(c=new Cancion( "Tu me dejaste caer", "Daddy Yankee", Duration.ofSeconds(200), "Regueton"));

		
		CrudCancion cc = new CrudCancion(lista);
		
		
		do {
			System.out.println("1.Buscar por nombre");
			System.out.println("2.Buscar por autor");
			System.out.println("3.Buscar por duracion");
			System.out.println("4.Numero de canciones por genero");
			System.out.println("5.Mostrar canciones que duran mas que otra cancion");

			numMenu=Leer.datoInt();

			
			switch (numMenu) {
			case 1:
				System.out.println("Introduce nombre de cancion");
				aux=Leer.dato();
				System.out.println(cc.buscarCancionNombre(aux));
				
				break;
			case 2:
				System.out.println("Introduce autor");
				aux=Leer.dato();
				System.out.println(cc.buscarCancionAutor(aux));
				
				break;
			case 3:
				
			
				System.out.println("Introduce tiempo en segundos");
				segundos=Leer.datoLong();
				System.out.println(cc.buscarCancionDuracion(segundos));

				break;
			case 4:
				System.out.println("Introduce genero");
				aux=Leer.dato();
				System.out.println(cc.nCancionesGenero(aux));
				break;
			case 5:
				
				break;


			}
			
		} while (numMenu!=0);
		
		
		
		
	}

}

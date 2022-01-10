package ej9;

public class Ej9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double navas=1500, campNou=99354, u2=65000, resultadoTotal=0, teatro=600, resultadoCampNou=0, resultadoU2=0, resultadoTeatro;
		
		resultadoCampNou=campNou/navas;
		resultadoU2=u2/navas;
		resultadoTeatro=teatro/navas;
		
		resultadoTotal=resultadoCampNou+resultadoU2+resultadoTeatro;
		
		System.out.printf("El estadio del Camp Nou podría contener %.2f navas\nEl concierto de U2 podría contener %.2f navas\n"
				+ "El teatro podría contener %.2f navas\n\nHaciendo un total de %.2f navas", resultadoCampNou, resultadoU2, resultadoTeatro, resultadoTotal);
	}

}

package aula01;

import java.util.ArrayList;
import java.util.Collections;

public class TestaListagem {

	public static void main(String[] args) {
		String aula1 = "aula um";
		String aula2 = "aula dois";
		String aula3 = "aula tr�s";

		ArrayList<String> aulas = new ArrayList<>();

		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);

		System.out.println(aulas);

		/*
		 * usando foreach
		 * 
		 * for(String aula : aulas) { System.out.println(aula + "\n"); }
		 */
		// m�todo forEach: para cada aula que existe execute essa linha de c�digo
		//para cada refer�ncia ao objeto, fa�a "->{}"

		aulas.forEach(aula -> {
			System.out.println("Performando");
			System.out.println("aula: " + aula);
		});
		Collections.sort(aulas);
		System.out.println(aulas);
	}
	
}

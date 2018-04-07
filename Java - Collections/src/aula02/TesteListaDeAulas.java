package aula02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TesteListaDeAulas {

	public static void main(String[] args) {
		Aula aula1 = new Aula("Revisando ArrayList", 21);
		Aula aula2 = new Aula("Listas de Objetos", 15);
		Aula aula3 = new Aula("Relacionamento de listas e Objetos", 19);
		
		ArrayList<Aula> lista = new ArrayList<>();
		
		lista.add(aula1);
		lista.add(aula2);
		lista.add(aula3);
		
		Collections.sort(lista);
		System.out.println("Lista de aulas:");
		lista.forEach(aulas -> {
			
			System.out.println("\n" + aulas);
		});
		
		//passando que método vc quer que seja usado para ele comparar
		//ordena as aulas comparando p tempo das aulas
		//pode ser tb: aulas.sort(cComparartor....)
		Collections.sort(lista, Comparator.comparing(Aula::getTempo));
		System.out.println("-----------------------------------------------");
		System.out.println("Lista de aulas:");
		lista.forEach(aulas -> {
			
			System.out.println("\n" + aulas);
		});
		
	}
/*
 * Revistando as ArrayLists", 21);
        Aula a2 = new Aula("Listas de objetos", 20);
        Aula a3 = new Aula("Relacionamento de listas e objetos", 15);

 */
}

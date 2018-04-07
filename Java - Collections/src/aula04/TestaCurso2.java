package aula04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import aula02.Aula;
import aula03.Curso;

public class TestaCurso2 {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Java - Collections", "Paulo Silveira");
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 19));
		javaColecoes.adiciona(new Aula("Modelando com Coleções", 20));
		
		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		System.out.println(aulasImutaveis);
		
		List<Aula> aulas = new ArrayList<>(aulasImutaveis);
		
		Collections.sort(aulas);
		System.out.println(aulas);
		System.out.println(javaColecoes.getTempoTotal());
		
		System.out.println(javaColecoes);
	}

}

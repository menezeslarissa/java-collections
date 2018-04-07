package aula03;

import aula02.Aula;

public class TesteCurso {
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando coleções", "Paulo Silveira");
		/*
		 * javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList",21)); não funcionar por causa do 
		 * Collections.unmodifiableList(aulas)
		 */
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		
		System.out.println(javaColecoes.getAulas());
	}
}

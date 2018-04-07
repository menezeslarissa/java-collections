package aula06;

import aula02.Aula;
import aula03.Curso;

public class TestaCursoComAluno {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Java - Collections", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 19));
		javaColecoes.adiciona(new Aula("Modelando com Coleções", 20));
		
		Aluno a1 = new Aluno("Larissa Pessoa", "2016118970108");
		Aluno a2 = new Aluno("João Pereira", "2016118970198");
		Aluno a3 = new Aluno("Manoel Carlos", "20176518970108");
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println(javaColecoes.getAlunos());
	}

}

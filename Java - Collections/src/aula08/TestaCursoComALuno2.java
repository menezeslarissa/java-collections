package aula08;

import java.util.Iterator;
import java.util.Set;

import aula02.Aula;
import aula03.Curso;
import aula06.Aluno;

public class TestaCursoComALuno2 {

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
		
		Set<Aluno> alunos = javaColecoes.getAlunos();
		Iterator<Aluno> iterador = alunos.iterator();
		//enquanto tiver ele elemento ele vai iterando
		while(iterador.hasNext()){
			Aluno proximo = iterador.next();
			System.out.println(proximo);
		}

		System.out.println(javaColecoes.getAlunos());
	}

}

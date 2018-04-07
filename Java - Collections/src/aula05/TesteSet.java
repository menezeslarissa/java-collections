package aula05;

import java.util.HashSet;
import java.util.Set;

public class TesteSet {

	public static void main(String[] args) {
		Set<String> alunos = new HashSet<String>();
		
		alunos.add("Aluno A");
		alunos.add("Aluno B");
		alunos.add("Aluno C");
		alunos.add("Aluno D");
		alunos.add("Aluno E");
		
		for(String aluno : alunos) {
			System.out.println(aluno);
		
		}
		
		System.out.println();
		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});
		
		System.out.println(alunos.size());
		alunos.add("Aluno A");
		System.out.println();
		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});
		System.out.println(alunos.size());
		

	}

}

package aula03;
import aula06.Aluno;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import aula02.Aula;

public class Curso {
	private String nome;
	private String instrutor;
	//boas práticas usa a interface genérica
	
	private List<Aula> aulas = new LinkedList<Aula>();
	private Set<Aluno> alunos = new HashSet<>();
	private Map<String, Aluno> matriculaParaAluno = new HashMap<>();
	
	public Curso(String nome, String instrutor) {
		super();
		this.nome = nome;
		this.instrutor = instrutor;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getInstrutor() {
		return instrutor;
	}
	//programando defensivamente
	//devolve essa cópia de tal forma que ela não pode ser alterada
	 
	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas); //devolve uma cópia da coleção de aulas
	}
	
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}
	
	public int getTempoTotal() {
		/* int tempoTotal = 0;
		 * for (Aula aula : aulas) {
		 *	tempoTotal+= aula.getTempo();
		 *  }
		 * return tempoTotal;
		 */
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
	}

	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}
	@Override
	public String toString() {
		return "[Curso = " + this.nome + ", tempo = " + this.getTempoTotal();
	}

	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
		this.matriculaParaAluno.put(aluno.getMatricula(), aluno);
		
	}
	
	public boolean estaMatriculado (Aluno aluno){
		return this.alunos.contains(aluno);
	}
	
	public Aluno buscaPorMatricula(String matricula) {
		if(!matriculaParaAluno.containsKey(matricula)) {
			throw new NoSuchElementException("Matrícula não encontrada!");
		}
		return matriculaParaAluno.get(matricula);
	}
}

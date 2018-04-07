package aula06;

public class Aluno {
	private String nome;
	private String matricula;

	public Aluno() {

	}

	public Aluno(String nome, String matricula) {
		if(nome == null){
			throw new NullPointerException("Nome não pode ser nulo!");
		}		
		this.nome = nome;
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public String getMatricula() {
		return matricula;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", matricula=" + matricula + "]";
	}
	//sempre que escrever equals tem que escrever hashCode
	@Override
	public int hashCode() {
		//return this.nome.charAt(0);
		return this.nome.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		Aluno outro = (Aluno) obj;
		return this.nome.equals(outro.nome);
	}
	
	
}

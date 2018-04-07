package aula02;

public class Aula implements Comparable<Aula> {
	private String titulo;
	private int tempo;

	public Aula() {

	}

	public Aula(String titulo, int tempo) {
		super();
		this.titulo = titulo;
		this.tempo = tempo;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getTempo() {
		return tempo;
	}

	@Override
	public String toString() {
		return "Aula: \ntitulo = " + titulo + "\ntempo = " + tempo;
	}

	@Override
	public int compareTo(Aula outraAula) throws NullPointerException {
		return this.titulo.compareTo(outraAula.titulo);
	}

	
}

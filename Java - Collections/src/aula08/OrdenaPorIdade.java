package aula08;

import java.util.Comparator;

public class OrdenaPorIdade implements Comparator<Funcionario> {
	@Override
	public int compare(Funcionario f, Funcionario outro) {
		return f.getIdade() - outro.getIdade();
	}

}

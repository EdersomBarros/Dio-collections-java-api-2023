package set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable<Aluno> {
	// atributos
	private String nome;
	private Long matricula;
	private double media;

	public Aluno(String nome, Long matricula, double media) {
		this.nome = nome;
		this.matricula = matricula;
		this.media = media;
	}

	public String getNome() {
		return nome;
	}

	public Long getMatricula() {
		return matricula;
	}

	public double getMedia() {
		return media;
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(matricula, other.matricula);
	}

	@Override
	public int hashCode() {
		return Objects.hash(matricula);
	}

	@Override
	public int compareTo(Aluno aluno) {
		return nome.compareTo(aluno.getNome());
	}

	@Override
	public String toString() {
		return "Aluno{" + "nome='" + nome + '\'' + ", matricula=" + matricula + ", media=" + media + '}';
	}
}

class ComparatorNota implements Comparator<Aluno> {
	  @Override
	  public int compare(Aluno o1, Aluno o2) {
	    return Double.compare(o1.getMedia(), o2.getMedia());
	  }
	}



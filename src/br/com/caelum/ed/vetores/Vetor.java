package br.com.caelum.ed.vetores;

public class Vetor {

	private Aluno[] alunos = new Aluno[100000];

	private int totalDeAlunos = 0;

	public String toString() {
		if (this.totalDeAlunos == 0) {
			return "[]";
		}

		StringBuilder builder = new StringBuilder();
		builder.append("[");

		for (int i = 0; i < this.totalDeAlunos - 1; i++) {
			builder.append(this.alunos[i]);
			builder.append(", ");
		}

		builder.append(this.alunos[this.totalDeAlunos - 1]);
		builder.append("]");

		return builder.toString();
	}

	// metodo com tempo de processamento linear
	/*
	 * public void adiciona(Aluno aluno) { for (int i = 0; i <
	 * this.alunos.length; i++) { if (this.alunos[i] == null) { this.alunos[i] =
	 * aluno; break; } } }
	 */

	// metodo com tempo de processamento constante
	public void adiciona(Aluno aluno) {
		this.garantaEspaco();
		this.alunos[this.totalDeAlunos] = aluno;
		this.totalDeAlunos++;
	}

	public void adiciona(int posicao, Aluno aluno) {
		this.garantaEspaco();
		if (!this.posicaoValida(posicao)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		for (int i = this.totalDeAlunos - 1; i >= posicao; i--) {
			this.alunos[i + 1] = this.alunos[i];
		}
		this.alunos[posicao] = aluno;
		this.totalDeAlunos++;
	}

	public int tamanho() {
		return this.totalDeAlunos;
	}

	// metodo com tempo de processamento linear
	/*
	 * public boolean contem(Aluno aluno) { for (int i = 0; i <
	 * this.alunos.length; i++) { if (aluno == this.alunos[i]) { return true; }
	 * } return false; }
	 */

	// metodo com tempo de processamento constante
	public boolean contem(Aluno aluno) {
		for (int i = 0; i < this.totalDeAlunos; i++) {
			if (aluno == this.alunos[i]) {
				return true;
			}
		}
		return false;
	}

	public Aluno pegaSemValidacao(int posicao) {
		return this.alunos[posicao];
	}

	public Aluno pega(int posicao) {
		if (!this.posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		return this.alunos[posicao];
	}

	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < this.totalDeAlunos;
	}

	private boolean posicaoValida(int posicao) {
		return posicao >= 0 && posicao <= this.totalDeAlunos;
	}

	public void remove(int posicao) {
		if (!this.posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		for (int i = posicao; i < this.totalDeAlunos - 1; i++) {
			this.alunos[i] = this.alunos[i + 1];
		}
		this.totalDeAlunos--;
	}

	public void remove(Object objeto) {
		for (int i = 0; i < this.totalDeAlunos; i++) {
			if (this.alunos[i].equals((Aluno) objeto)){
				remove(i);
				i--;
			}
		}
	}
	
	public int indexOf(Object objeto) {
		for (int i = 0; i < this.totalDeAlunos; i++) {
			if (this.alunos[i].equals((Aluno) objeto)) {
				return i; 
			}
		}
		throw new IndexOutOfBoundsException();
	}
	
	public int lastIndexOf(Object objeto) {
		for (int i = this.totalDeAlunos-1; i > 0; i--) {
			if (this.alunos[i].equals((Aluno) objeto)) {
				return i; 
			}
		}
		throw new IndexOutOfBoundsException();
	}
	
	public void clear() {
		for (int i = 0; i < this.totalDeAlunos; i++)
			this.alunos[i] = null;
		this.totalDeAlunos = 0;
	}


	private void garantaEspaco() {
		if (this.totalDeAlunos == this.alunos.length) {
			Aluno[] novaArray = new Aluno[this.alunos.length * 2];
			for (int i = 0; i < this.alunos.length; i++) {
				novaArray[i] = this.alunos[i];
			}
			this.alunos = novaArray;
		}
	}

}

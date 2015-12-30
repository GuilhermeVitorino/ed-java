package br.com.caelum.ed.pilhas;

import java.util.LinkedList;
import java.util.List;

public class Peca {
	
	private List<Peca> pecas = new LinkedList<Peca>();

	public void insere(Peca peca) {
		this.pecas.add(peca);
	}

	public Peca remove() {
		return this.pecas.remove(this.pecas.size() - 1);
	}

	public boolean vazia() {
		return this.pecas.size() == 0;
	}
}

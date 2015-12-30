package br.com.caelum.ed.pilhas.testes;

import java.util.Stack;

import br.com.caelum.ed.pilhas.Peca;

public class TesteStack {
	
	public static void main(String[] args) {
		
		//Stack pilha = new Stack();
		Stack<Peca> pilha = new Stack<Peca>();
		Peca pecaInsere = new Peca();
		pilha.push(pecaInsere);
		
		Peca pecaRemove = (Peca) pilha.pop();
		
		if (pilha.isEmpty())
			System.out.println("A pilha está vazia");
	}
}

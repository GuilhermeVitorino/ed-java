package br.com.caelum.ed.listasLigadas.testes;

import br.com.caelum.ed.listasLigadas.ListaLigada;

public class TesteAdicionaNoFim {

	public static void main(String[] args) {

		ListaLigada lista = new ListaLigada();

		lista.adiciona("Rafael");
		lista.adiciona("Paulo");

		System.out.println(lista);
	}
}

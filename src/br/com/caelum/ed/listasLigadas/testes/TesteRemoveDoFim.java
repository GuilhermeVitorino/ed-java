package br.com.caelum.ed.listasLigadas.testes;

import br.com.caelum.ed.listasLigadas.ListaLigada;

public class TesteRemoveDoFim {
	
	public static void main(String[] args) {
		
		ListaLigada lista = new ListaLigada();
		
		lista.adiciona("Rafael");
		lista.adiciona("Paulo");
		
		lista.removeDoFim();
		
		System.out.println(lista);
	}
}

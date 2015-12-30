package br.com.caelum.ed.listasLigadas.testes;

import br.com.caelum.ed.listasLigadas.ListaLigada;

public class TesteAdicionaPorPosicao {
	
	public static void main(String[] args) {
		
		ListaLigada lista = new ListaLigada();
		lista.adiciona("Rafael");
		lista.adiciona(0, "Paulo");
		lista.adiciona(1, "Camila");
		System.out.println(lista);
	}
}

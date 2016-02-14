package br.com.caelum.ed.conjuntos;

public class TesteTamanho {
	public static void main(String[] args) {
		ConjuntoEspalhamento conjunto = new ConjuntoEspalhamento();
		conjunto.adiciona("Rafael");
		conjunto.adiciona("Ana");
		conjunto.adiciona("Paulo");
		conjunto.adiciona("Paulo");
		
		System.out.println(conjunto.tamanho());
		
	}
}

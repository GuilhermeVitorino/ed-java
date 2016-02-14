package br.com.caelum.ed.conjuntos;

public class TesteContem {
	public static void main(String[] args) {		
		ConjuntoEspalhamento conjunto = new ConjuntoEspalhamento();
		conjunto.adiciona("Rafael");
		conjunto.adiciona("Ana");
		conjunto.adiciona("Paulo");
		
		System.out.println(conjunto.contem("Rafael"));
		System.out.println(conjunto.contem("Leandro"));
		
		//add repitido
		conjunto.adiciona("Paulo");
		
		System.out.println(conjunto.tamanho());
	}
}

package br.com.caelum.ed.conjuntos;

public class TesteEspalhamento {
	public static void main(String[] args) {
		ConjuntoEspalhamento conjunto = new ConjuntoEspalhamento();
		
		for (int i = 0; i < 1; i++) {
			conjunto.adiciona("a");
			conjunto.adiciona("aa");
			conjunto.adiciona("aaa");
			conjunto.adiciona("aaaa");
			conjunto.adiciona("aaaaa");
			conjunto.adiciona("aaaaaa");
			conjunto.adiciona("aaaaaaa");
			conjunto.adiciona("aaaaaaaa");
			
			conjunto.adiciona("b");
			conjunto.adiciona("bb");
			conjunto.adiciona("bbb");
			conjunto.adiciona("bbbb");
			conjunto.adiciona("bbbbb");
			conjunto.adiciona("bbbbbb");
			conjunto.adiciona("bbbbbbb");
			conjunto.adiciona("bbbbbbbb");	
			
			
			conjunto.adiciona("c");
			conjunto.adiciona("d");
			conjunto.adiciona("e");
			conjunto.adiciona("f");
			conjunto.adiciona("g");
			conjunto.adiciona("h");
			
			System.out.println(conjunto.calculaIndiceDaTabela("aaaa"));
			System.out.println(conjunto.calculaIndiceDaTabela("c"));
			
		}
		
		conjunto.imprimeTabela();
	}
}

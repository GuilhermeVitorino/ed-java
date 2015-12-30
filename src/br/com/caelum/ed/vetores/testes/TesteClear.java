package br.com.caelum.ed.vetores.testes;

import br.com.caelum.ed.vetores.Aluno;
import br.com.caelum.ed.vetores.Vetor;

public class TesteClear {
	
	public static void main(String[] args) {

		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		Aluno a3 = new Aluno();
		Aluno a4 = new Aluno();
		Aluno a5 = new Aluno();
		Aluno a6 = new Aluno();
		Aluno a7 = new Aluno();
		Aluno a8 = new Aluno();
		Aluno a9 = new Aluno();
		Aluno a10 = new Aluno();

		a1.setNome("Rafael");
		a2.setNome("Paulo");
		a3.setNome("Paulo");
		a4.setNome("Paulo");
		a5.setNome("Paulo");
		a6.setNome("Paulo");
		a7.setNome("Paulo");
		a8.setNome("Paulo");
		a9.setNome("Paulo");
		a10.setNome("Guilherme");

		Vetor lista = new Vetor();

		lista.adiciona(a1);
		lista.adiciona(a2);
		lista.adiciona(a3);
		lista.adiciona(a4);
		lista.adiciona(a5);
		lista.adiciona(a6);
		lista.adiciona(a7);
		lista.adiciona(a8);
		lista.adiciona(a9);
		lista.adiciona(a10);
		
		System.out.println(lista);
		
		lista.clear();
		
		System.out.println(lista);
		System.out.println(lista.tamanho());
	}
}

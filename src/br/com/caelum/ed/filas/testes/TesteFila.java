package br.com.caelum.ed.filas.testes;

import br.com.caelum.ed.filas.Fila;
import br.com.caelum.ed.vetores.Aluno;

public class TesteFila {

	public static void main(String[] args) {

		Fila fila = new Fila();
		Aluno aluno = new Aluno();
		
		fila.insere(aluno);
		Aluno alunoRemovido = fila.remove();
		
		if (aluno != alunoRemovido) {
			System.out.println("Erro: o aluno removido não é " 
					+ " igual ao que foi inserido");
		}
		
		if (fila.vazia()) {
			System.out.println("A fila está vazia");
		}
	}
}

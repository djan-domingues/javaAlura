package br.com.alura;

import java.util.ArrayList;
import java.util.List;

public class TestaCurso02 {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Trabalhando com LinkedList", 11));
		javaColecoes.adiciona(new Aula("Trabalhando com List", 12));
		
		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		
		//como a aulasImutaveis vem do getAulas e ele é ReadOnly, nao poderiamos ordenar a lista, mas podemos criar um clone
		//da lista passando a lista principal no construtor
		List<Aula> aulas = new ArrayList<>(aulasImutaveis); 
		
		System.out.println(javaColecoes.getTempoTotal());
		
		

	}

}

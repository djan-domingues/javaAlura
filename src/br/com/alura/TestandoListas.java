package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {
		
		String aula1 = "conhecendo mais de listas";
		String aula2 = "modelando a classe aula";
		String aula3 = "trabalhando com Cursos e Sets";
		
		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		System.out.println(aulas);
		
		//removendo elementos
		aulas.remove(0);
		System.out.println(aulas);
		
		//percorrendo uma lista
		for (String aula : aulas) {
		    System.out.println("Aula: " + aula);
		}
		
		//acessando elementos 
		String primeiraAula = aulas.get(0);
		System.out.println("A primeira aula é " + primeiraAula);
		
		for (int i = 0; i < aulas.size(); i++) {
		    System.out.println("aula : " + aulas.get(i));
		}
		
		//lambda para cada aula dentro de aulas faça
		aulas.forEach(aula -> {
		    System.out.println("Percorrendo:");
		    System.out.println("Aula " + aula);
		});
		

		//ordenando listas
		Collections.sort(aulas);
		
		
		
		
		
		

	}

}

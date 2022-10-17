package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {
	
	private String nome;
	private String instrutuor;
	private List<Aula> aulas = new ArrayList<Aula>();
	private Set<Aluno> alunos = new HashSet<>();
	

	public Curso(String nome, String instrutuor) {
		super();
		this.nome = nome;
		this.instrutuor = instrutuor;
	}
	
	//devolve uma lista 'ReadOnly'
	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}
	
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}
	
	public int getTempoTotal() {
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
	}

	public String getNome() {
		return nome;
	}
	
	public String getInstrutuor() {
		return instrutuor;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[Curso: " + nome + ", tempo total: " + this.getTempoTotal() + "]";
	}
	
	public void matricular(Aluno aluno) {
		this.alunos.add(aluno);
	}
	
	public Aluno buscaMatriculado(int numero) {
		for (Aluno aluno : alunos) {
			if(aluno.getNumeroMatricula()== numero)
				return aluno;
		}
		throw new NoSuchElementException("matricula não encontrada " + numero);
		
	}
	

}

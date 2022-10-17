package br.com.alura;

public class TestaCursoAluno {
	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Trabalhando com LinkedList", 11));
		javaColecoes.adiciona(new Aula("Trabalhando com List", 12));
		
		Aluno a1 = new Aluno("Felipe Januario Domingues", 123456);
		Aluno a2 = new Aluno("Gustavo gords", 789456);
		
		javaColecoes.matricular(a1);
		javaColecoes.matricular(a2);
		
		System.out.println("quem é o aluno com matricula 123456 ?");
		
		Aluno aluno = javaColecoes.buscaMatriculado(123456);
		
		System.out.println("Aluno = " + aluno);
		
		
	}

}

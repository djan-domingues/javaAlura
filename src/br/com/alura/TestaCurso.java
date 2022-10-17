package br.com.alura;

public class TestaCurso {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");
		
		//chamo o objeto Curso, invoco o metodo, como o metodo chama uma lista eu chamo um metodo de lista, o add,
		//crio uma nova aula e passo o construtor.
		
		//javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		
		System.out.println(javaColecoes.getAulas());
		
		

	}

}

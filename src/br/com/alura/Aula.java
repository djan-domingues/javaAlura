package br.com.alura;

//se torna necessário o implements Comparable<Aula> para definir que a classe pode ser comparada com ela mesma e poder reescrever o metodo compareTo para o metodo sort funcionar corretamente
public class Aula implements Comparable<Aula>{
	
	private String titulo;
	private int tempo;
	
	//contrutor
	public Aula(String titulo, int tempo) {
		super();
		this.titulo = titulo;
		this.tempo = tempo;
	}
	
	//getters
	public String getTitulo() {
		return titulo;
	}
	
	public int getTempo() {
		return tempo;
	}
	
	//reescrevendo o toString da classe object para não mostrar o hashCode
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[Aula: " + this.titulo + ", " + this.tempo + " minutos]";
	}
	
	//reescrevendo o compareTo para definir que sera pelo titulo a comparação e ordenação por ordem alfabetica para o metodo sort funcionar corretamente
	@Override
	public int compareTo(Aula outraAula) {
		// TODO Auto-generated method stub
		return this.titulo.compareTo(outraAula.titulo);
	}
	
	
	
	
	

}

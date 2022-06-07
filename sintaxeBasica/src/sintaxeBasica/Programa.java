package sintaxeBasica;

public class Programa {

	public static void main(String[] args) {
		
		System.out.println("Hello World!");
		
		int idade = 2000000000;
		
		double valor = 23.75;
		
		System.out.println(idade + valor);
		
		/*como fazer um casting, que é basicamente forçar uma variavel que seja (ou contenha o valor) de um tipo (double, por exemplo) a setar
		uma variavel de outro tipo (int, por exemplo), assim, moldando seu valor para ser aceito na nova tipagem, como por exemplo:
		
		double salario = 1270.50;
		int preco =  salario; 
		
		Esse código não estaria correto e não seria aceito pois esta tentando setar uma variável do tipo Int a aceitar um valor do tipo double
		
		Porém para a variável aceitar esse valor temos que formatar dessa forma :		*/
		
		double salario = 1250.85;
		
		int preco = (int) salario;
		
		System.out.println(preco);
		
		long numeroGrande = 874196848; // Long é um tipo de variavel que comporta um valor numérico maior (tem um espaço de memoria de 64 bits)
		short numeroPequeno = 32767; // ate o 32767 
		byte b = 127; // ate o 127
		
		System.out.println(numeroGrande + numeroPequeno + b);
		
		//caracteres
		
		char letra = 'a';
		
		char valor2 = 66;
		
		System.out.println(letra);
		
		System.out.println(valor2);
		
		//char recebe um caracter ou um valor numérico que seria um ID de um caracter de texto deve ser  com aspas simples
		
		String palavra = "eu sou mestre das artes";
		
		System.out.println(palavra);
		
		// um objeto que guarda palavras e deve ser setada entre aspas duplas
		
		
		
		

	}

}

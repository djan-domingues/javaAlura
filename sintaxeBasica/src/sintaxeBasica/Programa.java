package sintaxeBasica;

public class Programa {

	public static void main(String[] args) {
		
		System.out.println("Hello World!");
		
		int idade = 2000000000;
		
		double valor = 23.75;
		
		System.out.println(idade + valor);
		
		/*como fazer um casting, que � basicamente for�ar uma variavel que seja (ou contenha o valor) de um tipo (double, por exemplo) a setar
		uma variavel de outro tipo (int, por exemplo), assim, moldando seu valor para ser aceito na nova tipagem, como por exemplo:
		
		double salario = 1270.50;
		int preco =  salario; 
		
		Esse c�digo n�o estaria correto e n�o seria aceito pois esta tentando setar uma vari�vel do tipo Int a aceitar um valor do tipo double
		
		Por�m para a vari�vel aceitar esse valor temos que formatar dessa forma :		*/
		
		double salario = 1250.85;
		
		int preco = (int) salario;
		
		System.out.println(preco);
		
		long numeroGrande = 874196848; // Long � um tipo de variavel que comporta um valor num�rico maior (tem um espa�o de memoria de 64 bits)
		short numeroPequeno = 32767; // ate o 32767 
		byte b = 127; // ate o 127
		
		System.out.println(numeroGrande + numeroPequeno + b);
		
		//caracteres
		
		char letra = 'a';
		
		char valor2 = 66;
		
		System.out.println(letra);
		
		System.out.println(valor2);
		
		//char recebe um caracter ou um valor num�rico que seria um ID de um caracter de texto deve ser  com aspas simples
		
		String palavra = "eu sou mestre das artes";
		
		System.out.println(palavra);
		
		// um objeto que guarda palavras e deve ser setada entre aspas duplas
		
		
		
		

	}

}

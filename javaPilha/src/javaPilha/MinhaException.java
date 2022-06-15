package javaPilha;

/*
 * (unchecked - nao sao verificados pelo compilador) Criando minha propria exceção, para poder chamar os metodos devemos entrar na hierarquia das 
 * exceções, nesse caso entrei na hierarquia da runtime
 * 
 * (checked) caso herdasse diretamente da Exception teriamos que declarar na frente do metodo que sera executado um throw e o nome da exceçao, por exemplo:
 * 
 * private static void metodo2() trhows MinhaException {
 * 	throw new MinhaExcpetion("mensagemQueQuiser")
 * }
 * 
 * mas no fim todas herdam de uma principal que obtem os principais metodos, a "throwable"
 * 
 * criamos o construtor pedindo uma string para que seja usada como mensagem e poder ser usada como getMessage no fluxo
 */

public class MinhaException extends RuntimeException{
	
	public MinhaException(String message) {
		super(message);
	}


}

package byteBankCheckedException;

/*
 * esses casos de criar nossas exceptions s�o formas estrategicas de documentar e tratar possiveis erros, por exemplo nos outros projetos
 * o metodo saca, em vez de fazer calculos logicos e retornar booleano, podemos criar um exce��o de saldo insuficiente e criar nosso tratamento
 * evidenciar que o metodo pode causar essa exce��o com throw nomeDaExcecao na frente do metodo como nesse projeto, e fazer um try catch
 * se der certo tudo bem se der errado � essa exce��o que ira acontecer e sera tratada
 */

public class MinhaException extends Exception{
	
	public MinhaException(String message) {
		super(message);
	}


}

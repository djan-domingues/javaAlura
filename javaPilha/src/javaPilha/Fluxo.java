package javaPilha;

public class Fluxo {

	public static void main(String[] args) {
		System.out.println("Ini do main");
		try {
			metodo1();
		}catch (ArithmeticException | NullPointerException ex) {
			
			String msg = ex.getMessage();
		    System.out.println("Exception " + msg);

		} System.out.println("Fim do main");
	}

	private static void metodo1() {
		System.out.println("Ini do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}

	private static void metodo2() { 
		
		/*
		 * Aqui estamos inicializando um objeto do tipo exce��o, e depois chamando o "m�todo" throw que 'joga' a exce��o no codigo
		 * 
		 * podemos fazer diretamente, sem guarda-la em uma variavel, utilizando:
		 * 
		 * throw new ArithmeticException();
		 */

		
		System.out.println("Ini do metodo2");
		
		ArithmeticException exception = new ArithmeticException();
		
		throw exception;
		
		/*
		 * como a exce��o foi inicializada antes dessa linha e nao foi tratado ele nunca chegara nessa linha, o que causa um erro de compila��o, por isso a linha foi comentada
		 * 
		 
		 */
		
		//System.out.println("Fim do metodo 2");            
	}

}

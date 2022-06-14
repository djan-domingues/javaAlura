package javaPilha;

public class FluxoComTratamento {

	public static void main(String[] args) {
		System.out.println("Ini do main");
		metodo1();
		System.out.println("Fim do main");
	}

	private static void metodo1() {
		System.out.println("Ini do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}

	private static void metodo2() { 
		
		/*
		 * esse m�todo contem um erro, nao um erro de sintaxe que impossiilitaria o c�digo de ser compilado, e sim um erro matematico porque 
		 * esta tentando fazer um daivis�o por zero, caso executasse, aparecera um erro no console, e se fosse debugado veria que apartir do erro, os
		 * metodos foram sendo terminados e iam sendo testado um a um ate finalizar o main para ver se em algum metodo havia um tratamento para 
		 * essa exce��o 
		 * 
		 * nesse caso criamos o tratamento, colocamos o codigo dentro de um try, para o compilador tentar executar, caso desse o erro, o guardava numa variavel 
		 * e executa um sysout qualquer.
		 * 
		 *Avan�o: Ja com try catch montado podemos perceber que ArithmeticException � um classe, e contem metodos, um deles � o getMessage().
		 *
		 *atraves dele podemos guardar o que esse get pega e visualizar numa string
		 *
		 *avan�o: pode ser q o codigo possa apresentar mais de uma exce��o, para tratar no mesmo try catch pode se colocar "| outraExce��o para trata-la
		 *da mesma forma
		 */
		
		System.out.println("Ini do metodo2");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			try {
				int a = i / 0;
			} catch (ArithmeticException | NullPointerException ex) {
				
				String msg = ex.getMessage();
			    System.out.println("ArithmeticException" + msg);

			}
		}System.out.println("Fim do metodo 2");
	}

}

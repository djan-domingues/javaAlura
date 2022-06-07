package byteBank;

/*
 * Aqui estou definindo esbo�o do objeto, oque cont�m e o que faz
 * 
 * Eu crio uma referencia a uma conta no projeto CriaConta definindo o nome desse novo "objeto" Conta que eu defini nesse projeto e atribuindo valores �s variaveis
 * 
 * Logo abaixo das vari�veis existem os m�todos (o que faz) e eu chamo o m�todo no projeto testaMetodo
 * 
 * 
 */
public class Conta {

	double saldo;
	int agencia;
	int numero;
	String titular;

	/*
	 * Para definir um metodo definimos sua "acessibilidade" (public, private)
	 * definimos o seu tipo de retorno(String, int, boolean ou void) o nome da
	 * variavel e entre parenteses definimos seus argumentos (o que ele deve
	 * receber, se forem mais de um devem ser separados por virgula.
	 */

	public void deposita(double valor) {

		this.saldo += valor;
	}

	public boolean saca(double valor) {

		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean transfere (double valor,Conta destino ) {
		
		if (this.saldo >= valor) {
			
			this.saldo -= valor;
			
			/*
			 * aqui podemos utilizar o m�todo deposita assim:
			 * 
			 * destino.deposita(valor);
			 */
			
			destino.saldo += valor;
			
			return true; 
			
		}
		return false;
		
		
	}

}

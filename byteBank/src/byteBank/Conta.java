package byteBank;

/*
 * Aqui estou definindo esboço do objeto, oque contém e o que faz
 * 
 * Eu crio uma referencia a uma conta no projeto CriaConta definindo o nome desse novo "objeto" Conta que eu defini nesse projeto e atribuindo valores às variaveis
 * 
 * Logo abaixo das variáveis existem os métodos (o que faz) e eu chamo o método no projeto testaMetodo
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
			 * aqui podemos utilizar o método deposita assim:
			 * 
			 * destino.deposita(valor);
			 */
			
			destino.saldo += valor;
			
			return true; 
			
		}
		return false;
		
		
	}

}

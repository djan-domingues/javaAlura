
	public class Conta {

		private double saldo;
		private int agencia;
		private int numero;
		private Cliente titular;
		
		private static int total; /*static significa que a variavel pertence a classe e nao a cada instancia, assim podemos utilizar 
		                           o mesmo dado em diferentes objetos provenientes dessa clase*/
		
		
		/*Constructor - antes quando iriamos instanciar um objeto faziamos
		 * 
		 * Conta conta = new Conta();
		 * 
		 * esses () representa o constructor, o constructor contem os atributos necess�rios para "construir" esse objeto
		 * 
		 */
		
		public Conta(int agencia, int numero) {
			Conta.total++; // o total � um atributo da CLASSE conta e nao do objeto do tipo conta criado
			this.agencia = agencia;
			this.numero = numero;
		}

		
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

				
				destino.saldo += valor;
				
				return true; 
				
			}
			return false; 
			
		}
		
		/*
		 * metodos getters and setters s�o os m�todos para acessar as variaveis privadas
		 * 
		 * o get serve para mostrar o valor, sempre quando eu quiser utilizar esse dado 
		 * 
		 * eles s�o basicamente m�todos, o metodo de mostrar e o m�todo de setar
		 * 
		 * como s�o metodos seguem a regra de sintaxe dos metodos
		 * 
		 * no caso do get: deve ser publico, deve ser do mesmo tipo da variavel "m�e", getVariavelMae nome do metodo ent�o acompanha ()
		 * a direita e na maioria das vezes ele usa o return this.variavelMae
		 * 
		 * no caso do set: deve ser publico, como � um metodo que n�o emitira nada, apenas ira setar um valor na variavel
		 * na mioria das vezes ele � acompanhado de void, setVariavelMae e como ele � um metodo que ira setar a variavel
		 * recebera um valor numa variavel temporaria que sera utilizada para setar a variavelMae.
		 * 
		 * 
		 * como o get � um metodo para "exibir" o dado da variavel, ele � do tipo da variavel
		 * 
		 * como o set � um metodo para popuplar a variavel, ele sera do tipo void se o que importar for simplesmente o dado e n�o o 
		 * "processo" do metodo
		 * 
		 */
		
		public double getSaldo() {
			return this.saldo;
		}
		
		public int getNumero() {
			return this.numero;
		}
		
		public void setNumero(int numero){
			
			if(numero <=0 ) {
				System.out.println("valores negativos n�o s�o permitidos");
				return;
			}
			this.numero = numero;
		}
		
		public void setTitular(Cliente titular) {
			this.titular = titular;
		}
		
		public Cliente getTitular() {
			return titular;
		}
		
		public int getAgencia() {
			return agencia;
		}
		
		public void setAgencia(int agencia) {
			
			if(agencia <= 0) {
				System.out.println("valores negativos n�o s�o permitidos");
				return; //serve para parar o codigo
				
			}
			this.agencia = agencia;
		}
		
		public static int getTotal() { //no getter and setter devemos colocar static para indicar que � um metodo da classe 
			return total;
		}
		
		
		
	
		
		
		

	}



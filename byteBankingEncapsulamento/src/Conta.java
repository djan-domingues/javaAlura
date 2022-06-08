
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
		 * esses () representa o constructor, o constructor contem os atributos necessários para "construir" esse objeto
		 * 
		 */
		
		public Conta(int agencia, int numero) {
			Conta.total++; // o total é um atributo da CLASSE conta e nao do objeto do tipo conta criado
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
		 * metodos getters and setters são os métodos para acessar as variaveis privadas
		 * 
		 * o get serve para mostrar o valor, sempre quando eu quiser utilizar esse dado 
		 * 
		 * eles são basicamente métodos, o metodo de mostrar e o método de setar
		 * 
		 * como são metodos seguem a regra de sintaxe dos metodos
		 * 
		 * no caso do get: deve ser publico, deve ser do mesmo tipo da variavel "mãe", getVariavelMae nome do metodo então acompanha ()
		 * a direita e na maioria das vezes ele usa o return this.variavelMae
		 * 
		 * no caso do set: deve ser publico, como é um metodo que não emitira nada, apenas ira setar um valor na variavel
		 * na mioria das vezes ele é acompanhado de void, setVariavelMae e como ele é um metodo que ira setar a variavel
		 * recebera um valor numa variavel temporaria que sera utilizada para setar a variavelMae.
		 * 
		 * 
		 * como o get é um metodo para "exibir" o dado da variavel, ele é do tipo da variavel
		 * 
		 * como o set é um metodo para popuplar a variavel, ele sera do tipo void se o que importar for simplesmente o dado e não o 
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
				System.out.println("valores negativos não são permitidos");
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
				System.out.println("valores negativos não são permitidos");
				return; //serve para parar o codigo
				
			}
			this.agencia = agencia;
		}
		
		public static int getTotal() { //no getter and setter devemos colocar static para indicar que é um metodo da classe 
			return total;
		}
		
		
		
	
		
		
		

	}



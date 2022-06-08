package byteBankString;


	public class Conta {

		double saldo;
		int agencia;
		int numero;
		Cliente titular;
		
		/*
		 * assim como esta o Cliente sempre tera que ser incializado para o programa rodar, podendo ser feito diretamente aqui na classe
		 * 
		 * Cliente titular = new Cliente () assim sempre quando uma conta for criada, automaticamente um cliente sera criado e associado a ela
		 * 
		 * 
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

				
				destino.saldo += valor;
				
				return true; 
				
			}
			return false; 
			
		}

	}



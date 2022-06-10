package byteBankPolimorfismoConta;

public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
		
		
	}
	
	/*
	 * Como eu quero especificar mais o metodo saca porem apenas para quando forexecutado por uma conta poupança
	 * 
	 * eu escrevo o nome do metodo que é saca e ctrl + espaço
	 * 
	 * assim ele vai reescrever esse metodo nessa classe com o @Overrride em cima que é uma anotação para especificar que um metodo
	 * de uma classe mais generica que esta sendo override nessa classe
	 * 
	 */
	
	 @Override
	public boolean saca(double valor) {
		 
		 double ValorASacar = valor + 0.2;

		 return super.saca(ValorASacar);
		 
	}
	 
	 @Override
	public void deposita(double valor) {//lembrar de usar this. em variaveis e metodos locais porem usar super. para quando são herdados
			
			super.saldo += valor;
		
	}

}

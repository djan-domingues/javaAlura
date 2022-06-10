package byteBankPolimorfismoConta;

public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
		
		
	}
	
	/*
	 * Como eu quero especificar mais o metodo saca porem apenas para quando forexecutado por uma conta poupan�a
	 * 
	 * eu escrevo o nome do metodo que � saca e ctrl + espa�o
	 * 
	 * assim ele vai reescrever esse metodo nessa classe com o @Overrride em cima que � uma anota��o para especificar que um metodo
	 * de uma classe mais generica que esta sendo override nessa classe
	 * 
	 */
	
	 @Override
	public boolean saca(double valor) {
		 
		 double ValorASacar = valor + 0.2;

		 return super.saca(ValorASacar);
		 
	}
	 
	 @Override
	public void deposita(double valor) {//lembrar de usar this. em variaveis e metodos locais porem usar super. para quando s�o herdados
			
			super.saldo += valor;
		
	}

}

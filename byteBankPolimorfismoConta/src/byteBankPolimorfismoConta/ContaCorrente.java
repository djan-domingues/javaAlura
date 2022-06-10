package byteBankPolimorfismoConta;

public class ContaCorrente extends Conta { 
	
	/*
	 * construtores nao herdados
	 * 
	 * o codigo não compilaria normalmente porque a classe mae tem um construtor especifico e no atual código ele não esta sendo
	 * populado, para arrumar isso devemos criar um construtor especifico para a classe filha com no minimo todos os parametros 
	 * do construtor da classe mae e se quiser ser mais especifico pode incrementar
	 * 
	 * após de criar o construtor da classe, o "metodo" construtor deve chamar o construtor da classe mae e passar os parametros que
	 * ela pede
	 * 
	 */
	
	public ContaCorrente(int agencia, int numero) { 		
		super(agencia, numero);
	}
	
	@Override
	public void deposita(double valor) { //lembrar de usar this. em variaveis e metodos locais porem usar super. para quando são herdados
		
		super.saldo += valor;
		
	}
	
	

}

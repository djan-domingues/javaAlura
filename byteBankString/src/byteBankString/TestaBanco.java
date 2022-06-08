package byteBankString;

public class TestaBanco {
	
	public static void main(String[] args) {
		
		Cliente paulo = new Cliente ();
		paulo.nome = "Paulo Silveira";
		paulo.cpf = "123.123.123-12";
		paulo.profissao = "programador";
		
		Conta contaDoPaulo = new Conta ();
		contaDoPaulo.deposita(100);
		
		/*
		 * Para associarmos a Conta ao cliente devemos passar o objeto cliente para a variavel titular da conta
		 * 
		 * assim a conta tem seus atributos, sendo um deles o titular que é uma variavel do tipo cliente
		 * 
		 * assim, ja tendo criado uma classe de cliente e criado um cliente, associamos esse cliente à conta
		 */
		
		contaDoPaulo.titular = paulo;
		
		/*
		 * Após essa asscociação podemos acessar o nome do cliente a partir da conta.
		 */
		
		System.out.println(contaDoPaulo.titular.nome);
	}

}

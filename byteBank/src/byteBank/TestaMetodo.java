package byteBank;

public class TestaMetodo {
	
	public static void main(String[] args) {
		
		/*
		 * Criando uma conta contaDoPaulo, definindo saldo e testando o metodo deposita
		 */
		
		Conta contaDoPaulo = new Conta();
		
		contaDoPaulo.saldo = 100;
		
		contaDoPaulo.deposita(1250);
		
		System.out.println(contaDoPaulo.saldo);
		
		/*
		 * Aqui estamos sincretizando duas coisas, como o m?todo saca ? um metodo que emite um boolean quando chamado, estamos definindo uma variavel
		 * para receber esse boolean, a variavel conseguiuSacar ira receber o boolean do m?todo saca descrito
		 * 
		 * ap?s um sysout para verificarmos tanto a variavel booleana quanto o saldo apos o metodo
		 */
		
		boolean conseguiuSacar = contaDoPaulo.saca(1350);
		
		System.out.println("conseguiu sacar ? " + conseguiuSacar + " saldo atual: " + contaDoPaulo.saldo );
		
		/*
		 * Aqui estamos criando outra conta, utilizando o metodo deposita para adicionarmos uma valor ao saldo da contaDaMarcela
		 * 
		 * verificamos os saldos das duas contas
		 * 
		 * depois utilizamos a mesma sincretiza??o de definir uma variavel pra receber o boolean do metodo trasnfere e definimos que a contaDaMarcela
		 * fara o metodo trasnfere, definimos o valor e a conta
		 * 
		 * depois visualizamos os saldos de ambos para ver a mudan?a e a variavel booleana do metodo
		 */
		
		
		Conta contaDaMarcela = new Conta();
		
		
		contaDaMarcela.deposita(1000);

		System.out.println("saldo da marcela antes dono metodo: " + contaDaMarcela.saldo);
		
		System.out.println("saldo do paulo, antes dono metodo: " + contaDoPaulo.saldo);
		
		boolean conseguiuTransferir = contaDaMarcela.transfere(300, contaDoPaulo);		
		
		System.out.println("saldo da marcela depois dono metodo: " + contaDaMarcela.saldo);
		
		System.out.println("saldo do paulo, depois dono metodo: " + contaDoPaulo.saldo);
		
		System.out.println(conseguiuTransferir);
		
		/*
		 * Como o m?todo emite um valor booleano poderiamos utiliza-lo sem nem guarda-lo numa variavel, apenas o utilizando num if:
		 * 
		 * if(contaDaMarcela.transfere(300, contaDoPaulo)){
		 * 
		 * 		System.out.println("transfer?ncia com sucesso");
		 *  
		 * } else {
		 * 
		 *      System.out.println("trasnferencia invalida");
		 * 
		 * }
		 * 
		 */
		
		
		
	}

}

package byteBankCheckedException;

public class TestaContaComExceptionChecked {
	
	public static void main(String[] args) {
		
		/*
		 * 
		 *         Conta c = new Conta();
         *         c.deposita();
         *         
         *         
         *         Esse metodo n�o compilaria, porque na classe conta, quando o metodo deposita � criado ja � definido que tem uma
         *         exception, ent�o temos que trata-lo, assim:
		 */
		
        Conta c = new Conta();
        try {
            c.deposita();
            System.out.println("deu certo");
        } catch(MinhaException ex) {
            System.out.println("tratamento ......");
        }
		

        
    }


}

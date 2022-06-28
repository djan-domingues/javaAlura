package javaPilha;

public class TesteConexao {
	
	public static void main(String[] args) {
		
		Conexao con = null;
		
		try {
			con = new Conexao();
			
			con.leDados();
			//con.fecha();
			
		}catch (IllegalStateException ex) {
			System.out.println("deu erro na conexao");
			//con.fecha();
		}finally {
			
			con.fecha();
			
		}
	}

}

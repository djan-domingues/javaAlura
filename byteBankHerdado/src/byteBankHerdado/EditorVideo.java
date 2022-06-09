package byteBankHerdado;

public class EditorVideo extends Funcionario {
	
	public double getBonificacao() {
		System.out.println("chamando metodo de bonificacao do editor");
		
		return super.getBonificacao() + 100;
	}
	

}

package byteBankHerdado;

public class ControleBoni {
	
	private double soma;
	
	/*
	 * isso significa que quando o metodo registra for executado ele pedira uma referencia de funcionario
	 * 
	 * logo abaixo ele utiliza um metodo que existe na classe funcionario, mas também em todas as outras classe que herdam funcionario
	 * 
	 * ou seja, se a referencia que for passada para o metodo for mais especifica o metodo também sera mais especifico
	 * 
	 * 
	 */
	
	public void registra(Funcionario funcionario) {
		double bonificacao = funcionario.getBonificacao();
		this.soma += bonificacao;
	}
	
	public double getSoma() {
		return soma;
	}

}

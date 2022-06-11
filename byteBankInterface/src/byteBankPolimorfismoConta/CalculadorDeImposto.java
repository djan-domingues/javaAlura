package byteBankPolimorfismoConta;

public class CalculadorDeImposto {
	
	
	
	/*
	 * essa classe � responsavel por definir os m�todos necess�rio para calcular um imposto
	 * 
	 * para calcular o imposto devemos passar um objeto que extends tributavel
	 * 
	 * 
	 */
	
	private double totalImposto;
	
	
	public void registra(Tributavel t) {   
		double valor = t.getValorImposto();
		
		this.totalImposto += valor;
		
	}
	
	public double getTotalImposto() {
		return totalImposto;
	}

}

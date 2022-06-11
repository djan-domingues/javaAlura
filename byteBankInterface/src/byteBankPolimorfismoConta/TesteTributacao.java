package byteBankPolimorfismoConta;

public class TesteTributacao {
	
	/*
	 * como criamos uma interface Tributavel e criamos um metodo double getValorImposto(), todas as classes que extends Tributavel devem criar esse mesmo m�todo e definir o calculo
	 * para retornar um valor
	 * 
	 * na classe CalculadorDeImposto foi criado um m�todo para somar todos os impostos
	 * 
	 * esse m�todo � o registra(Tributavel t), isso significa que para chamar esse m�todo devemos passar um objeto que extenda Tributavel, sendo passado esse objeto ele pode executar
	 * o m�todo getValorImposto, e com esse valor ele faz um calculo para somar todos os impostos
	 * 
	 * Aqui nessa classe estamos inicializando um ContaCorrente e um SeguroDeVida, ambos extends tributavel
	 * 
	 * logo ap�s inicializamos um CalculadorDeImposto, ele por sua vez chama duas vezes o m�todo registra e passa os objetos tributaveis
	 * 
	 * como o getValorImposto do cc � o saldo que � 100, vezes 0.1 o resultado � 1 real
	 * 
	 * ja o do seguro de vida � passado diretamente 42
	 * 
	 * o metodo registra faz o getValorImposto da classe do objeto que foi passado, e salva numa variavel temporaria, depois passa para uma variavel local somando os valores, como
	 * ela � private � necess�rio criar um getter dela
	 * 
	 * no sysout � chamado o getTotalImposto e a soma dos imposto dos objetos tributaveis inicializados e "registrados" � mostrada, no caso: 43.
	 */
	
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(222, 333);
		cc.deposita(100.0);
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadorDeImposto calc = new CalculadorDeImposto();
		calc.registra(cc);
		calc.registra(seguro);
		
		System.out.println(calc.getTotalImposto());
		
	}

}

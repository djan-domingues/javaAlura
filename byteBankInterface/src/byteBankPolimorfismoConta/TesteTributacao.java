package byteBankPolimorfismoConta;

public class TesteTributacao {
	
	/*
	 * como criamos uma interface Tributavel e criamos um metodo double getValorImposto(), todas as classes que extends Tributavel devem criar esse mesmo método e definir o calculo
	 * para retornar um valor
	 * 
	 * na classe CalculadorDeImposto foi criado um método para somar todos os impostos
	 * 
	 * esse método é o registra(Tributavel t), isso significa que para chamar esse método devemos passar um objeto que extenda Tributavel, sendo passado esse objeto ele pode executar
	 * o método getValorImposto, e com esse valor ele faz um calculo para somar todos os impostos
	 * 
	 * Aqui nessa classe estamos inicializando um ContaCorrente e um SeguroDeVida, ambos extends tributavel
	 * 
	 * logo após inicializamos um CalculadorDeImposto, ele por sua vez chama duas vezes o método registra e passa os objetos tributaveis
	 * 
	 * como o getValorImposto do cc é o saldo que é 100, vezes 0.1 o resultado é 1 real
	 * 
	 * ja o do seguro de vida é passado diretamente 42
	 * 
	 * o metodo registra faz o getValorImposto da classe do objeto que foi passado, e salva numa variavel temporaria, depois passa para uma variavel local somando os valores, como
	 * ela é private é necessário criar um getter dela
	 * 
	 * no sysout é chamado o getTotalImposto e a soma dos imposto dos objetos tributaveis inicializados e "registrados" é mostrada, no caso: 43.
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

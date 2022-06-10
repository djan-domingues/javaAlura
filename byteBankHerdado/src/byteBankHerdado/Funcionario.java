package byteBankHerdado;

public abstract class Funcionario { /*Se Adiciona "abstract" antes de "class" para definir que essa classe � uma base para outras classes
 mas que na realidade n�o pode ser inicializada como puramente sozinha pois n�o tem grau de especifidade para ser um objeto */ 
	
	private String nome;
	private String cpf;
	protected double salario; //protected significa publico para os filhos
	
	
	public double getBonificacao() {    
		return this.salario * 0.10;
	}
	
	/*
	 * Esse codigo acima esta funcionando normalmente, porem como esta na classe mais generica, pode ser que nao seja necess�rio mais
	 * um metodo default, por exemplo nesse caso todos os tipos de funconario, todas as classes que herdam de funcionario, teriam que ter
	 * sua propria bonificacao especifica e esse c�digo entraria em desuso
	 * 
	 * n�o poderiamos simplesmente apagar esse c�digo, porque se por exemplo se fossemos criar um metodo pagamento e nesse metodo
	 * pagamento tivesse que passar um objeto do tipo funcionario e esse metodo fizesse um calculo com getBonificacao
	 * 
	 * daria erro de compila��o, porque mesmo voce passando um gerente como objeto do tipo funcionario, e o gerente ter um 
	 * metodo especifico, esse metodo nao existiria na classe m�e pedida como parametro, assim deveriamos reescrever esse c�digo assim:
	 * 
	 * public abstract double getBonificacao();
	 * 
	 * sem definir parametros nem "fun�oes a realizar"
	 * 
	 * entao sempre que herdarem essa classe ter�o que definir esse metodo especificamente para a classe, s� nao seria necess�rio se
	 * essa classe que esta herdando seja abstract tambem
	 * 
	 * e tamb�m n�o funcionario se chamasse esse metodo pelo super.getBonificacao pois ele nao tem corpo executavel.
	 */
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	

}

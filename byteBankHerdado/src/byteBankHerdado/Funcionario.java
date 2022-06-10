package byteBankHerdado;

public abstract class Funcionario { /*Se Adiciona "abstract" antes de "class" para definir que essa classe é uma base para outras classes
 mas que na realidade não pode ser inicializada como puramente sozinha pois não tem grau de especifidade para ser um objeto */ 
	
	private String nome;
	private String cpf;
	protected double salario; //protected significa publico para os filhos
	
	
	public double getBonificacao() {    
		return this.salario * 0.10;
	}
	
	/*
	 * Esse codigo acima esta funcionando normalmente, porem como esta na classe mais generica, pode ser que nao seja necessário mais
	 * um metodo default, por exemplo nesse caso todos os tipos de funconario, todas as classes que herdam de funcionario, teriam que ter
	 * sua propria bonificacao especifica e esse código entraria em desuso
	 * 
	 * não poderiamos simplesmente apagar esse código, porque se por exemplo se fossemos criar um metodo pagamento e nesse metodo
	 * pagamento tivesse que passar um objeto do tipo funcionario e esse metodo fizesse um calculo com getBonificacao
	 * 
	 * daria erro de compilação, porque mesmo voce passando um gerente como objeto do tipo funcionario, e o gerente ter um 
	 * metodo especifico, esse metodo nao existiria na classe mãe pedida como parametro, assim deveriamos reescrever esse código assim:
	 * 
	 * public abstract double getBonificacao();
	 * 
	 * sem definir parametros nem "funçoes a realizar"
	 * 
	 * entao sempre que herdarem essa classe terão que definir esse metodo especificamente para a classe, só nao seria necessário se
	 * essa classe que esta herdando seja abstract tambem
	 * 
	 * e também não funcionario se chamasse esse metodo pelo super.getBonificacao pois ele nao tem corpo executavel.
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

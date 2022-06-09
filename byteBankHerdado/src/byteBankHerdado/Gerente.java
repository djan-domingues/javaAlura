package byteBankHerdado;

/*
 * Como o gerente teria todos os atributos de um funcionário, porem ele tem outros atributos e especificações fazemos isso:
 */

public class Gerente extends Funcionario {
	

	private int senha;
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
			
		} return false;
	}
	
	
	public int getSenha() {
		return senha;
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	                    
	                                        
	                                         /*   
	                                          * Esse código não iria compilar se a variavel salario estive com private na classe funcionario
	                                          * ja que assim seria uma variavel restrita para aquela classe e não seria possivel acessa-la 
	                                          * 
	                                          * a solução é mudar o tipo da classe para protected assim ele ficara visivel para quem herda
	                                          * 
	                                          * para não precisar mexer na visibilidade é só utilizar os metodos gets com a palavra chave super
	                                          */
	
	
	
	public double getBonificacao() {   
		
		//a palavra chave super substitui a this para indicar que a variavel vem de uma hierarquia maior
		
		System.out.println("executando metodo do gerente");
		return super.getBonificacao() + super.salario;    // assim eu estou executando o metodo que esta na super class e juntando com o novo calculo 
		
	}
	
	
	
	
	
	


	
	
	

}

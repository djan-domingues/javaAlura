
public class TestaBanco {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta (1337, 2445);
		
		Cliente paulo = new Cliente();
		
		conta.setTitular(paulo);
		
		System.out.println(conta.getTitular());
		
		paulo.setNome("Paulo");
		
		System.out.println(paulo.getNome());
		
		//Dessa forma eu estou chamando o metodo para checar o titular da variavel conta, que por sua vez é um objeto cliente, e assim 
		//checar o nome desse cliente
		
		
		
		System.out.println(conta.getTitular().getNome());
		
		//Dessa forma conseguimos atraves da conta, utilizando o getTitular, acessar o objeto cliente e setar a profissão
		
		conta.getTitular().setProfissao("programador");
		
		System.out.println(paulo.getProfissao());
		
		
		
		
		
		
		
	}

}

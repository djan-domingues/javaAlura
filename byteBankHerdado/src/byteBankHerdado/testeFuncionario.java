package byteBankHerdado;

public class testeFuncionario {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario();
		
		funcionario.setNome("Djan");
		funcionario.setCpf("741.852.963-20");
		funcionario.setSalario(1254.45);
		
		System.out.println("O nome do funcionario �: " + funcionario.getNome() + " ");
		System.out.println("O cpf do funcionario �: " + funcionario.getCpf() + " ");
		System.out.println("O salario do funcionario �: " + funcionario.getSalario() + " ");
		System.out.println("A bonifica��o do funcionario �: " + funcionario.getBonificacao() + " ");

	}

}

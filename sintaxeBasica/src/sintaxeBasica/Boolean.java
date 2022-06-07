package sintaxeBasica;

public class Boolean {

	public static void main(String[] args) {

		System.out.println("Testando condicionais");

		int idade = 18;

		int quantidadePessoa = 3;

		boolean acompanhado = quantidadePessoa >= 2; /*
														 * 
														 * podemos adicionar uma expressão booleana para setar como true
														 * ou false
														 * 
														 * Essa expresão quer dizer que 
														 * 
														 * Boolean acompanhado;
														 * 
														 * if(quantidadePessoas >= 2){
														 * 		acompanhado = true;
														 * 	}else {
														 * 		acompanhado = false;
														 * 	}
														 * 
														 * para adicionarmos um 'ou' utilizamos || e para adicionarmos
														 * um 'e' utilizamos &&
														 */

		if (idade >= 18 || acompanhado) {

			System.out.println("Você pode entrar");
		}

		else {

			System.out.println("Infelizmente você não pode entrar");

		}

	}

}

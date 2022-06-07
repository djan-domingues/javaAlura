package sintaxeBasica;

public class Condicionais {

	public static void main(String[] args) {

		System.out.println("Testando condicionais");

		int idade = 16;

		int quantidadePessoas = 1;

		if (idade >= 18) {

			System.out.println("Você é maior de idade");
		}

		else {
			if (quantidadePessoas >= 2) {
				System.out.println("Voce pode entrar pois está acompanhado");
			}

			else {

				System.out.println("Infelizmente você não pode entrar");

			}

		}

	}

}

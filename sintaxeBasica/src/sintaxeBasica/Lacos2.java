package sintaxeBasica;

public class Lacos2 {
	public static void main(String[] args) {

		for (int linha = 0; linha <= 10; linha++) {

			for (int coluna = 0; coluna <= linha; coluna++) {

				System.out.print("*");

				/*
				 * utilizar a express�o booleana coluna <= linha � o mesmo de dizer:
				 * 
				 * if(coluna > linha) { break; }
				 */

			}

			System.out.println();

		}
	}

}

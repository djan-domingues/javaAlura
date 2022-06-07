package sintaxeBasica;

public class Lacos5 {
	public static void main(String[] args) {
		
		for(int i = 1; i <=10; i++){
			
		    int num = i;

		    for(int temporaria = (num-1); temporaria>=1; temporaria--){
		        num *= temporaria;
		    }
		    
		    System.out.println("Fatorial de "+ i+" = "+num);
		}
	}

}

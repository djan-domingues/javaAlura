package byteBankHerdado;

public class TestaBoni {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		EditorVideo editor = new EditorVideo();
		Funcionario funcionario = new Funcionario();
		
		gerente.setSalario(5000);
		editor.setSalario(2500);
		funcionario.setSalario(2000);
		
		ControleBoni controle = new ControleBoni();
		controle.registra(funcionario);
		controle.registra(editor);
		controle.registra(gerente);
		
		System.out.println(controle.getSoma());
		

	}

}

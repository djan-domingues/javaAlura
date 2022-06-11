package byteBankPolimorfismoConta;

public class TesteConta {
	
	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(111,111);
		cc.deposita(100.0);
		
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200.0);
		
		System.out.println("cc" + cc.getSaldo() + " cp" + cp.getSaldo());
		
		cp.transfere(10, cc);
		
		System.out.println(cp.getSaldo());
		

		System.out.println(cc .getSaldo());
	}

}

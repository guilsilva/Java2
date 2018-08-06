
public class TestaMetodo {

	public static void main(String[] args) {
	
		Conta conta = new Conta();
		conta.saldo = 100;
		conta.deposita(50);
		System.out.println(conta.saldo);
		
		System.out.println();
		
		conta.saca(20);
		System.out.println(conta.saldo);
		
		System.out.println();
		
		Conta outraConta = new Conta();
		outraConta.deposita(1000);
		
		outraConta.tranfere(300, conta);
		
		System.out.println(conta.saldo);
		System.out.println(outraConta.saldo);
		
	}

}

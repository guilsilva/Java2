public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);
		System.out.println(primeiraConta.titular);
		
		System.out.println();
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 100;
		segundaConta.titular = "Guilherme de Lima Silva";
		System.out.println(segundaConta.saldo);
		System.out.println(segundaConta.agencia);
		System.out.println(segundaConta.numero);
		System.out.println(segundaConta.titular);
	}
}

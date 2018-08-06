
public class TesteReferencias {

	public static void main(String[] args) {
		
		//ponteiro == referencia. Guarda o valor de mem�ria
		Conta primeiraConta = new Conta(); 
		primeiraConta.saldo = 300;
		System.out.println(primeiraConta.saldo);
		
		//copia de ponteiro. 2 variaveis que apontam para o mesmo endere�o de memoria
		Conta segundaConta = primeiraConta; 
		System.out.println(segundaConta.saldo);
		
		segundaConta.saldo += 100;
		
		System.out.println();
		System.out.println(primeiraConta.saldo);
		System.out.println(segundaConta.saldo);
		
	}

}

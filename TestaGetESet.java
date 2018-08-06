
public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setNumero(1432);
		System.out.println(conta.getNumero());
		
		conta.setNumero(14358);
		System.out.println(conta.getNumero());
		
		
		Cliente guilherme = new Cliente();
		guilherme.setNome("Guilherme de Lima Silva");
		
		conta.setTitular(guilherme);
	}

}

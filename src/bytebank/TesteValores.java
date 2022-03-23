package bytebank;

public class TesteValores {

	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);

		System.out.println(conta.getAgencia());
		
		Conta conta2 = new Conta(1337, 54231);
		Conta conta3 = new Conta(2112, 14660);

		System.out.println(conta.getTotal());

	}

}

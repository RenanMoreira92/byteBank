package bytebank;

public class Conta {

	private double getSaldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	
	
	public Conta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Estou criando uma conta " + this.numero);
	}
	

	public void deposita(double valor) {

		this.getSaldo = this.getSaldo + valor;

	}

	public boolean saca(double valor) {
		if (this.getSaldo >= valor) {
			this.getSaldo = this.getSaldo - valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.getSaldo >= valor) {
			this.getSaldo -= valor;
			destino.deposita(valor);
		}
		return false;
	}

	public double getSaldo() {
		return this.getSaldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int novoNumero) {
		if (numero <= 0 ) {
			System.out.println("nao pode valor <= 0");
			return;
		}
		this.numero = novoNumero;
	}

	public double getGetSaldo() {
		return getSaldo;
	}

	public void setGetSaldo(double getSaldo) {
		this.getSaldo = getSaldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("nao pode valor menor ou igual a 0");
			return;
		}
		this.agencia = agencia;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

}

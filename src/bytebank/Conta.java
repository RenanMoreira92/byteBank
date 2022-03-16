package bytebank;

public class Conta {

	private double getSaldo;
	private int agencia;
	private int numero;
	private String titular;

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
		this.agencia = agencia;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

}

package questao02;

public class ContaBancaria {
	private String numero;
	private String titular;
	private double saldo;
	
	//getters e setters
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public void depositar(double valor) {
		if (valor>0) {
			saldo += valor;
		}else {
			System.out.println("valor de depósito inválido!");
		}
	}
	public void sacar(double valor) {
		if(valor> 0 && valor <= saldo) {
			saldo -= valor;
		}else {
			System.out.println("Saldo insuficiente ou valor aplicado inválido!");
		}
	}
	
	public void transferir(ContaBancaria contaDestino, double valor) {
		if(valor>0 && valor <= saldo) {
			this.sacar(valor);
			contaDestino.depositar(valor);
		}else {
			System.out.println("Transferência não realiazad. Verifique seu saldo");
		}
	}
}

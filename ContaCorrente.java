package atividades_poo;

public class ContaCorrente {

	private int conta;
	private String titular;
	private double saldo;

	//Construtor
	public ContaCorrente(int conta, String titular, double saldo) {
		setTitular(titular);
		setConta(conta);
		setSaldo(saldo);
	}
	
	private void setTitular(String titular) {
		this.titular = titular;
	}
	public String getTitular() {
		return titular;
	}
	
	private void setConta(int conta) {
		this.conta = conta;
	}
	public int getConta() {
		return conta;
	}
	
	private void setSaldo(double saldo) {
		if(saldo < 0) {
			System.out.println("Saldo inválido!");
		}
		else {
			this.saldo = saldo;
		}
	}
	public double getSaldo() {
		return saldo;
	}
	
	public void deposito(double x) {
		if(x <= 0) {
			System.out.println("Valor de depósito inválido!");
		}
		else {
			saldo += x;
		}
	}
	
	public void saque(double x) {
		if(x <= 0 || saldo - x < 0) {
			System.out.println("Valor de saque inválido!");
		}
		else {
			saldo -= x;
		}
	}
	
	public void exibir() {
		System.out.println("============================");
		System.out.printf("Conta\t: %07d\n", getConta());
		System.out.printf("Titular\t: %s\n", getTitular());
		System.out.printf("Saldo\t: R$%.2f\n", getSaldo());
		System.out.println("============================");
	}
}

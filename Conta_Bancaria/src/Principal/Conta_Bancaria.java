package Principal;

public class Conta_Bancaria {

	private String numeroDaConta;
	private double saldo;

	public Conta_Bancaria(String numeroDaConta, double saldoInicial) {
		this.numeroDaConta = numeroDaConta;
		this.saldo = saldoInicial;
	}

	public void depositar(double valor) {
		saldo += valor;
		System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
		exibirSaldo();
	}

	public void sacar(double valor) {
		if (valor <= saldo) {
			saldo -= valor;
			System.out.println("Saque de R$" + valor + " realizado com sucesso.");
			exibirSaldo();
		} else {
			System.out.println("Saldo insuficiente para realizar o saque de R$" + valor + ".");
		}
	}

	public void exibirSaldo() {
		System.out.println("Saldo atual da conta " + numeroDaConta + ": R$" + saldo);
	}

	public static void main(String[] args) {

		Conta_Bancaria minhaConta = new Conta_Bancaria("12345", 1000.0);
		minhaConta.exibirSaldo();

		minhaConta.depositar(500.0);
		minhaConta.sacar(200.0);
	}

}

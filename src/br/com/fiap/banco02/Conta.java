package br.com.fiap.banco02;

public abstract class Conta {

	// ATRIBUTOS
	protected long numeroConta;
	protected double saldo;
	protected Cliente cliente;
	private static int contador;

	// CONSTRUTOR
	public Conta(Cliente cliente, long numeroConta) {
		super();
		this.numeroConta = numeroConta;
		this.cliente = cliente;
		System.out.println("Conta criada");
		contador++; // ACRESCENTANDO cada conta criada que você tem.
	}

	// METODOS
	// DEPOSITAR
	public void depositar(double valor) {
		this.saldo += valor;
	}

	// TRANSFERIR
	public void transferir(Conta conta, double valor) throws SaldoInsuficiente {
		boolean teste = sacar(valor);
		if (teste == true) {
			conta.depositar(valor);
		}
	}

	// SACAR
	public boolean sacar(double valor) throws SaldoInsuficiente {
		if (valor > 0) {
			if (this.saldo >= valor) {
				this.saldo -= valor;
				return true;
			}
		}
		throw new SaldoInsuficiente("Saldo Insuficiente");
		
	}
	
	public void exibirContator() {
		System.out.println("Contas criadas: " + this.contador);
	}

	// SALDO
	public abstract void exibirSaldo();

}
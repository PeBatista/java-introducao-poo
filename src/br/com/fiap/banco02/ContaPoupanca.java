package br.com.fiap.banco02;

public class ContaPoupanca extends Conta {
	private double saldoPoupanca;
	
	public ContaPoupanca(Cliente cliente, long numeroConta) {
		super(cliente, numeroConta);
		// TODO Auto-generated constructor stub
	}
	
	public void guardar(double guardar) throws SaldoInsuficiente {
		boolean testeSaldo = this.sacar(guardar);
		if (testeSaldo == true) {
			this.saldo -= guardar;
			saldoPoupanca += guardar; 
			System.out.println("Seu dinheiro foi guardado");
		} 
	}
	
	public void resgatar(double resgatar) throws SaldoInsuficiente {
		if (resgatar <= this.saldoPoupanca) {
			saldoPoupanca -= resgatar;
			this.saldo += resgatar;
		} else {
			System.out.println("O valor que você quer resgatar, e acima do que voce tem no saldo");
		}
	}
	
	

	@Override
	public void exibirSaldo() {
		System.out.println("Saldo do cliente " + this.cliente.getNmCliente() + ": "+ this.saldo);
	}
	public void exibirSaldoPopanca() {
		System.out.println("Saldo de conta Popança do cliente: " + this.cliente.getNmCliente() + ": " + this.saldoPoupanca);
	}
		
}

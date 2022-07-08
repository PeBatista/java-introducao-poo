package br.com.fiap.banco02;

public class ContaCorrente extends Conta{
	
	private double saldoInvestimento;

	public ContaCorrente(Cliente cliente, long numeroConta) {
		super(cliente, numeroConta);
		// TODO Auto-generated constructor stub
	}
	
	
	
	public void investir(Produto produto, double valor) throws SaldoInsuficiente {
		boolean teste = this.sacar(valor);
		if (teste == true) {
			this.saldoInvestimento += produto.investir(valor);
		}
		
//		if((this.saldo > 0 && investir > 0) && (investir <= this.saldo)) {
//		
//			if(produto.equalsIgnoreCase("cdb")) {
//			this.saldo -= investir;
//			saldoInvestimento += investir * (1 + 0.008); 
//		}
//		
//			if(produto.equalsIgnoreCase("lca")) {
//			this.saldo -= investir;
//			saldoInvestimento += investir * (1 + 0.007); 
//		}
//		
//			if(produto.equalsIgnoreCase("lci")) {
//			this.saldo -= investir;
//			saldoInvestimento += investir * (1 + 0.006); 
//		} 
//		
//		} else {
//			System.out.println("Você não tem este saldo para investir");
//		}
		
	}
	
	
	
	public void resgatar(double resgatar) throws SaldoInsuficiente {
		if (resgatar <= this.saldoInvestimento) {
			saldoInvestimento -= resgatar;
			this.saldo += resgatar;
		} else {
			System.out.println("O valor que você quer resgatar, e acima do que voce tem no saldo");
		}
	}
	
	
	
	@Override
	public void exibirSaldo() {
		System.out.println("Saldo do cliente " + this.cliente.getNmCliente() + ": "+ this.saldo);
		
	}
	
	public void exibirSaldoInvestimento() {
		System.out.println("Saldo de investimento do cliente " + this.cliente.getNmCliente() +": "+ this.saldoInvestimento);
	}
}

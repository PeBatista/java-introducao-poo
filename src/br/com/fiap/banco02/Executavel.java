package br.com.fiap.banco02;

public class Executavel {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Pedro Batista", "", "", "");
//		Cliente cliente2 = new Cliente ("Luizao", "", "", "");
//		Cliente cliente3 = new Cliente ("Arthurzao", "", "", "");
		ContaCorrente contaC = new ContaCorrente(cliente1, 1);
		ContaPoupanca contaP = new ContaPoupanca(cliente1, 1);
//		ContaCorrente conta2 = new ContaCorrente(cliente2, 2);
//		ContaCorrente conta3 = new ContaCorrente(cliente3, 3);
		// CRIANDO OS OBJETOS DE PRODUTOS PARA INVESTIRMOS

		Lci lci = new Lci();
		Lca lca = new Lca();
		Cdb cdb = new Cdb();
		// SIMULAÇÃO

		// cliente1.setNmCliente("Pedro");
		// System.out.println(cliente1.getNmCliente());

		contaC.depositar(100);

		contaC.exibirSaldo();

		try { // tente investir no cdb: 70, no lci:10 e no lca: 30, ou sejam: 110 reais, onde temos 100 reais, então pegue a exceção.
			contaC.investir(cdb, 70);
			contaC.investir(lci, 10);
			contaC.investir(lca, 40);
			contaC.exibirSaldo();
			contaC.exibirSaldoInvestimento();

		} catch (SaldoInsuficiente e) { // a exceção referenciada por e, então e.printStackTrace();, exibá: "Saldo Insuficiente"
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		contaC.exibirContator();
//		conta1.sacar(500);
//		conta2.sacar(350);
//		conta3.sacar(200);

//
//		conta1.exibirSaldo();
//		conta2.exibirSaldo();
//		conta3.exibirSaldo();
//
//		
//		conta1.transferir(conta3, 200);
//		conta2.transferir(conta1, 1000);
//		conta3.transferir(conta2, 1000);
//
//		conta1.exibirSaldo();
//		conta2.exibirSaldo();
//		conta3.exibirSaldo();
//		
//		System.out.println(cliente1.getNmCliente());

	}

}

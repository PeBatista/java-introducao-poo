package br.com.fiap.banco;

public class Executavel {

	public static void main(String[] args) {
		Conta conta1 = new Conta("Pedro", "14.56.26-22", 1 );
		Conta conta2 = new Conta("Batista", "11.23.99-11", 2);
		Conta conta3 = new Conta("Mendonça", "33.21.88-99", 3);
		
		conta1.depositar(10000);
		conta2.depositar(5000);
		conta3.depositar(100);
		
		conta1.saldo(); // puxando o método exbir saldo e mostrando oq tem na referência de obj conta1 = 10000.0
		conta2.saldo();
		conta3.saldo();
		
		conta1.sacar(5000); //tirou 10000- 5000 = 5000
		conta2.sacar(2500);
		conta3.sacar(10);

		conta1.saldo(); //mostramos o saldo depois da alteração
		conta2.saldo();
		conta3.saldo();
		
		conta3.transferir(conta1, 5); // conta3 = 90 --> deu mais 5 reais = 85
		
		conta1.saldo();
		conta3.saldo();
		
		conta2.transferir(conta3, 5);
		conta3.saldo();
		

	}

}

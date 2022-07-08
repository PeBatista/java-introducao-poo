package br.com.fiap.banco;

public class Conta {
	//ATRIBUTO
	private String nomeCliente, cpfCliente;
	private long numConta;
	private double saldoCliente; //escopo global, pode ser usado em todo campo
	// uma vez que voc� criou a classe com atributos e m�todos, depois disto podemos add CONSTRUCTOR
	
	//CONSTRUCTOR do objeto
	
	public Conta(String nomeCliente, String cpfCliente, long numConta) {
		this.nomeCliente = nomeCliente;
		this.cpfCliente = cpfCliente;
		this.numConta = numConta;
		System.out.println("Conta criada");
	}

	
	//METODO
	public boolean sacar (double valor) {
		if(valor>0) {
		if (this.saldoCliente>= valor){
			this.saldoCliente -= valor;
			return true;
		}
		}
		System.out.println("Saldo insuficiente");
		return false;
	}

	public void depositar(double valor) {//escopo local, vida �til dentro do depositar
		// retorna nada para n�s ent�o: void
		this.saldoCliente += valor; // this.oque eu quero referenciar
	}
	
	public void transferir(Conta conta, double valor) { //conta que eu vou transferir e o valor que eu vou entregar
		boolean teste = this.sacar(valor); //caso consiga sacar da minha
		if (teste==true) { 
			conta.depositar(valor); //vou conseguir depositar na conta dele
		}
	} 
	
	public void saldo() {
		System.out.println("Cliente: "+ this.nomeCliente); //mostrando o nome do cliente, this."Pedro" j� que e private
		System.out.println("Saldo: "+ this.saldoCliente);
	}
	
	
}

package br.com.fiap.banco02;

public class SaldoInsuficiente extends Exception{
	SaldoInsuficiente(String mensagem) {
		super(mensagem);
	}
}
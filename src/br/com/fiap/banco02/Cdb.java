package br.com.fiap.banco02;

public class Cdb implements Produto {

	@Override
	public double investir(double valor) {
		return valor * (1 + 0.008);

	}

}

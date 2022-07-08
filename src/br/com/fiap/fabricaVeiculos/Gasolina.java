package br.com.fiap.fabricaVeiculos;

public class Gasolina implements Combustivel {

	@Override
	public double abastecer(double qtdCombustivel) {
		if(qtdCombustivel > 50) {
			return 0;
		} else {
			return qtdCombustivel * 10;
		}
			
	}
	
}

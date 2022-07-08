package br.com.fiap.fabricaVeiculos;

public class Carro extends Veiculos {
	private String aerofolio;
	private double capacidadeRodagem, tanque;
	

	public Carro(Roda roda, Cambio cambio, Motor motor, String marca, String modelo, String cor, String renavam,
			String nomeCondutor, String anoFabricao, String anoModelo, String aerofolio) {
		super(roda, cambio, motor, marca, modelo, cor, renavam, nomeCondutor, anoFabricao, anoModelo);
		this.aerofolio = aerofolio;
	}
	
	public void abastecer(Combustivel combustivel, double qtdCombustivel) {
		double capTanque = (capacidadeRodagem / 10) + qtdCombustivel;
		if(capTanque <= 50) {
			this.capacidadeRodagem += combustivel.abastecer(qtdCombustivel); //GUARDANDO EM CPCD rodagem o combustivel, com m�todo abastecer(qd que voc� quer * 7.5 ou 10.0)
			System.out.println("Seu tanque foi abastecido com :"  + qtdCombustivel); 	
		} else {
			System.out.println("Sua capacidade de tanque foi excedida");
		}
		
	}

	@Override
	public void exibirDados() {
		System.out.println("Condutor do carro: "+ nomeCondutor);
		System.out.println("Marca do carro: "+ marca); 
		System.out.println("Modelo do carro: " + modelo); 
		System.out.println("Cor do carro: "+ cor); 
		System.out.println("Informa��es da roda deste carro: " + this.roda.getAroRoda() + ", " + this.roda.getMaterial() + ", "+ this.roda.getOffSet() + ", "+ this.roda.getTala()); // CHAMANDO POR UM getter, o aro desta roda 
		System.out.println("Pot�ncia do motor deste carro: " + this.motor.getPotencia());
		System.out.println("Tipo de Cambio de seu carro: " + this.cambio.getTipo());
		System.out.println("Renavam do carro: " + renavam); 
		System.out.println("Ano de Fabricacao: "+ anoFabricao);
		System.out.println("Ano do modelo do carro: "+ anoModelo);
		System.out.println("Velocidade neste exato momento: " + velocidade);
		System.out.println("Aerof�lio deste carro: "  + this.aerofolio);	
		System.out.println("Capacidade de rondagem: " + this.capacidadeRodagem +" KM�s");
	}
	
}

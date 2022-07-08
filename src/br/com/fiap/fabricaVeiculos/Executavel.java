 package br.com.fiap.fabricaVeiculos;

public class Executavel {

	public static void main(String[] args) {
		//COMBUSTIVEL CRIANDO
		Alcool alc = new Alcool();
		Gasolina gas = new Gasolina();
		//CARRO CARAC
		
		Roda roda1 = new Roda("14", "borracha", "negativo", "25");
		Motor motor1 = new Motor("1.5", "35cv", "Forte", "Ford ka");
		Cambio cambio1 = new Cambio("Manual", "Ford", "5", "50cm");
		
		//CAMINHAO CARAC
		
		Roda roda2 = new Roda("22", "borracha", "negativo", "25");
		Motor motor2 = new Motor("1.5", "35cv", "Forte", "Ford ka");
		Cambio cambio2 = new Cambio("Manual", "Ford", "5", "50cm");
		
		//MOTO CARAC
		
		Roda roda3 = new Roda("15", "Metal", "positivo", "25");
		Motor motor3 = new Motor("1.6", "40cv", "Fraco", "Kawazaki");
		Cambio cambio3 = new Cambio("Automático", "Honda", "5", "10cm");
	
		//CRIANDO OS SEUS VEICULOS
		
		Carro fordka =  new Carro(roda1, cambio1, motor1, "Ford", "Ford ka", "Preto", "123456", "Victor Batista", "2011", "2018", "Versão765zika");
		Caminhao scania = new Caminhao(roda2, cambio2, motor2, "Scania", "Scania super dismont", "Vermelho", "123467", "Pedro Batista", "2014", "2018", "simples", 22000);
		Moto kawazaki = new Moto(roda3, cambio3, motor3, "Honda", "Kawazaki", "Vermelho", "12345", "André Batista", "2014", "2018", "Amarelo");
		
		fordka.exibirDados();
//		scania.exibirDados(); 
//		kawazaki.exibirDados();
		
		
//		kawazaki.ligar();
//		kawazaki.acelerar(90);
//		kawazaki.empinar(true);
		
		fordka.abastecer(alc, 10); // OU SEJA 10 * 7.5 = 75 + 400 = 475 cpdRoda
		fordka.abastecer(gas, 40);
		fordka.exibirDados();

	}
}

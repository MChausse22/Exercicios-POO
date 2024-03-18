package atividades_poo;

public class Circulo {

	private double raio;
	
	//Construtor
	public Circulo(double raio) {
		setRaio(raio);
	}
	
	public void setRaio(double raio) {
		if(raio < 0) {
			System.out.println("O raio não pode ser negativo");
		}
		else {
			this.raio = raio;
			exibir();
		}
	}
	public double getRaio() {
		return raio;
	}
	public void exibir() {
		System.out.printf("Dados do círculo de raio %.2f\n", raio);
		System.out.printf("Diâmetro\t: %.2f\n", diametro());
		System.out.printf("Circunferência\t: %.2f\n", circunferencia());
		System.out.printf("Área\t\t: %.2f\n", area());
	}
	
	//Diâmetro
	public double diametro() {
		return raio * 2;
	}
	
	//Área
	public double area() {
		return Math.pow(raio, 2) * Math.PI; 
		
	}
	
	//Perímetro
	public double circunferencia() {
		return 2 * raio * Math.PI;
	}
}

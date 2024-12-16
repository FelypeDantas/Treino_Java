
public class Aeronave {
	double tamanhoEmMetros;
	int quantidadeDePassageiros;
	double velocidadePorKm;
	
	public Aeronave(double tamanhoEmMetros, int quantidadeDePassageiros, double velocidadePorKm) {
		super();
		this.tamanhoEmMetros = tamanhoEmMetros;
		this.quantidadeDePassageiros = quantidadeDePassageiros;
		this.velocidadePorKm = velocidadePorKm;
	}
	
	public void voar() {
		System.out.println("Vruuuuuum");
	}

}

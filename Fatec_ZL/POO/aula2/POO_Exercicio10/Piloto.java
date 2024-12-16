
public class Piloto extends Pessoa{

	String numeroDeBreve;
	double tempoDeVoo;
	String especializacao;
	
	public Piloto(String numeroDeBreve, double tempoDeVoo, String especializacao) {
		super();
		this.numeroDeBreve = numeroDeBreve;
		this.tempoDeVoo = tempoDeVoo;
		this.especializacao = especializacao;
	}
	
	public void pilota() {
		System.out.println("Pilotando");
	}
}


public class Aeroporto {
	String nomeAeroporto;
	double tamanhoEmMetros;
	int quantidadeAeronaves;
	
	public Aeroporto(String nomeAeroporto, double tamanhoEmMetros, int quantidadeAeronaves) {
		super();
		this.nomeAeroporto = nomeAeroporto;
		this.tamanhoEmMetros =  tamanhoEmMetros;
		this.quantidadeAeronaves = quantidadeAeronaves;
	}
	
	public void liberarPista() {
		System.out.println("Libera pista");
	}

}

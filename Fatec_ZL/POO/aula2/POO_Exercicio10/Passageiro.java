
public class Passageiro extends Pessoa{
	int numeroDoAssento;
	String destino;
	boolean passagem = false;
	
	public Passageiro(int numeroDoAssento, String destino, boolean passagem) {
		super();
		this.numeroDoAssento = numeroDoAssento;
		this.destino = destino;
		this.passagem = passagem;
	}
	
	public boolean entrarNoVoo(boolean passagem) {
		return passagem = true;
	}
}

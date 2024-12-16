
public class Diretor extends Gerente{

	double verba;
	
	public Diretor(String cargo, float salario, int quantidadeFuncionarios, double verba) {
		super();
		this.verba = verba;
	}
	
	public Diretor(String cargo, float salario, int quantidadeFuncionarios) {
		this(cargo, salario, quantidadeFuncionarios, 900.00);
	}
	
	public Diretor(String cargo, float salario) {
		super();
	}
	
	public Diretor(String cargo) {
		this(cargo, 1200);
	}
	
	public Diretor() {
		this("Diretor");
	}
	
	public void liderarDepartamento() {
		System.out.println("Grita... Grita... Grita...");
	}
}

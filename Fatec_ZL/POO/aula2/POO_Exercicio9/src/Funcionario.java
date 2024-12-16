
public class Funcionario extends Pessoa{
	String cargo;
	float salario;
	
	public Funcionario(String cargo, float salario) {
		this.cargo = cargo;
		this.salario = salario;
	}
	
	public Funcionario(String cargo) {
		this(cargo, 1200);
	}
	
	public Funcionario() {
		super();
	}
	
	public void trabalhar() {
		System.out.println("Trabalhando...");
	}
}

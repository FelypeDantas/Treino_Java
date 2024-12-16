
public class Gerente extends Funcionario{
	int quantidadeFuncionarios;
	
	public Gerente(String cargo, float salario, int quantidadeFuncionarios) {
		super();
		this.quantidadeFuncionarios = quantidadeFuncionarios;
	}
	
	public Gerente(String cargo, float salario) {
		super();
	}
	
	public Gerente(String cargo) {
		super();
	}
	
	public Gerente() {
		super();
	}
}

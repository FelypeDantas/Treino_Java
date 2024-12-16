
public class Pessoa {
	String nome;
	int idade;
	String sexo;
	
	public Pessoa(String nome, int idade, String sexo) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}
	
	public Pessoa() {
		this("André", 30, "Masculino");
	}

	public void dormir() {
		System.out.println("Zzz...");
	}
}

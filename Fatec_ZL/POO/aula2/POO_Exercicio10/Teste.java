
public class Teste {

	public static void main(String[] args) {
		Aeroporto ae1 = new Aeroporto("Kisaka", 90000.00, 15);
		Aeroporto ae2 = new Aeroporto("Shimaria", 70000.00, 10);
		
		ae1.quantidadeAeronaves += 1;
		ae2.quantidadeAeronaves -= 1;
		
		Aeronave nave1 = new Aeronave(10.2, 120, 200.60);
		Aeronave nave2 = new Aeronave(12.1, 300, 180.00);
		
		nave1.quantidadeDePassageiros -= 10;
		nave2.quantidadeDePassageiros -= 30;
		
		Passageiro pass1 = new Passageiro(13, "Dakota", false);
		Passageiro pass2 = new Passageiro(20, "Dakota", false);
		
		pass1.entrarNoVoo(false);
		pass2.entrarNoVoo(true);
		
		pass1.dormir();
		
		Piloto p1 = new Piloto("123456", 30000.00, "Acrobacias aéreas");
		Piloto p2 = new Piloto("789101", 90000.00, "Voo Turistico");
		
		p1.pilota();
		p2.nome = "Martin Luiz";
		
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa("Henrique Teixeira", 20, "Masculino");
		
		pessoa1.dormir();
		pessoa2.idade += 1;

	}

}

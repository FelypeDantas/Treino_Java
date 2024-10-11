package saida;

public class TesteImpressao {

	public static void main(String[] args) {
		System.out.print("[");
		System.out.print(1 + " , ");
		System.out.print(2 + " , ");
		System.out.print(3);
		System.out.print("]");
		
		System.out.println(" Aqui pula linha");
		System.out.println("***********************************");
		
		System.out.format("Bem-vindo %s ", "Felype");
	}
}

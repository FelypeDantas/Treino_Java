import java.util.Scanner;

public class Teste_selecao {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String linhaUnica = scanner.nextLine();
		Scanner linha = new Scanner(linhaUnica);
		
		int A = linha.nextInt();
		int B = linha.nextInt();
		int C = linha.nextInt();
		int D = linha.nextInt();
		
		int somaAB = A + B;
		int somaCD = C + D;
		
		if(B > C && D > A && somaCD > somaAB && somaAB > 0 && somaCD > 0 && A % 2 == 0) {
			System.out.println("Valores aceitos");
		} else {
			System.out.println("Valores nao aceitos");
		}
		
		scanner.close();
		linha.close();

	}

}

package iniciante;

import java.util.Scanner;

public class SomaSimples {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		
		scanner.close();
		int SOMA = A + B;
		
		System.out.println("SOMA = "+SOMA);
	}

}

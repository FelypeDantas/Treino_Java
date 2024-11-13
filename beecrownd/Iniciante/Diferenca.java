package iniciante;

import java.util.Scanner;

public class Diferenca {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		int D = scanner.nextInt();
		
		scanner.close();
		
		int media = (A * B - C * D);
		System.out.println("DIFERENCA = "+media);
	}
}

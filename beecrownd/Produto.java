package iniciante;

import java.util.Scanner;

public class Produto {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int valor1 = scanner.nextInt();
		int valor2 = scanner.nextInt();
		
		scanner.close();
		
		int PROD = valor1 * valor2 ; 
		System.out.println("PROD = "+PROD);
	}

}

package iniciante;

import java.util.Scanner;

public class ExtremamenteBasico {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		int c = a + b;
		
		System.out.println("X = "+c);
		scanner.close();
	}

}

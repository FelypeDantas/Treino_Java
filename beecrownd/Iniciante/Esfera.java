package iniciante;

import java.util.Scanner;

public class Esfera {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double PI = 3.14159;
		
		double raio = scanner.nextDouble();
		
		scanner.close();
		
		double resposta = (4.0/3) * PI * Math.pow(raio, 3);
		
		System.out.printf("VOLUME = %.3f%n", resposta);

	}

}

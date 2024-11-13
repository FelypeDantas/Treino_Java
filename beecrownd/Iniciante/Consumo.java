package iniciante;

import java.util.Scanner;

public class Consumo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int X = scanner.nextInt();
		double Y = scanner.nextDouble();
		
		scanner.close();
		
		double resposta = X / Y;
		System.out.printf("%.3f km/l\n", resposta);

	}

}

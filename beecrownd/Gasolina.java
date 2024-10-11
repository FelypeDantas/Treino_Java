package iniciante;

import java.util.Scanner;

public class Gasolina {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int tempo = scanner.nextInt();
		int vm = scanner.nextInt();
		
		scanner.close();
		
		double gasolina = (double) (tempo * vm) / 12;
		
		System.out.printf("%.3f\n",gasolina);

	}

}

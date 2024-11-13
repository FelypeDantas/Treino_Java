package iniciante;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int id = scanner.nextInt();
		int ht = scanner.nextInt();
		double vh = scanner.nextDouble();
		
		scanner.close();
		
		double salario = ht * vh;
		
		System.out.println("NUMBER = "+id);
		System.out.printf("SALARY = U$ %.2f%n",salario);
	}
}

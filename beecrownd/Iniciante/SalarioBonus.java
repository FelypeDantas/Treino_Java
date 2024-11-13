package iniciante;

import java.util.Scanner;

public class SalarioBonus {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String nome = scanner.nextLine();
		double salario = scanner.nextDouble();
		double vendas = scanner.nextDouble();
		
		scanner.close();
		
		double bonus = salario + vendas * 0.15;
		
		System.out.printf("TOTAL = R$ %.2f%n",bonus);

	}

}

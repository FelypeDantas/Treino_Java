package iniciante;

import java.util.Scanner;

public class AreaDoCirculo {
	
	/*A fórmula para calcular a área de uma circunferência é: area = π . raio2. 
	 * Considerando para este problema que π = 3.14159:
	- Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por π.*/

	public static void main(String[] args) {
		final double n = 3.14159;
		Scanner scanner = new Scanner(System.in);
		
		double raio = scanner.nextDouble();
		scanner.close();
		
		double area = n* Math.pow(raio, 2);
		System.out.printf("A=%.4f%n",area);
	}

}

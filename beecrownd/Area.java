package iniciante;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String linhaDeEntrada = scanner.nextLine();
        Scanner linhaScanner = new Scanner(linhaDeEntrada);
        
        double A = linhaScanner.nextDouble();
        double B = linhaScanner.nextDouble();
        double C = linhaScanner.nextDouble();
        
        linhaScanner.close();
        scanner.close();
        
        double triangulo = (A * C)/ 2;
        double circulo = Math.pow(C, 2) * 3.14159;
        double trapezio = (A + B) * C / 2;
        double quadrado = B * B;
        double retangulo = A * B;
        
        System.out.printf("TRIANGULO: %.3f%n",triangulo);
        System.out.printf("CIRCULO: %.3f%n",circulo);
        System.out.printf("TRAPEZIO: %.3f%n",trapezio);
        System.out.printf("QUADRADO: %.3f%n",quadrado);
        System.out.printf("RETANGULO: %.3f%n",retangulo);
	}

}

package maratona;

import java.util.Scanner;

public class rotaciona {

	public static void main(String[] args) {

		        Scanner scanner = new Scanner(System.in);

		        
		        int N = scanner.nextInt();
		        double angulo = Math.toRadians(scanner.nextDouble());

		        
		        double[][] matrizRotacao = {
		            { Math.cos(angulo), -Math.sin(angulo) },
		            { Math.sin(angulo), Math.cos(angulo) }
		        };

		       
		        double[][] pontos = new double[N][2];
		        for (int i = 0; i < N; i++) {
		            pontos[i][0] = scanner.nextDouble();
		            pontos[i][1] = scanner.nextDouble();
		        }

		        
		        double[][] pontosRotacionados = new double[N][2];
		        for (int i = 0; i < N; i++) {
		            double x = pontos[i][0];
		            double y = pontos[i][1];

		            
		            double xRotacionado = matrizRotacao[0][0] * x + matrizRotacao[0][1] * y;
		            double yRotacionado = matrizRotacao[1][0] * x + matrizRotacao[1][1] * y;

		            pontosRotacionados[i][0] = xRotacionado;
		            pontosRotacionados[i][1] = yRotacionado;
		        }

		        
		        for (int i = 0; i < N; i++) {
		            System.out.printf("%.2f %.2f\n", pontosRotacionados[i][0], pontosRotacionados[i][1]);
		        }

		        scanner.close();

	}

}

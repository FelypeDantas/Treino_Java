import java.util.Scanner;

public class Bhaskara {

	public static void calcularRaizes(double A, double B, double C) { 
		double delta = B * B - 4 * A * C;

        if (delta < 0 || A == 0) {
            System.out.println("Impossivel calcular");
            return;
        }

        double R1 = (-B + Math.sqrt(delta)) / (2 * A);
        double R2 = (-B - Math.sqrt(delta)) / (2 * A);

        System.out.printf("R1 = %.5f%n", R1);
        System.out.printf("R2 = %.5f%n", R2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String linhaUnica = scanner.nextLine();
        Scanner linha = new Scanner(linhaUnica);
        
        double A = linha.nextDouble();
        double B = linha.nextDouble();
        double C = linha.nextDouble();

        calcularRaizes(A, B, C);

        scanner.close();
        linha.close();

	}

}

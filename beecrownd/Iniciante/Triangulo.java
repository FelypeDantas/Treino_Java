import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        // Ordenando os lados de forma que A seja sempre o maior
        if (A < B) {
            double temp = A;
            A = B;
            B = temp;
        }
        if (A < C) {
            double temp = A;
            A = C;
            C = temp;
        }
        if (B < C) {
            double temp = B;
            B = C;
            C = temp;
        }

        // Verificando se pode formar um triângulo
        if (A >= B + C) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            // Classificando o tipo de triângulo
            if (A * A == B * B + C * C) {
                System.out.println("TRIANGULO RETANGULO");
            } else if (A * A > B * B + C * C) {
                System.out.println("TRIANGULO OBTUSANGULO");
            } else {
                System.out.println("TRIANGULO ACUTANGULO");
            }

            // Verificando se os lados são iguais
            if (A == B && B == C) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if (A == B || B == C || A == C) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }

        scanner.close();
    }
}

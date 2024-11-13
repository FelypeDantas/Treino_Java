package iniciante;

import java.util.Scanner;

public class CalculoSimples {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê a primeira linha de entrada
        String linhaDeEntrada1 = scanner.nextLine();
        Scanner linhaScanner1 = new Scanner(linhaDeEntrada1);

        int id = linhaScanner1.nextInt();
        int quantidade = linhaScanner1.nextInt();
        double valor = linhaScanner1.nextDouble();

        // Fecha o scanner para a primeira linha de entrada
        linhaScanner1.close();

        // Lê a segunda linha de entrada
        String linhaDeEntrada2 = scanner.nextLine();
        Scanner linhaScanner2 = new Scanner(linhaDeEntrada2);

        int id2 = linhaScanner2.nextInt();
        int quantidade2 = linhaScanner2.nextInt();
        double valor2 = linhaScanner2.nextDouble();

        // Fecha os scanners
        scanner.close();
        linhaScanner2.close();

        // Calcula o total
        double total = valor * quantidade + valor2 * quantidade2;

        // Exibe o resultado
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
    }
}

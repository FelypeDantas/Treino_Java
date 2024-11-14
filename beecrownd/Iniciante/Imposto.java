import java.util.Scanner;

public class Imposto {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);

        double renda = sca.nextDouble();
        double imposto = 0.0;

        if (renda <= 2000.00) {
            System.out.println("Isento");
        } else if (renda <= 3000.00) {
            imposto = (renda - 2000.00) * 0.08;
            mensagem(imposto);
        } else if (renda <= 4500.00) {
            imposto = (1000.00 * 0.08) + (renda - 3000.00) * 0.18;
            mensagem(imposto);
        } else {
            imposto = (1000.00 * 0.08) + (1500.00 * 0.18) + (renda - 4500.00) * 0.28;
            mensagem(imposto);
        }

        sca.close();
    }

    public static void mensagem(double imposto) {
        System.out.printf("R$ %.2f%n", imposto);
    }
}


import java.util.Scanner;

public class ImparesConsecutivos {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);

        int numero1 = sca.nextInt();
        int numero2 = sca.nextInt();
        int soma = 0;

        int inicio = Math.min(numero1, numero2) + 1;
        int fim = Math.max(numero1, numero2) - 1;

        for (int i = inicio; i <= fim; i++) {
            if (i % 2 != 0) {
                soma += i;
            }
        }

        System.out.println(soma);
        sca.close();
    }
}

import java.util.Scanner;

public class LaboratorioCobaias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int total = 0;
        int coelhos = 0;
        int ratos = 0;
        int sapos = 0;

        for (int i = 0; i < N; i++) {
            int quantidade = scanner.nextInt();
            char tipo = scanner.next().charAt(0);

            total += quantidade;
            switch (tipo) {
                case 'C':
                    coelhos += quantidade;
                    break;
                case 'R':
                    ratos += quantidade;
                    break;
                case 'S':
                    sapos += quantidade;
                    break;
            }
        }

        double percentualCoelhos = (coelhos / (double) total) * 100;
        double percentualRatos = (ratos / (double) total) * 100;
        double percentualSapos = (sapos / (double) total) * 100;

        System.out.println("Total: " + total + " cobaias");
        System.out.println("Total de coelhos: " + coelhos);
        System.out.println("Total de ratos: " + ratos);
        System.out.println("Total de sapos: " + sapos);
        System.out.printf("Percentual de coelhos: %.2f %%\n", percentualCoelhos);
        System.out.printf("Percentual de ratos: %.2f %%\n", percentualRatos);
        System.out.printf("Percentual de sapos: %.2f %%\n", percentualSapos);

        scanner.close();
    }
}
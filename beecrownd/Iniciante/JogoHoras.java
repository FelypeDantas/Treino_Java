import java.util.Scanner;

public class JogoHoras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int horaInicial = scanner.nextInt();
        int horaFinal = scanner.nextInt();

        int duracao;

        if (horaInicial == horaFinal) {
            duracao = 24;
        } else if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        } else {
            duracao = (24 - horaInicial) + horaFinal;
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        scanner.close();
    }
}

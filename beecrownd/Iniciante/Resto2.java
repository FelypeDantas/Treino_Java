import java.util.Scanner;

public class Resto2 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);

        int N = sca.nextInt();

        for (int i = 1; i < 10000; i++) {
            if (i % N == 2) {
                System.out.println(i);
            }
        }

        sca.close();
    }
}


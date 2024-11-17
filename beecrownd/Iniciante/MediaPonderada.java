import java.util.Scanner;

public class MediaPonderada {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int N = sca.nextInt();

        for (int i = 0; i < N; i++) {
            float v1 = sca.nextFloat();
            float v2 = sca.nextFloat();
            float v3 = sca.nextFloat();
            float media = (v1 * 2 + v2 * 3 + v3 * 5) / (2 + 3 + 5);
            System.out.printf("%.1f\n", media);
        }
        sca.close();
    }
}

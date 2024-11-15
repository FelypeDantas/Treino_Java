import java.util.Scanner;

public class Intervalo2 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);

        int N = sca.nextInt();
        
        int inCount = 0;
        int outCount = 0;
        
        for (int i = 0; i < N; i++) {
            int X = sca.nextInt();
            
            if (X >= 10 && X <= 20) {
                inCount++;
            } else {
                outCount++;
            }
        }
        
        System.out.println(inCount + " in");
        System.out.println(outCount + " out");
        sca.close();
    }
}

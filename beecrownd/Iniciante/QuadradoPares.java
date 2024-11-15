import java.util.Scanner;

public class QuadradoPares {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);

        int N = sca.nextInt();
        while(N > 2000 || N < 5){
            System.out.println("Digite novamente: ");
            N = sca.nextInt();
        }

        for(int X = 1; X <= N; X++){
            if(X % 2 == 0){
                System.out.println(X + "^2 = " + (X * X));
            }
        }
        sca.close();
    }
}

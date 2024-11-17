import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        
        int N = sca.nextInt();

        while(N < 2 || N > 1000){
            System.out.println("Digite outro valor menor que 1000 e maior que 2:");
            N = sca.nextInt();
        }

        for(int i = 1; i <= 10; i++){
            int multiplicacao = N * i;
            System.out.println(i + " x " + N  + " = " + multiplicacao);
        }
        sca.close();
    }
}

import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);

        int A = sca.nextInt();
        int B = sca.nextInt();

        if(A % B == 0){
            System.out.println("Sao Multiplos");
        } else if (B % A == 0){
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }
        sca.close();
    }
}

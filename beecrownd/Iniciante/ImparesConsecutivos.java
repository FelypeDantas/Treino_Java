import java.util.Scanner;

public class ImparesConsecutivos {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);

        int X = sca.nextInt();
        int cont = 0;
        
        while( cont < 6){
            if(X % 2 != 0){
                System.out.println(X);
                cont++;
            }
            X++;
        }

        sca.close();
    }
}

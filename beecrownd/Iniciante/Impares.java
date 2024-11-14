import java.util.Scanner;

public class Impares {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);

        int X = sca.nextInt();

        for(int i=1; i <= X; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
        sca.close();
    }
}

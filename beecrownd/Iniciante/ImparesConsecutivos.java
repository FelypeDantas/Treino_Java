import java.util.Scanner;

public class ImparesConsecutivos {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);

        int vetor[] = new int[6];
        int X = sca.nextInt();

        for(int i=X; i < vetor.length; i++){
            if(i % 2 != 0){
                vetor[i] = i;
                System.out.println(vetor[i]);
            }
        }

        sca.close();
    }
}

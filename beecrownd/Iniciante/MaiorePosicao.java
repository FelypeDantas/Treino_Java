import java.util.Scanner;

public class MaiorePosicao {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int vetor[] = new int[100];
        int maior = 0;

        for(int i = 0; i < 100; i++){
            vetor[i] = sca.nextInt();
            if(vetor[i] > maior){
                maior = vetor[i];
            }
        }

        for(int i = 0; i < 100; i++){
            if(maior == vetor[i]){
                System.out.println(maior);
                System.out.println(i + 1);
                break;
            }
        }
        sca.close();
    }
}

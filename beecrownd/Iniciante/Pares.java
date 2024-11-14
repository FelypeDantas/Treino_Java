import java.util.Scanner;

public class Pares {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int pares[] = new int[5];
        int contador = 0;

        for(int i = 0; i<5; i++){
            pares[i] = sca.nextInt();
            if(pares[i] % 2 == 0){
                contador++;
            }
        }

        System.out.println(contador + " valores pares");
        sca.close();
    }
}

import java.util.Scanner;

public class Positivos {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        
        double valores[] = new double[6];
        int contador = 0;

        for(int i=0; i < 6; i++){
            valores[i] = sca.nextDouble();
            if(valores[i] > 0){
                contador++;
            }
        }
        System.out.println(contador + " valores positivos");
        sca.close();
    }
}

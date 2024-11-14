import java.util.Scanner;

public class MediaPositivos {
    public static void main(String[] args) {
       Scanner sca = new Scanner(System.in);
        
        double valores[] = new double[6];
        int contador = 0;
        double media = 0;

        for(int i=0; i < 6; i++){
            valores[i] = sca.nextDouble();
            if(valores[i] > 0){
                contador++;
                media += valores[i];
            }
        }
        media = media / contador;
        System.out.println(contador + " valores positivos");
        System.out.printf("%.1f%n", media);
        sca.close();
    }
}

import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int valores[] = new int[5];
        int contaPares = 0;
        int contaImpares = 0;
        int contaPositivos = 0;
        int contaNegativos = 0;

        for(int i=0; i<5; i++){
            valores[i] = sca.nextInt();
            if(valores[i] % 2 == 0){
                contaPares++;
            } else{
                contaImpares++;
            }
            if(valores[i] > 0){
                contaPositivos++;
            } else if(valores[i] < 0) {
                contaNegativos++;
            }
        }

        System.out.println(contaPares + " valor(es) par(es)");
        System.out.println(contaImpares + " valor(es) impar(es)");
        System.out.println(contaPositivos + " valor(es) positivo(s)");
        System.out.println(contaNegativos + " valor(es) negativo(s)");

        sca.close();
    }
}
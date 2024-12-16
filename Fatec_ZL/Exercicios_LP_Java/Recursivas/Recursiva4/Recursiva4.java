package numero4;

import javax.swing.JOptionPane;

/**
 * 4)   Serie4 = (N/1) +(N-1 / 2 ) + (N-2 / 3) + .... + (1/N) 
 * @author Felype Dantas Dos Santos
 */
public class Recursiva4 {
    public static void main(String[] args) {
        double ultimo, retorno;

       ultimo = Double.parseDouble(JOptionPane.showInputDialog("Informe o número final da série: "));

        retorno = somaSerie((float) ultimo, 1);
        System.out.printf("Soma da série = %.2f", retorno);
    }

    static float somaSerie(float n, float denominador) {
        if (n > 1) {
            return (n / denominador) + somaSerie(--n, ++denominador);
        } else {
            return n/denominador;
        }
    }
}

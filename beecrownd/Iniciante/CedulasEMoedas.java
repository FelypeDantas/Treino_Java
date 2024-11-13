package iniciante;

import java.math.BigDecimal;
import java.util.Scanner;

public class CedulasEMoedas {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        BigDecimal N = scanner.nextBigDecimal();
        int contador100 = 0;
        int contador50 = 0;
        int contador20 = 0;
        int contador10 = 0;
        int contador5 = 0;
        int contador2 = 0;
        int contador1 = 0;
        int contador05 = 0;
        int contador025 = 0;
        int contador010 = 0;
        int contador005 = 0;
        int contador001 = 0;
        BigDecimal soma = BigDecimal.ZERO;

        BigDecimal cem = new BigDecimal("100");
        BigDecimal cinquenta = new BigDecimal("50");
        BigDecimal vinte = new BigDecimal("20");
        BigDecimal dez = new BigDecimal("10");
        BigDecimal cinco = new BigDecimal("5");
        BigDecimal dois = new BigDecimal("2");
        BigDecimal um = new BigDecimal("1");
        BigDecimal cincoCentavos = new BigDecimal("0.5");
        BigDecimal vinteCincoCentavos = new BigDecimal("0.25");
        BigDecimal dezCentavos = new BigDecimal("0.10");
        BigDecimal cincoCentavosMoeda = new BigDecimal("0.05");
        BigDecimal umCentavo = new BigDecimal("0.01");

        while (N.compareTo(BigDecimal.ZERO) > 0) {
            if (N.compareTo(cem) >= 0) {
                contador100++;
                soma = soma.add(cem);
                N = N.subtract(cem);
            } else if (N.compareTo(cinquenta) >= 0) {
                contador50++;
                soma = soma.add(cinquenta);
                N = N.subtract(cinquenta);
            } else if (N.compareTo(vinte) >= 0) {
                contador20++;
                soma = soma.add(vinte);
                N = N.subtract(vinte);
            } else if (N.compareTo(dez) >= 0) {
                contador10++;
                soma = soma.add(dez);
                N = N.subtract(dez);
            } else if (N.compareTo(cinco) >= 0) {
                contador5++;
                soma = soma.add(cinco);
                N = N.subtract(cinco);
            } else if (N.compareTo(dois) >= 0) {
                contador2++;
                soma = soma.add(dois);
                N = N.subtract(dois);
            } else if (N.compareTo(um) >= 0) {
                contador1++;
                soma = soma.add(um);
                N = N.subtract(um);
            } else if (N.compareTo(cincoCentavos) >= 0) {
                contador05++;
                soma = soma.add(cincoCentavos);
                N = N.subtract(cincoCentavos);
            } else if (N.compareTo(vinteCincoCentavos) >= 0) {
                contador025++;
                soma = soma.add(vinteCincoCentavos);
                N = N.subtract(vinteCincoCentavos);
            } else if (N.compareTo(dezCentavos) >= 0) {
                contador010++;
                soma = soma.add(dezCentavos);
                N = N.subtract(dezCentavos);
            } else if (N.compareTo(cincoCentavosMoeda) >= 0) {
                contador005++;
                soma = soma.add(cincoCentavosMoeda);
                N = N.subtract(cincoCentavosMoeda);
            } else {
                contador001++;
                soma = soma.add(umCentavo);
                N = N.subtract(umCentavo);
            }
        }

        scanner.close();

        System.out.println("NOTAS:\n" + contador100 + " nota(s) de R$ 100.00\n" + contador50 + " nota(s) de R$ 50.00\n" + contador20 + " nota(s) de R$ 20.00\n" + contador10 + " nota(s) de R$ 10.00\n" + contador5 + " nota(s) de R$ 5.00\n" + contador2 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:\n" + contador1 + " moeda(s) de R$ 1.00\n" + contador05 + " moeda(s) de R$ 0.50\n" + contador025 + " moeda(s) de R$ 0.25\n" + contador010 + " moeda(s) de R$ 0.10\n" + contador005 + " moeda(s) de R$ 0.05\n" + contador001 + " moeda(s) de R$ 0.01");
	}
}
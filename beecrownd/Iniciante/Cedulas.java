package iniciante;

import java.util.Scanner;

public class Cedulas {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		int contador100 = 0;
		int contador50 = 0;
		int contador20 = 0;
		int contador10 = 0;
		int contador5 = 0;
		int contador2 = 0;
		int contador1 = 0;
		int soma = 0;
		
		while(N > 0) {
			if(N >= 100) {
				contador100++;
				soma = soma + 100;
				N = N - 100;
			}
			else if(N < 100  && N >= 50) {
				contador50++;
				soma = soma + 50;
				N = N - 50;
			}
			else if(N < 50 && N >= 20) {
				contador20++;
				soma = soma + 20;
				N = N - 20;
			}
			else if(N < 20 && N >= 10) {
				contador10++;
				soma = soma + 10;
				N = N - 10;
			}
			else if(N < 10  && N >= 5) {
				contador5++;
				soma = soma + 5;
				N = N - 5;
			}
			else if( N < 5  && N >= 2) {
				contador2++;
				soma = soma + 2;
				N = N - 2;
			}
			else {
				contador1++;
				soma = soma+ 1;
				N = N - 1;
			}
			
		}
		
		scanner.close();
		
//		N = (contador100 * 100) + (contador50 * 50) + (contador20 * 20) + (contador10 * 10) + (contador5 * 5) + (contador2 * 2) + (contador1 * 1);
		System.out.println(soma + "\n" +contador100 + " nota(s) de R$ 100,00\n" + contador50+ " nota(s) de R$ 50,00\n"+contador20+ " nota(s) de R$ 20,00\n" + contador10 + " nota(s) de R$ 10,00\n" + contador5 + " nota(s) de R$ 5,00\n" + contador2 + " nota(s) de R$ 2,00\n" + contador1 + " nota(s) de R$ 1,00");
	}

}

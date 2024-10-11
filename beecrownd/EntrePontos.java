package iniciante;

import java.util.Scanner;

public class EntrePontos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String linha1 = scanner.nextLine();
		Scanner p1 = new Scanner(linha1);
		
		String linha2 = scanner.nextLine();
		Scanner p2 = new Scanner(linha2);
		
		double x1 = p1.nextDouble();
		double y1 = p1.nextDouble();
		p1.close();
		
		double x2 = p2.nextDouble();
		double y2 = p2.nextDouble();
		p2.close();
		
		scanner.close();
		
		double valor = ((x2 - x1)*(x2 - x1)) + ((y2 - y1) * (y2 - y1));
		
		double resposta = Math.sqrt(valor);
		
		System.out.printf("%.4f\n",resposta);

	}

}

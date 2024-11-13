package beecrownd;

import java.util.Scanner;

public class Coordenadas {

	public static void main(String[] args) {
		
		Scanner sca = new Scanner(System.in);
		String linhaUnica = sca.nextLine();
		Scanner linha = new Scanner(linhaUnica);
		
		double x = linha.nextDouble();
		double y = linha.nextDouble();
		
		if( x == 0.0 && y == 0.0) {
			System.out.println("Origem");
		} else if(x > 0.0 && y > 0.0) {
			System.out.println("Q1");
		} else if(x < 0.0 && y > 0.0) {
			System.out.println("Q2");
		} else if(x > 0.0 && y < 0.0) {
			System.out.println("Q4");
		} else if(x < 0.0 && y < 0.0) {
			System.out.println("Q3");
		} else if((x > 0 && y == 0) || (x < 0 && y== 0)) {
			System.out.println("Eixo X");
		} else if((y > 0 && x == 0) || (y < 0 && x== 0)) {
			System.out.println("Eixo Y");
		}
		
		sca.close();
		linha.close();
	}

}

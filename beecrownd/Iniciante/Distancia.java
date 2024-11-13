package iniciante;

import java.util.Scanner;

public class Distancia {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int Km = scanner.nextInt();
		
		scanner.close();
		
		int resposta = Km * 2;
		
		System.out.println(resposta + " minutos");
	}

}

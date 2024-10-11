package iniciante;

import java.util.Scanner;

public class ConversaoTempo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
	
		int horas = N / 3600;
        int minutos = (N % 3600) / 60;
        int segundos = N % 60;
        
        System.out.printf("%d:%d:%d\n", horas, minutos, segundos);
        
        scanner.close();
	}
}

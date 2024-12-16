import java.util.Scanner;

public class mentirinha {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		
		int divisor = 1;
		int contador = 0;
		
		while(N >= divisor) {
			if(N % divisor == 0) {
				contador += 1;
			}
			divisor += 1;
		}
		if(contador == 3) {
			System.out.println("sim");
		} else {
			System.out.println("nao");
		}
			scanner.close();
	}

}

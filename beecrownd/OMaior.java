package iniciante;

import java.util.Scanner;

public class OMaior {

	public static void main(String[] args) {

		        Scanner scanner = new Scanner(System.in);
		        
		        // Lendo os três valores
		        int a = scanner.nextInt();
		        int b = scanner.nextInt();
		        int c = scanner.nextInt();
		        
		        // Encontrando o maior entre a e b
		        int maiorAB = (a + b + Math.abs(a - b)) / 2;
		        
		        // Encontrando o maior entre o maiorAB e c
		        int maior = (maiorAB + c + Math.abs(maiorAB - c)) / 2;
		        
		        // Imprimindo o resultado
		        System.out.println(maior + " eh o maior");
		        
		        scanner.close();
		    }

	}

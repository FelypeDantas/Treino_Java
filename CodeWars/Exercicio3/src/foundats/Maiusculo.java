package foundats;

import java.util.Scanner;

public class Maiusculo {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		
		String texto = sca.next();
		
		System.out.println(texto.toUpperCase());
		
		sca.close();

	}

}

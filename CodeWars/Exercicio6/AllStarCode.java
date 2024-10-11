package Exercicio2;

import java.util.Scanner;

public class AllStarCode {

	public static void main(String[] args) {
	
		Scanner sca = new Scanner(System.in);
		
		String palavra = sca.next();
		char letra = sca.next().charAt(0);
		int cta = 0;
		
		for(int i=0; i < palavra.length(); i++) {
			char c = palavra.charAt(i);
			if(c == letra) {
				cta++;
			}
		}
		
		System.out.println("(" + '"' + palavra + '"' + ", '" + letra + "') => " + cta);
		sca.close();
	}

}

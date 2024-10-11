package Solorean;

import java.util.Scanner;

public class Alien {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		
		String palavra = sca.next();
		
		
		  StringBuilder sb = new StringBuilder(palavra);
	        
		  sb.reverse();
	        
	      String textoInvertido = sb.toString();
	        
	      System.out.println("Texto invertido: " + textoInvertido);
	      sca.close();

	}

}

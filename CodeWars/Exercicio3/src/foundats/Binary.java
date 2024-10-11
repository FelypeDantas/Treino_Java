package foundats;

import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		
		String digito = sca.next();
		String array[] = new String[digito.length()];
		
		for(int i = 0; i < digito.length(); i++) {
			char c = digito.charAt(i);
			int valor = Character.getNumericValue(c);
			if(valor < 5) {
				array[i] = "0";
			} else {
				array[i] = "1";
			}
		}

		 StringBuilder result = new StringBuilder();
	        for(int i = 0; i < array.length; i++) {
	            result.append(array[i]);
	        }
	        
	        System.out.println(result.toString());
		sca.close();
	}

}

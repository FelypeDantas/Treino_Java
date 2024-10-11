package CodeWars;

import java.util.Scanner;

public class ExercicioBanjo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.next();
		char c = name.charAt(0);
		
		if(c == 'R' || c == 'r') {
			System.out.println(name + " plays banjo");
		} else {
			System.out.println(name + " does not play banjo");
		}
		
		scanner.close();

	}

}

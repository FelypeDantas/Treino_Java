package CodeWars;

import java.util.Scanner;

public class Minutes {

	public static void main(String[] args) {
		
		Scanner sca = new Scanner(System.in);
		
		int h = sca.nextInt();
		int m = sca.nextInt();
		int s = sca.nextInt();
		
		if(0 <= h || h <= 23) {
			h = h * 3600000;
		}
		if(m >= 0 || m <= 59) {
			m = m * 60000;
		}
		if(s >= 0 || s <= 59) {
			s = s * 1000;
		}
		
		int result = h + m + s;
		
		System.out.println(result);
		sca.close();

	}

}

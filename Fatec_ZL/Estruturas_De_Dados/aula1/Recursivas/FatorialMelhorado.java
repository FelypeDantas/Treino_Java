package outros;

public class FatorialMelhorado {

	public static void main(String[] args) {
	 
		for(int counter = 0; counter <= 21; counter++) {
			System.out.printf("%d! = %d%n", counter , factorial(counter));
		}

	}

	public static long factorial(int counter) {
		if(counter <= 1) {
			return 1;
			
		} else {
			return counter * factorial(counter - 1);
		}
	}

}

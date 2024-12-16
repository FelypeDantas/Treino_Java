package ExerciciosSatoshi;

public class Exercicio1 {
    public static void main (String args []) {
    	System.out.println("A soma de 1 até 100 é de: " +Serie1(1));
    }

	private static int Serie1(int i) {
		if(i > 100) {
			return 0;
		}
		return  i + Serie1(i + 1);
	}
}

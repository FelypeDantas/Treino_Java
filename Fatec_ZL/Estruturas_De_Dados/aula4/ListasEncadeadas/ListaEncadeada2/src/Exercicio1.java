import java.util.LinkedList;

public class Exercicio1 {

	public static void main(String[] args) {
		LinkedList<Integer> lista = new LinkedList<>();
		
		for(int i=0; i < 10; i++) {
			if(i % 2 == 0) {
				lista.addFirst(i * i);
				
			} else if(i <= 6) {
				lista.addFirst(i);
				
			} else {
				System.out.println(lista.get(lista.size() - 1));
				lista.removeLast();
			}
		}
		
		System.out.println(lista.size());

	}

}

import java.util.LinkedList;

public class Exercicio1 {

	public static void main(String[] args) {
		LinkedList<Integer> lista = new LinkedList<>();
		
		for(int i=100; i < 115; i++) {
			if(lista.isEmpty()) {
				lista.addFirst(i + 100);
				
			} else if(lista.size() <= 4) {
				lista.addLast(i + 50);
				
			} else {
				System.out.println(lista.get(0));
				lista.removeFirst();
			}
		}
		
		System.out.println(lista.size());

	}

}

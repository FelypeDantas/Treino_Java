package List;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		 ArrayList<String> listaStrings = new ArrayList<>();
	        listaStrings.add("Java");
	        listaStrings.add("C++");
	        listaStrings.add("Python");
	        listaStrings.add("C");
	        listaStrings.add("C#");
	        for (String elemento : listaStrings) {
	            System.out.println(elemento);
	        }

	}

}

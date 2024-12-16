
public class Fila {
	
	private int ultimo;
	private int primeiro;
	private final int max = 50;
	private int tipoItem[];
	
	public Fila() {
		this.primeiro = 0;
		this.ultimo = 0;
		this.tipoItem = new int[max];
	}
	
	public boolean estavazio() {
		return (primeiro == ultimo);
	}
	
	public void enqueue(int item) {
		tipoItem[ultimo % max] = item;
		ultimo++;
	}
	
	public int dequeue(int item) {
		if(estavazio()) {
			System.err.println("Não existe Fila");
			return 0;
		} else {
			primeiro++;
			return tipoItem[(primeiro-1) % max] ;
		}
	}
	
	public void mostrar() {
		System.out.print("Fila: [ ");
		for(int i = primeiro; i < ultimo; i++) {
			System.out.print(tipoItem[i % max] + " ");
		}
		System.out.println("]");
	}
	
	public void inverteFila() {
	    if (estavazio()) {
	        System.err.println("Não há como inverter elementos da fila, pois ela está vazia.");
	        return;
	    }

	    int[] aux = new int[max];
	    int indiceAux = 0;

	    // Copia os elementos da fila original para o array auxiliar na ordem inversa
	    for (int i = ultimo - 1; i >= primeiro; i--) {
	        aux[indiceAux++] = tipoItem[i % max];
	    }

	    // Copia os elementos invertidos de volta para a fila original
	    for (int i = primeiro; i < ultimo; i++) {
	        tipoItem[i % max] = aux[i - primeiro];
	    }

	    System.out.print("Fila Invertida: [");
	    for (int i = primeiro; i < ultimo; i++) {
	        System.out.print(tipoItem[i % max] + " ");
	    }
	    System.out.println("]");
	}

}

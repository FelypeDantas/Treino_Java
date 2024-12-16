
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

}

package Fila;

public class Fila<tipoItem> {
	
	private int primeiro;
	private int ultimo;
	private final int max = 100;
	private int tipoItem[];
	
	public Fila() {
		this.primeiro = 0;
		this.ultimo = 0;
		this.tipoItem = new int[max];
	}
	
	public boolean estavazio() {
		return (primeiro == ultimo);
	}
	
	public boolean estacheio() {
		return (ultimo-primeiro == max);
	}
	
	public void inserir(tipoItem item) {
		if(estacheio()) {
			System.err.println("Fila esta cheia");
		} else {
			tipoItem[ultimo % max] = (int) item;
			ultimo++;
		}
	}
	
	public int remover(tipoItem item) {
		if(estavazio()) {
			System.err.println("Não existe Fila");
			return 0;
		} else {
			primeiro++;
			return tipoItem[(primeiro-1) % max] ;
		}
	}
	
	public void mostrar() {
		System.out.print("Fila: [");
		for(int i = primeiro; i < ultimo; i++) {
			System.out.print(tipoItem[i % max] + " ");
		}
		System.out.println("]\n");
	}
}

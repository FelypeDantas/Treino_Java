package pilha;

public class Pilha <tipoItem>{

	private int tipoItem[];
	private final int max = 100;
	private int tamanho;
	
	public Pilha() {
		this.tamanho = 0;
		this.tipoItem = new int[max];
		
	}
	
	public boolean estaCheia() {
		return (tamanho == max);
	}
	
	public boolean estaVazia() {
		return (tamanho == 0);
	}
	
	public void inserir(tipoItem item) {
		if(estaCheia()) {
			System.err.println("Pilha cheia!\n");
		} else {
			tipoItem[tamanho] = (int) item;
			tamanho++;
		}
		
	}
	
	public int remover() {
		if(estaVazia()) {
			System.err.println("A Pilha já está vazia!\n");
			return 0;
		} else {
			tamanho--;
			return tipoItem[tamanho];
		}
	}
	
	public void imprimir() {
		System.out.print("Pilha: [");
		for(int i=0; i < tamanho; i++) {
			System.out.print(" " + tipoItem[i] + " ");
		}
		System.out.print("]\n");
	}
	
	public int size() {
		System.out.println(tamanho);
		return tamanho;
	}
	
}

package controller;

public class QuickSortController {
	
	public QuickSortController() {
		super();
	}
	
	public void ordenar(int[] vetor){
		quick(vetor, 0, vetor.length - 1);
	}

	private void quick(int[] vetor, int inicio, int fim){
		if(fim > inicio) {
			int indexPivo = dividir(vetor, inicio, fim);
			quick(vetor, inicio, indexPivo - 1);
			quick(vetor, indexPivo + 1, fim);
		}
	}

	private int dividir(int[] vetor, int inicio, int fim){
		int pivo = vetor[inicio];
		int pontDir = fim;
		int pontEsq = (inicio + 1);

		while(pontEsq <= pontDir){
			while(pontEsq <= pontDir && vetor[pontEsq] <= pivo){
				pontEsq++;
			}
			
			while(pontDir >= pontEsq && vetor[pontDir] > pivo){
				pontDir--;
			}

			if(pontEsq < pontDir){
				trocar(vetor, pontDir--, pontEsq++);
			}
		}

		trocar(vetor, inicio, pontDir);
		return pontDir;
	}

	private void trocar (int[] vetor, int i, int j) {
		int temp = vetor[i];
		vetor[i] = vetor[j];
		vetor[j] = temp;
	}

}

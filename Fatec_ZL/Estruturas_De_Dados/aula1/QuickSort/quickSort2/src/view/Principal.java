package view;

import controller.QuickSortController;

public class Principal {

	public static void main(String[] args) {
		
		int[] vetor = {31, 32, 33, 34, 99, 98, 97, 96};
		
		QuickSortController quick = new QuickSortController();
		quick.ordenar(vetor);
		
		for(int i=0; i< vetor.length; i++) {
			System.out.println(vetor[i]);
		}

	}

}

package view;

import controller.MergeSortController;

public class Principal {

	public static void main(String[] args) {
		int[] vetor = {44,43,42,41,40,39,38};
		MergeSortController merge = new MergeSortController();
		
		merge.ordena(vetor);
		
		for(int i=0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}

}

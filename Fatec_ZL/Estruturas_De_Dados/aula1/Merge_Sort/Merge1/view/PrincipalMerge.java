package view;

/*
   b) O teste de mesa para a aplicação de ordenação por Merge Sort, detalhando as divisões e as
   operações com os vetores auxiliares;
*/

import controller.MergeSortController;

public class PrincipalMerge {
  public static void main(String[] args){
	int[] vetor = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
	MergeSortController merge = new MergeSortController();
	merge.ordenar(vetor);

	for(int i=0; i < vetor.length; i++){
		System.out.println(vetor[i]);
	}
   }
}
	


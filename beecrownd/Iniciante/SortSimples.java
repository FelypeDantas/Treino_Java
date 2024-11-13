package beecrownd;

import java.util.Scanner;

public class SortSimples {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		String linhaUnica = sca.nextLine();
		Scanner linha = new Scanner(linhaUnica);
		
		int array[] = new int[3];
		int aux = 0;
		int arrayNovo[] = new int[3];
		
		for(int i=0; i < 3; i++) {
			array[i] = linha.nextInt();
			arrayNovo[i] = array[i];
		}
		
		for(int i = 0; i <= 2; i++) {
			for(int j = (i+1); j < 3; j++) {
				if(array[j] < array[i]) {
					aux = array[j];
					array[j] = array[i];
					array[i] = aux;
				}
			}
		}
		
		for(int i=0; i < 3; i++) {
			System.out.println(array[i]);
		}
		
		System.out.print("\n");
		for(int i=0; i < 3; i++) {
			System.out.println(arrayNovo[i]);
		}
		
		sca.close();
		linha.close();
	}

}

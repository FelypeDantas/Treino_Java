package main;

import java.util.Scanner;

public class pivo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String linhaUnica = scanner.nextLine();
		Scanner linha = new Scanner(linhaUnica);
		
		int vet[] = new int[3];
		int aux;
		
		for(int i = 0; i < 3; i++) {
			vet[i] = linha.nextInt();
		}
		
		for(int i=0; i < vet.length - 1; i++) {
			for(int j=(i+1); j < vet.length; j++) {
				if(vet[i] > vet[j]) {
					aux = vet[i];
					vet[i] = vet[j];
					vet[j] = aux;
				}
			}
		}
		
		System.out.println(vet[1]);
		linha.close();
		scanner.close();
	}

}

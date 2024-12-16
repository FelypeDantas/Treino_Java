package view;

import javax.swing.JOptionPane;

import controller.ThreadVetor;

public class Main {

	public static void main(String[] args) {
		
		int valorNumerico = 0;
		int vetor[] = new int[valorNumerico];
		
		valorNumerico = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho do vetor"));
		valorNumerico--;
		
		for(int i=0; i<5; i++) {
			ThreadVetor vet = new ThreadVetor(valorNumerico, vetor);
			vet.start();
		}
	}

}

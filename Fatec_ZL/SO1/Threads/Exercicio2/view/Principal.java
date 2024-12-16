package view;

import controller.Exercicio2;

public class Principal {

	public static void main(String[] args) {
		
		int mat[][] = new int [3][5];
		
	   for(int x= 0; x<3; x++) {
		   for(int y=0; y<5; y++) {
			   Exercicio2 exerc2 = new Exercicio2(mat);
			   exerc2.start();
		   }
	   }

	}

}

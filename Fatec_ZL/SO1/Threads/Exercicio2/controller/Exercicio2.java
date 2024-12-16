package controller;

public class Exercicio2 extends Thread {
	
	private int mat[][]=new int [3][5];

	public Exercicio2(int mat[][]) {
		this.mat = mat;
	}
	
	public void run() {
		
		int y;
	
		int vet[] = new int[5];
		for(int x=0; x<5; x++) {
			for(y=0; y<3; y++) {
				mat[y][x]= (int) Math.random()*100;
				if(y == 3) {
					mat[y][x] = (x-1) + (x-2);
				}
			}
			
			System.out.println(mat[y][x] +" + "+ mat[y+1][x] + " = " + vet[x]);
		}
		
	}
}

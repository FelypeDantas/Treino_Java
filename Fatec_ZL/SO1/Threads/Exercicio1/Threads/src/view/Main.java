package view;

import controller.Exercicio1;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		
		for(int i=0; i<5; i++) {
			Exercicio1 exerc = new Exercicio1();
			exerc.start();
			Thread.sleep(1000 * i);
		}
	}

}

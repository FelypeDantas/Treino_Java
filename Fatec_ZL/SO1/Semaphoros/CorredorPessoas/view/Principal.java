package view;

import java.util.concurrent.Semaphore;

import controller.Exercicio2;

public class Principal {
	
	public static void main(String[] args) {
		Semaphore semaforo = new Semaphore(4);
		
		
		for(int i=0; i<4; i++) {
			Thread ex = new Exercicio2(i, semaforo);
			ex.start();
		}
	}

}

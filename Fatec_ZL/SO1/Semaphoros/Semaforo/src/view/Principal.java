package view;

import java.util.concurrent.Semaphore;

import controller.Exercicio1;

public class Principal {

	public static void main(String[] args) {
		Semaphore semaforo = new Semaphore(3);
		boolean tocha = true;
		boolean pedra = true;
		
		for(int i=1; i<=4; i++) {
			Thread ex = new Exercicio1(i , semaforo, tocha , pedra);
			ex.start();
		}
		

	}

}

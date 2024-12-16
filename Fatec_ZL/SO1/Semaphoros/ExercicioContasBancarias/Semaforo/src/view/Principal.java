package view;

import java.util.concurrent.Semaphore;

import controller.Controle;

public class Principal {

	public static void main(String[] args) {
		
		Semaphore semaforo = new Semaphore(1);
		Semaphore deposito = new Semaphore(1);
		int codigoConta = 0;
		
		for(int i=1 ; i<=20; i++) {
			Thread ex = new Controle(codigoConta, semaforo, deposito);
			ex.start();
		}

	}

}

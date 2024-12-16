package controller;

import java.util.concurrent.Semaphore;

public class ThreadCar extends Thread{
	
	private int idCarro;
	private static int posChegada;
	private static int posSaida;
	private Semaphore semaforo;
	
	public ThreadCar(int idCarro, Semaphore semaforo) {
		this.idCarro = idCarro;
		this.semaforo = semaforo;
	}
	
	@Override
	public void run() {
		carroAndando();
//		--------- INICIO SEÇÃO CRITICA -----------------
		try {
			semaforo.acquire();
			carroEstacionado();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			semaforo.release();
//		--------- FIM SEÇÃO CRITICA --------------------
			carroSaindo();
		}
	}

	private void carroSaindo() {
		posSaida++;
		System.out.println("#" +idCarro + "foi o " + posSaida + "- a sair!");
	}

	private void carroEstacionado() {
		System.out.println("#" + idCarro + " estacionou");
		int tempo = (int) ((Math.random() * 2001) + 1000);
		try {
			sleep(tempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

	private void carroAndando() {
		int distanciaTotal = (int) ((Math.random()* 1001) + 1000);
		int distanciaPercorrida = 0;
		int deslocamento = 100;
		int tempo = 1000;
		
		while(distanciaPercorrida < distanciaTotal) {
			distanciaPercorrida += deslocamento;
			try {
				sleep(tempo);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("#" + idCarro + " já andou " + distanciaPercorrida + "m.");
		}
		posChegada++;
		System.out.println("#" + idCarro + " foi o " + posChegada + "- a chegar!");
	}

}

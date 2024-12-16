package controller;

import java.util.concurrent.Semaphore;

public class Exercicio2 extends Thread{
	
	private int id = 0;
	private Semaphore semaforo;
	
	public Exercicio2(int id, Semaphore semaforo) {
		this.id = id;
		this.semaforo = semaforo;
	}
	
	@Override
	public void run() {
		try {
			comportamento();
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());;
		}
	}

	private void comportamento() throws InterruptedException {
		int distancia = 0;
		int movimento;
		String[] nomes = { "João", "Fernanda", "Ricardo", "Diego"};
		
		System.out.println("# " + getId() +" "+ nomes[id] + " Começou a andar! ");
		
		while(distancia < 200) {
			try {
				
				movimento = (int) (Math.random() * (6-4)+4);
				distancia = distancia + movimento;
				sleep(5);
				
			}catch(InterruptedException e) {
				System.err.println(e.getMessage());
				
			}finally {
				semaforo.release();
			}
			
			System.out.println("# " + getId() +" "+ nomes[id] + " esta a " + distancia + " m");
		}
		
		System.err.println("# " + getId() +" "+ nomes[id] + " chegou na porta e entrou");
		sleep(2);
		
	}

}

package controller;

import java.util.concurrent.Semaphore;

import javax.swing.JOptionPane;

public class Exercicio1 extends Thread{

	private int id=0;
	private Semaphore semaforo;
	private static boolean  pedra = true;
	private static boolean tocha = true;
	
	public Exercicio1(int id, Semaphore semaforo, boolean tocha, boolean pedra) {
		this.semaforo = semaforo;
		this.id = id;
		Exercicio1.tocha = tocha;
		Exercicio1.pedra = pedra;
	}
	
	@Override
	public void run() {
		int op = 0;
		
		while(op != 9) {
			
			op = Integer.parseInt(JOptionPane.showInputDialog("Escolha: \n 1 - Corrida \n 2 - portas \n 9 - Finaliza!"));
			
			switch(op) {
			case 1: comportamento();
			break;
			case 2: portas();
			break;
			case 9: JOptionPane.showMessageDialog(null, "Fim do programa! ");
			break;
			default: JOptionPane.showMessageDialog(null, "Número Inválido! ");
			}
		}
		
	}

	

	private void portas() {
		boolean porta[] = {false, false, false, false};
		
		int valor = Integer.parseInt(JOptionPane.showInputDialog("Informe um número menor do que 4 (<4): "));
		
		while(valor >= 4) {
			JOptionPane.showMessageDialog(null, "Número inválido, informe outro! ");
			valor = Integer.parseInt(JOptionPane.showInputDialog("Informe um número menor do que 4 (<4): "));
		}
		
		for(int i=0; i < 4; i++) {
			if(i == valor) {
				porta[i] = true;
			}
			else {
				porta[i] = false;
			}
		}
		
		for(int i=0; i < 4; i++) {
			if(porta[i] == true) {
				System.out.println("# " + getId() + " Cavalheiro " + id + " se salvou!");
				id++;
			}
			else {
				System.err.println("# " + getId() + " Cavalheiro " + id + " foi devorado!");
				id++;
			}
		}
	}

	private void comportamento() {
		int distancia = 0;
		int movimentacao;
		
		System.out.println("# " + getId() + " Cavalheiro " + id + " Começou a correr!");
		
		while(distancia <= 2000) {
			try {
				movimentacao = (int) (Math.random()*(4-2)+2);
				
				if(distancia >= 500 && tocha == true) {
					tocha = false;
					System.err.println("# " + getId() + " Cavalheiro " + id + " Pegou a tocha!");
					distancia += 2.0;
				}
				else if(distancia >=1500 && pedra == true) {
					pedra = false;
					System.err.println("# " + getId() + " Cavalheiro " + id + " Pegou a Pedra!");
					distancia += 2.0;
				}
				
				distancia = distancia + movimentacao;
				sleep(50);
			}catch(InterruptedException e) {
				System.err.println(e.getMessage());
			}finally {
				semaforo.release();
			}
			System.out.println("# " + getId() + " Cavalheiro " + id + " , esta a " + distancia + " m ");
//			System.out.println("# " + getId() + " Cavalheiro" + id + " , chegou as portas!");
		}
		System.out.println("# " + getId() + " Cavalheiro " + id + " , chegou as portas!");
	}
}

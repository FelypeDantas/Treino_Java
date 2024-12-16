package controller;

import java.util.concurrent.Semaphore;

//3) Um banco deve controlar Saques e Depósitos.
//O sistema pode permitir um Saque e um Depósito
//Simultâneos, mas nunca 2 Saques ou 2 Depósitos
//Simultâneos. Para calcular a transação (Saque ou
//Depósito), o método deve receber o código da conta, o
//saldo da conta e o valor a ser transacionado. Deve-se
//montar um sistema que considera 20 transações
//simultâneas enviadas ao sistema (aleatoriamente,
//essas transações podem ser qualquer uma das
//opções) e tratar todas as transações.

public class Controle extends Thread {
	
	private int codigoConta;
	private Semaphore semaforo;
	private Semaphore deposito;
	
	public Controle(int codigoConta, Semaphore semaforo, Semaphore deposito) {
		this.codigoConta = codigoConta;
		this.semaforo = semaforo;
		this.deposito = deposito;
	}
	
	public void run() {
		comportamento();
	}

	private void comportamento() {
		double saldoConta = (double) Math.random() * 10001;
		double valorTransacional = (double) Math.random() * (saldoConta) + 1;
		int tipoTransacao = (int) Math.random()*2 +1;
		codigoConta = (int) (Math.random() * 10001) + 1;
		
		if(tipoTransacao == 1) {
			try {
				semaforo.acquire(1);
				saque(codigoConta, saldoConta, valorTransacional);
				
			}catch(Exception e) {
				System.err.println(e.getMessage());
				
			}finally {
				semaforo.release(1);
			}
		}
		else {
			try {
				deposito.acquire(1);
				depositos(codigoConta, saldoConta, valorTransacional);
				
			}catch(Exception e) {
				System.err.println(e.getMessage());
			}
		}
		
	}

	private void depositos(int codigoConta2, double saldoConta, double valorTransacional) {
		System.out.println("# " + getId() + " , conta: " + codigoConta + " , fez um deposito \n valor atual R$ " + saldoConta + " \n valor do saque: " + valorTransacional + "\n **********************************************************************");
		try {
			sleep(2000);
			
		}catch(Exception e) {
			System.err.println(e.getMessage());
			
		}
		
	}

	private void saque(int codigoConta, double saldoConta, double valorTransacional) {
		System.err.println("# " + getId() + " , conta: " + codigoConta + " , fez um saque \n valor atual R$ " + saldoConta + " \n valor do saque: " + valorTransacional + "\n **********************************************************************");
		try {
			sleep(2000);
			
		}catch(Exception e) {
			System.err.println(e.getMessage());
			
		}
		
	}

}

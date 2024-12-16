package controller;

public class ThreadVetor extends Thread{
	
	private int valorNumerico;
	private int vetor[] = new int[valorNumerico];
	
	public ThreadVetor(int valorNumerico, int[] vetor) {
		this.valorNumerico = valorNumerico;
		this.vetor = vetor;
	}
	
	@Override
	public void run() {
		if(valorNumerico % 2 == 0) {
			for(int i=0; i<vetor.length; i++) {
				vetor[i] = (int) (Math.random()*10) + 1;
			}
			for(int i=0; i<vetor.length; i++) {
				System.out.println("Valor guardado: " + vetor[i]);
			}
			System.out.println("resultados de vetor de tamanho par: \n");
			concatenaString();
			concatenaBuffer();
			
		}
		else {
			for(int valor: vetor) {
				System.out.println(vetor[valor]);
			}
			System.out.println("resultados de vetor de tamanho impar: \n");
			concatenaString();
			concatenaBuffer();
		}
	}
	
	public void concatenaString() {
		String cadeia = "";
		double tempoInicial = System.nanoTime();
		for(int i=0; i < 1000; i++) {
			cadeia = cadeia + 0;
		}
		
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal / Math.pow(10, 9);
		System.out.println("String ==> " + tempoTotal + "s.");
	}
	
	public void concatenaBuffer() {
		StringBuffer buffer = new StringBuffer();
		double tempoInicial = System.nanoTime();
		for(int i=0; i < 1000; i++) {
			buffer.append("0");
		}
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal / Math.pow(10, 9);
		System.out.println("Buffer ==> " + tempoTotal + "s.");
	}

}

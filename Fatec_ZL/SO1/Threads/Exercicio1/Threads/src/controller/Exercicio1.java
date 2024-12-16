package controller;

public class Exercicio1 extends Thread{

	public Exercicio1() {
		super();
	}
	
	public void run() {
		int id = (int) getId();
		System.out.println("#" + id + "==> Manda mais");
	}
}

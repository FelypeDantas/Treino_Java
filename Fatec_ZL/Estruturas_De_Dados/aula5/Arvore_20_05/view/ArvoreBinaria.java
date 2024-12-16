package view;

import controller.ArvoreBinariaController;

public class ArvoreBinaria {

	public static void main(String[] args) {
		try {
			
			ArvoreBinariaController obj = new ArvoreBinariaController();
			System.out.println(obj.teste());
			
		} catch(Exception e) {
			System.err.printf("deu ruim");
			e.printStackTrace();
		}

	}

}

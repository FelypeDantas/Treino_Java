package view;

import controller.ArquivoController;

public class Principal {

	public static void main(String[] args) {
		ArquivoController imp = new ArquivoController();
		imp.procurar("C:\\Users\\", ".txt");

	}

}

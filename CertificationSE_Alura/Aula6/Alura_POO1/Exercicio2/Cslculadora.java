package Exercicio2;

import javax.swing.JOptionPane;

public class Cslculadora {

	public static void main(String[] args) {
		int valor;
		
		valor = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor: "));
		
		System.out.println(dobro(valor));

	}

	private static int dobro(int valor) {
		return valor * 2;
	}

}

package estudando_ed;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		int valor;
		valor = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor"));
		System.out.println(fatorial(valor));

	}

	private static int fatorial(int valor) {
		if(valor <= 1) {
			return 1;
			
		} else {
			return valor * fatorial(valor - 1);
		}
		
	}

}

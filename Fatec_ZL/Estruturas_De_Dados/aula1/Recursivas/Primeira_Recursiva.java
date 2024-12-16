package estudando_ed;

import javax.swing.JOptionPane;

public class Primeira_Recursiva {
	
	public static void main(String[] args) {
		int numero;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do número"));
		imprima(numero);
	}

	private static int imprima(int numero) {
		if(numero > 7) {
			return 0;
		}
		
		System.out.println(numero);
		numero = numero + 1;
		imprima(numero);
		return numero;
	}

}

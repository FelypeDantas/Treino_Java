package estudando_ed;

import javax.swing.JOptionPane;

public class Calculos {

	public static void main(String[] args) {
		int base, expoente;
		
		base = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor da base: "));
		expoente =  Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do expoente: "));
		System.out.println(potencia(base, expoente));

	}

	private static int potencia(int base, int expoente) {
		if(expoente == 0) {
			return 1;
			
		} else {
			return base * potencia(base, expoente - 1);
		}
	}

}

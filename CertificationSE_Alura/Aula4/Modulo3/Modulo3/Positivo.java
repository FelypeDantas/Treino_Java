package Modulo3;

import javax.swing.JOptionPane;

public class Positivo {

	public static void main(String[] args) {
		int valor;
		
		valor = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor: "));
		
		if(valor > 0) {
			
			System.out.println("o número " + valor + " é positivo!");
			
		} else if(valor < 0) {
			
			System.out.println("valor é negativo");
			
		}else {
			System.out.println("Valor é nulo! ");
		}

	}

}

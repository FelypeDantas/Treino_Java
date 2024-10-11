package Modulo2;

import javax.swing.JOptionPane;

//Crie um programa que realize a média de duas notas decimais e exiba o resultado.
public class MediaSimples {

	public static void main(String[] args) {
		int n1, n2;
		
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Informe a primeira nota: "));
		
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Informe a segunda nota: "));
		
		double media = (n1 + n2)/2;
		
		System.out.println("a média é de: " + media);

	}

}

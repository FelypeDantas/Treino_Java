package ExerciciosSatoshi;

import javax.swing.JOptionPane;
public class Exercicio3 {
   public static void main (String args []) {
	   // Variáveis
	   double N;
	   
	   //Entrada de dados
	   N = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor: "));
	   
	   //Saída de dados
	   System.out.println(Serie3(N));
   }

 //função recursiva
private static double Serie3(double n) {
	if(n <= 0) {
		return 0;
	}
	return 1/n + Serie3(n -1);
}
}

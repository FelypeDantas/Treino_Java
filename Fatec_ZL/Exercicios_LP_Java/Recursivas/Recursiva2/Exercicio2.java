package ExerciciosSatoshi;

import javax.swing.JOptionPane;
public class Exercicio2 {
  public static void main(String args[]) {
     int N;
     N = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor: "));
     System.out.println(Serie2(N));
  }

private static int Serie2(int n) {
	if(n < 1) {
		return 1;
	}
	return n + Serie2(n - 1);
}
}
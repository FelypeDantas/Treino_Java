import javax.swing.JOptionPane;

public class Exercicio1 {
   public static void main (String args []) {
	   
	   int area, lado;
	   
	   lado = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do lado: "));
	   
	   area = lado * lado;
	   
	   System.out.println("O valor do quadrado é: " + area);
   }
}

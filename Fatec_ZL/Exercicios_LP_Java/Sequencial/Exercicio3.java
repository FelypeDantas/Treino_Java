import javax.swing.JOptionPane;

public class Exercicio3 {
  public static void main(String args[]) {
	  double area, base, altura;
	  
	  base = Double.parseDouble(JOptionPane.showInputDialog("Informe a base do triângulo: "));
	  altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura do triângulo: "));
	  
	  area = (base * altura) /2;
	  
	  System.out.println("a área do triangulo é de: " + area);
  }
}

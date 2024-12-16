import javax.swing.JOptionPane;
public class Recursividade5 {
  public static void main(String args[]) {
	     
	          int ultimo, retorno;

	         ultimo = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de N: "));

	          retorno = somaSerie(ultimo);
	          System.out.println("\nSoma da série (1! >>> " + ultimo + "!) = " + retorno);
	      }

	      static int somaSerie(int numero) {
	          if (numero > 1) {
	              return fatorial(numero) + somaSerie(--numero);
	          } else {
	              return 1;
	          }
	      }

	      static int fatorial(int numero) {
	          if (numero != 1) {
	              return numero * fatorial(--numero);
	          } else {
	              return 1;
	          }
	      }
	  }

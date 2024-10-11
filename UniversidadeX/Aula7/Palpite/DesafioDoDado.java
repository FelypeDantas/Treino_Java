package Palpite;

import java.util.Random;

import javax.swing.JOptionPane;
public class DesafioDoDado {
   public static void main(String[] args) {
	   int palpite, dado;
	   
	   palpite = Integer.parseInt(JOptionPane.showInputDialog("Informe qual é o seu palpite (de 0 a 6)"));
	   
	   Random gerador = new Random();
	   
	   dado = gerador.nextInt(6);
	   
	   if(dado == palpite) {
		   System.out.println("Você Acertou!");
		   System.out.println("Dado = " + dado);
		   System.out.println("O seu palpite foi: " + palpite);
	   }
	   else {
		   System.out.println("Você Errou!");
		   System.out.println("Dado = " + dado);
		   System.out.println("O seu palpite foi: " + palpite); 
	   }
   }
}

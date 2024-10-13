package Criando_objetos;

public class MatematicaTeste {
   public static void main(String args[]) {
	   
	   Matematica m = new Matematica();
	   int maior = m.maior(20, 30);
	   System.out.println(maior);
	   
	   double som = m.soma(50, 60);
	   System.out.println(som);
   }
}

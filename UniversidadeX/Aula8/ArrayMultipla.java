package Arrays;

import java.util.Random;

public class ArrayMultipla {
  public static void main(String args[]) {
	  
	  String [] faces = {"A", "Rei", "2" , "3", "4", "5", "6", "7", "8", "9", "Valete"};
	  String[] nipes = {"Espadas", "Paus", "Copas" , "Ouros"};
	  
	  Random r = new Random();
	  
	  String indiceFace = faces[r.nextInt(faces.length)];
	  String nipe = nipes[r.nextInt(nipes.length)];
	  
	  System.out.println(indiceFace + " " + nipe);
	  
	  
  }
}

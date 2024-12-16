import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class teclado {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		int N = scn.nextInt();
		
		List<String> resultados = new ArrayList<String>();
		
		for(int i = 0; i < N; i++) {
			resultados.add(telefone(scn.next()));
		}
		scn.close();
		
		for(String resultado : resultados) {
			System.out.println(resultado);
		}
	}
	
	
	public static String telefone(String entrada) {
		String resultado = "";
		
		for(int i = 0; i < entrada.length(); i++) {
			
			if("ABC".contains(entrada.substring(i, i+1))) {
				//System.out.print("2");
				resultado += "2";
			}
			else if("DEF".contains(entrada.substring(i, i+1))){
				//System.out.print("3");
				resultado += "3";
			}
			else if("GHI".contains(entrada.substring(i, i+1))){
				//System.out.print("4");
				resultado += "4";
			}
			else if("JKL".contains(entrada.substring(i, i+1))){
				//System.out.print("5");
				resultado += "5";
			}
			else if("MNO".contains(entrada.substring(i, i+1))){
				//System.out.print("6");
				resultado += "6";
			}
			else if("PQRS".contains(entrada.substring(i, i+1))){
				//System.out.print("7");
				resultado += "7";
			}
			else if("TUV".contains(entrada.substring(i, i+1))){
				//System.out.print("8");
				resultado += "8";
			}
			else if("WXYZ".contains(entrada.substring(i, i+1))){
				//System.out.print("9");
				resultado += "9";
			}
		}
		
		return resultado;
		
	}
	

}

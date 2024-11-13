package iniciante;

import java.util.Scanner;

public class IdadeDias {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int idadeEmDias = scanner.nextInt();
		
		int ano = idadeEmDias / 365;
		int meses = (idadeEmDias % 365) / 30;
        int dias = (idadeEmDias % 365) % 30;
        
        System.out.println(ano + " ano(s)\n"+meses+" mes(es)\n"+dias+" dia(s)");
        scanner.close();

	}

}

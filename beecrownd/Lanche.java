import java.util.Scanner;

public class Lanche {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String linhaUnica = scanner.nextLine();
		Scanner linha = new Scanner(linhaUnica);
		
		int ID = linha.nextInt();
		int quantidade = linha.nextInt();
		double soma = 0;
		
		if(ID == 1) {
			soma = quantidade * 4.00;
			System.out.printf("Total: R$ %.2f\n",soma);
		}
		else if(ID == 2) {
			soma = quantidade * 4.50;
			System.out.printf("Total: R$ %.2f\n",soma);
		}
		else if(ID == 3) {
			soma = quantidade * 5.00;
			System.out.printf("Total: R$ %.2f\n",soma);
		}
		else if(ID == 4) {
			soma = quantidade * 2.00;
			System.out.printf("Total: R$ %.2f\n",soma);
		}
		else if(ID == 5) {
			soma = quantidade * 1.50;
			System.out.printf("Total: R$ %.2f\n" ,soma);
		}
		
		scanner.close();
		linha.close();

	}

}

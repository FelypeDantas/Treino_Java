import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String textoMaiusculo = null;
		char letra = 0;
		Dinossauro speek = new Dinossauro();
		Scanner scan = new Scanner(System.in); 
		
		while(letra != 'F') {
			
			System.out.println("(P)ular           (C)orrer               Co(M)er\r\n"
					+ "C(A)ntar        Tomar (S)ol          Ficar na S(O)mbra");
			textoMaiusculo = scan.nextLine().toUpperCase();
			letra = textoMaiusculo.charAt(0);
			
			switch(letra) {
			
			case 'P': speek.pular(speek.energia, speek.velocidade, speek.humor);
			break;
			case 'C': speek.correr(speek.energia, speek.velocidade, speek.humor);
			break;
			case 'M': speek.comer(speek.energia, speek.velocidade, speek.humor);
			break;
			case 'A': speek.cantar(speek.energia, speek.humor);
			break;
			case 'S': speek.tomarSol(speek.temperatura, speek.velocidade, speek.humor);
			break;
			case 'O': speek.ficarNaSombra(speek.energia, speek.humor, speek.temperatura);
			break;
			case 'F': System.out.println("Game Over!");
			break;
			default: System.out.println("Entrada inválida");
			break;
			}
		}
		scan.close();
	}

}

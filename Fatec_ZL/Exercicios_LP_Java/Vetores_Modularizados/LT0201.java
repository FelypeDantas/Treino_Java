import javax.swing.JOptionPane;
public class LT0201 {
 public static void main(String args[]) {
	  int opc = 0;
	  int vetor[] = new int [50];
	  
	while(opc != 9) {
		opc = Integer.parseInt(JOptionPane.showInputDialog("Escolha: \n 1 - Carregar Vetor \n"
				+ " 2 - Média entre 10 e 200 \n 3 - Soma de impares \n 9 - Fim"));
		
		switch(opc) {
		case 1: 
			vetor = CarregarVetor(vetor);
			break;
			
		case 2:
			System.out.println("A média é: " + Mostrarmedia(vetor));
			break;
			
		case 3:
			System.out.println("A soma dos impares é: " + MostrarSoma(vetor));
			break;
			
		case 9: JOptionPane.showMessageDialog(null, "Finalizado");
		     break;
		default: JOptionPane.showMessageDialog(null, "Opção Inválida");
		}
	}
  }

private static int MostrarSoma(int[] vetor) {
	int cta, SomaIm = 0;
	for(cta = 0; cta<50; cta ++) {
		if(vetor[cta] % 2 != 0) {
			SomaIm = SomaIm + vetor[cta];
		}
	}
	return SomaIm;
}

private static double Mostrarmedia(int[] vetor) {
	int cta;
	double media = 0;
	     for(cta = 0; cta < 50; cta++) {
	    	 if(vetor[cta] > 9 & vetor[cta] < 201) {
	    		 media = media + vetor[cta];
	    	 }
	     }
	return media/cta;
}

private static int[] CarregarVetor(int[] vetor) {
	int cta;
	for(cta = 0; cta <50; cta ++) {
		vetor[cta] = Integer.parseInt(JOptionPane.showInputDialog("Insira os Valores"));
	}
	return vetor;
}
}

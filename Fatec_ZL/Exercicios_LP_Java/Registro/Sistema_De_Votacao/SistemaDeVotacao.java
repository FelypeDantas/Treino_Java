import java.io.IOException;

import javax.swing.JOptionPane;
public class SistemaDeVotacao {
  public static void main(String args []) throws IOException {
	 Votacao[] votacao = new Votacao[200];
	 Votacao2021 v = new Votacao2021();
	  int i;
	  
	  for(i=0; i<200; i++) {
		  votacao[i] = new Votacao();
	  }
	  
	  int opc = 0;
	  
	  while(opc != 9) {
		  opc = Integer.parseInt(JOptionPane.showInputDialog("Escolha: \n"
		  		+ " 1 - Carregar seção/ número do eleitor \n 2 - Classificar por seção \n 3 - Gravar Registros \n 4 - Mostrar Indicadores \n 9 - Finalizado"));
		  
		  switch(opc) {
		  
		  case 1: votacao = v.FcadastraVotacao(votacao);
		          break;
		  case 2: votacao = v.FclassificaSecao(votacao);
		          break;
		  case 3: v.FgravaVotacao(votacao);
		          break;
		  case 4: v.MostrarIndicadores(votacao);
		          break;
		  case 9: JOptionPane.showMessageDialog(null, "Finalizado");
		          break;
		  default: JOptionPane.showMessageDialog(null, "Opção Inválida");
		  }
	  }
  }
}

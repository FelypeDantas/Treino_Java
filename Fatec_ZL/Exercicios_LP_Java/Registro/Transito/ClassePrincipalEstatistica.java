package ST;

import ST.ClasseMetodos;
import java.io.IOException;
import javax.swing.JOptionPane;

public class ClassePrincipalEstatistica {
     public static void main (String args []) throws IOException {
	   Estatistica [] estatistica = new Estatistica[10];
	   ClasseMetodos m = new ClasseMetodos();
	   
	   int i;
	   
	   for(i=0; i<10; i++) {
		   estatistica[i]= new Estatistica();
	   }
	   
	   int opc = 0;
	   
	   while(opc != 9) {
		   
		   opc = Integer.parseInt(JOptionPane.showInputDialog("Escolha: \n 1 - CADASTRO DE ESTÁTISTICA \n 2 - CONSULTA POR QUANTIDADE DE ACIDENTES \n 3 - CONSULTA POR ESTÁTISTICAS DE ACIDENTES \n 4 - ACIDENTES ACIMA DA MÉDIA DAS 10 CIDADES \n 5 - LEITURA \n 9 - FINALIZA."));
		   
		   switch(opc) {
		   case 1: m.Fcadastra(estatistica);
		           break;
		   case 2: m.FconsultaqtdAcidentes(estatistica);
		           break;
		   case 3: m.FconsultaEstatistica(estatistica);
		           break;
		   case 4: m.AcidentesAcimaDaMedia(estatistica);
		           break;
                   case 5: m.Leitura(estatistica);
                           break;
		   case 9: JOptionPane.showMessageDialog(null, "Finalizado");
		           break;
		   default:JOptionPane.showMessageDialog(null, "Opção Inválida");
		   }
	   }
   }
}

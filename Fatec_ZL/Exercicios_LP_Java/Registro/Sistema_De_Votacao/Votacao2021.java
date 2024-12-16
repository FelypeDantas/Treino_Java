import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

import javax.swing.JOptionPane;

public class Votacao2021 {
    Votacao[] votacao = new Votacao[200];
   
   public Votacao [] FcadastraVotacao (Votacao [] votacao) {
	   int i;	
	   Random gerador = new Random();
	   
	   for(i = 0; i<200; i++) {
		   votacao[i].NumeroSecao = gerador.nextInt(10);
		   votacao[i].NumeroCandidato = gerador.nextInt(300);
	   }
	   return votacao;
   }
   
   public Votacao [] FclassificaSecao (Votacao [] votacao){
	   int i, j, aux;
	   for(i =0 ; i <199; i++) {
		  for(j=(i+1); j<200; j++) {
			  if(votacao[i].NumeroSecao > votacao[j].NumeroSecao) {
				  aux = votacao[i].NumeroSecao ;
		          votacao[i].NumeroSecao = votacao[j].NumeroSecao;
		          votacao[j].NumeroSecao = aux;
			  }
		  }
	   }
	   return votacao;
   }
   
   public Votacao [] FgravaVotacao (Votacao [] votacao) throws IOException {
	   int i;
	   String fileName = "Votação2021.txt";
	   
	   BufferedWriter writer = new BufferedWriter(new FileWriter( fileName ));
	   
		for(i = 0; i<200; i++) {
			   votacao[i] = new Votacao();
		   }

		   for (i = 0 ; i < 200 ; i++)	{
		    writer.write( votacao[i].NumeroSecao); 
		    writer.newLine();		
		    writer.write( votacao[i].NumeroCandidato ); 
		    writer.newLine();
   }
		   writer.close(); 
	       return votacao;
}
   
   public void MostrarIndicadores (Votacao[] votacao) {
	   int opc = 0;
	   
	   while(opc != 9) {
		   
		   opc = Integer.parseInt(JOptionPane.showInputDialog("Escolha:  \n 1 - Número de candidatos por seção"
		   		+ " \n 2 - seção com maior e menor número de eleitores \n 3 - Quantidade de votos por candidato \n 4 - 10 primeiros colocados \n 9 - Finaliza Consulta"));
		   
		   switch(opc) {
		   
		   case 1: QuantidadedeEleitores(votacao);
		           break;
		   case 2: MaioreMenor(votacao);
		           break;
		   case 3: QuantidadeVotospCandidato(votacao);
		           break;
		   case 4: Dezmaisvotados(votacao);
		           break;
		   case 9: JOptionPane.showMessageDialog(null, "Finaliza Consulta");
		   }
	   }
   }

public void Dezmaisvotados(Votacao[] votacao) {
	int i, j, aux; 
	int vt[] = new int [10];
		for(i =0 ; i <199; i++) {
			  for(j=(i+1); j<200; j++) {
				  if(votacao[i].NumeroCandidato < votacao[j].NumeroCandidato) {
					  aux = votacao[i].NumeroCandidato ;
			          votacao[i].NumeroCandidato = votacao[j].NumeroCandidato;
			          votacao[j].NumeroCandidato = aux;
				  }
			  }
		}
    for(i = 0; i < 10; i++) {
    	vt[i] = votacao[i].NumeroCandidato;
    }
	for(i = 0; i<10; i++) {
		System.out.println(vt[i] + "\n");
	}
	System.out.print("*________________________________________________________________________*");
}

public void QuantidadeVotospCandidato(Votacao[] votacao) {
	int i;
	for(i= 0; i<200; i++) {
		System.out.println(" \n O candidato de numero "+ i + " Obteve: " + votacao[i].NumeroCandidato);
	}
	System.out.print("*________________________________________________________________________*");
}

public void MaioreMenor(Votacao[] votacao) {
	int i , menor = 1000, maior = 0;
	
	for(i = 0; i< 10; i++) {
		if(votacao[i].NumeroSecao > maior) {
			maior = votacao[i].NumeroSecao;
		}
		if(votacao[i].NumeroSecao < menor) {
			menor = votacao[i].NumeroSecao;
		}
	}
	System.out.println(" \n O Maior numero de eleitores e: " + maior);
	System.out.println(" \n O Menor numero de eleitores e: " + menor);
	System.out.print("*________________________________________________________________________*");
}

public void QuantidadedeEleitores(Votacao[] votacao) {
	int i;
	
	for(i = 0; i<10; i++) {
		System.out.println(votacao[i].NumeroSecao);
	}
	System.out.print("*________________________________________________________________________*");
}
}

package ST;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class ClasseMetodos {
        
        Estatistica[] estatistica = new Estatistica [10];

        
    public void Fcadastra(Estatistica[] estatistica) throws IOException { 
    String filename = "ArquivoTransito.txt";
    BufferedWriter writer = new BufferedWriter(new FileWriter( filename ));
    int i;
    for(i=0; i<10; i++) {
            
		estatistica[i].codigo = Integer.parseInt(JOptionPane.showInputDialog("Entre com o código da cidade: "));
                writer.write(estatistica[i].codigo);
                writer.newLine();
		estatistica[i].nomec = JOptionPane.showInputDialog("Entre o nome da cidade: ");
                writer.write(estatistica[i].nomec);
                writer.newLine();
		estatistica[i].qtdacidentes = Integer.parseInt(JOptionPane.showInputDialog("Entre com a quantidade de acidentes: "));
                writer.write(estatistica[i].qtdacidentes);
                writer.newLine();
	    }
	}

public void FconsultaqtdAcidentes(Estatistica[] estatistica)throws IOException {
        String filename = "ArquivoTransito.txt";
        BufferedWriter writer = new BufferedWriter(new FileWriter( filename ));
	int i;
	for(i=0; i<10; i++) {
		if(estatistica[i].qtdacidentes >= 100 & estatistica[i].qtdacidentes <= 500) {
			System.out.println(estatistica[i].qtdacidentes);
                        writer.close();
                        System.exit(0);
		}
	}	
}

public void FconsultaEstatistica(Estatistica[] estatistica)throws IOException {
        String filename = "ArquivoTransito.txt";
        BufferedWriter writer = new BufferedWriter(new FileWriter( filename ));
	int i,valor;
	
	valor = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de acidentes: "));
	
	for(i = 0; i<10; i++) {
		if(valor == estatistica[i].qtdacidentes) {
			System.out.println(estatistica[i].qtdacidentes);
                        writer.close();
                        System.exit(0);
		}
	}
}

public void AcidentesAcimaDaMedia(Estatistica[] estatistica) throws IOException {
        String filename = "ArquivoTransito.txt";
        BufferedWriter writer = new BufferedWriter(new FileWriter( filename ));
	int soma = 0, i;
	double media;
	
	for(i = 0; i<10; i++) {
		soma = soma + estatistica[i].qtdacidentes;
	}
	
	media = soma/i;
	
	for(i = 0; i<10; i++) {
		if(media <= estatistica[i].qtdacidentes) {
			System.out.println(estatistica[i].qtdacidentes);
                        writer.close();
                        System.exit(0);
		}
	}
    }

public void Leitura(Estatistica[] estatistica)throws IOException {
      String fileName = "ArquivoTransito.txt";		
      BufferedReader ler = new BufferedReader(new FileReader( fileName ));
      int i;
      
      for(i=0; i<10; i++){
          estatistica[i] = new Estatistica();
      }
        for (i = 0 ; i < 3 ; i++){	
         estatistica[i].codigo =Integer.parseInt(ler.readLine());  	
         estatistica[i].nomec = ler.readLine();	
         estatistica[i].qtdacidentes = Integer.parseInt(ler.readLine());
      
      for (i = 0 ; i < 3; i++) {	
          System.out.println(estatistica[i].codigo + " " + estatistica[i].nomec + " pontos: " + estatistica[i].qtdacidentes);	
       }
     ler.close();	
    System.exit(0);	

   }	
  }
}
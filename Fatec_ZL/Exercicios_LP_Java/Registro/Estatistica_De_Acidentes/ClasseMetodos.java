package RegistroLogico;

import javax.swing.JOptionPane;

public class ClasseMetodos {
  public static void main(String args[]) {
	  Estatistica [] estatistica = new Estatistica[10];
	
   }
  
public void Fcadastra(Estatistica[] estatistica) {
	int i;
	for(i=0; i<10; i++) {
		estatistica[i].codigo = Integer.parseInt(JOptionPane.showInputDialog("Entre com o código da cidade: "));
		estatistica[i].nomec = JOptionPane.showInputDialog("Entre o nome da cidade: ");
		estatistica[i].qtdacidentes = Integer.parseInt(JOptionPane.showInputDialog("Entre com a quantidade de acidentes: "));
	}
	}

public void FconsultaqtdAcidentes(Estatistica[] estatistica) {
	int i;
	for(i=0; i<10; i++) {
		if(estatistica[i].qtdacidentes >= 100 & estatistica[i].qtdacidentes <= 500) {
			System.out.println(estatistica[i].qtdacidentes);
		}
	}	
}

public void FconsultaEstatistica(Estatistica[] estatistica) {
	int i,valor;
	
	valor = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de acidentes: "));
	
	for(i = 0; i<10; i++) {
		if(valor == estatistica[i].qtdacidentes) {
			System.out.println(estatistica[i].qtdacidentes);
		}
	}
}

public void AcidentesAcimaDaMedia(Estatistica[] estatistica) {
	int soma = 0, i;
	double media;
	
	for(i = 0; i<10; i++) {
		soma = soma + estatistica[i].qtdacidentes;
	}
	
	media = soma/i;
	
	for(i = 0; i<10; i++) {
		if(media <= estatistica[i].qtdacidentes) {
			System.out.println(estatistica[i].qtdacidentes);
		}
	}
}	
}

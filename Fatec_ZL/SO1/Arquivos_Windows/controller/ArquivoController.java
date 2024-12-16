package controller;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;

public class ArquivoController implements IArquivoController{
	

	public ArquivoController() {
		super();
	}

	@Override
	public void leDir(String path) throws IOException {
		File dir = new File(path);
		if(dir.exists() && dir.isDirectory()) {
			File[] files = dir.listFiles();
			for(File f : files) {
				if(f.isFile()) {
					System.out.println("    \t" + f.getName());
				} else {
					System.out.println("<DIR>\t " + f.getName());
				}
			}
		} else {
			throw new IOException("Diretório inválido");
		}
		
	}

	@Override
	public void createFile(String path, String nome) throws IOException {
		File dir = new File(path);
		File arq = new File(path, nome + ".txt");
		if(dir.exists() && dir.isDirectory()) {
			boolean existe = false;
			if(arq.exists()) {
				existe = true;
			}
			String conteudo = geraTxt();
			FileWriter fileWrite = new FileWriter(arq, existe);
			PrintWriter print = new PrintWriter(fileWrite);
			print.write(conteudo);
			print.flush();
			print.close();
			fileWrite.close();
		} else {
			throw new IOException("Diretório inválido");
		}
	}

	private String geraTxt() {
		StringBuffer buffer = new StringBuffer();
		String linha = "";
		while(!linha.equalsIgnoreCase("fim")) {
			linha = JOptionPane.showInputDialog(null, "Digite uma frase", "entrada de texto", JOptionPane.INFORMATION_MESSAGE);
			if(!linha.equalsIgnoreCase("fim")) {
				buffer.append(linha + "\n");
			}
		}
		return buffer.toString();
	}

	@Override
	public void readFile(String path, String nome) throws IOException {
		File arq = new File(path, nome);
		if(arq.exists() && arq.isFile()) {
			FileInputStream fluxo = new FileInputStream(arq);
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			String linha = buffer.readLine();
			while(linha != null) {
				System.out.println(linha);
				linha = buffer.readLine();
			}
			buffer.close();
			leitor.close();
			fluxo.close();
		} else {
			throw new IOException("Arquivo inválido");
		}
		
	}

	@Override
	public void openFile(String path, String nome) throws IOException {
		File arq = new File(path, nome);
		if(arq.exists() && arq.isFile()) {
			Desktop desktop = Desktop.getDesktop();
			desktop.open(arq);
		} else {
			throw new IOException("Arquivo inválido");
		}
		
	}
	
	

}

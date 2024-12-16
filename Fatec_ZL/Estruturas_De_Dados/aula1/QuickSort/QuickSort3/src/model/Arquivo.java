package model;

import java.io.*;

public class Arquivo {
	private String path;

	public Arquivo(String path) {
		this.path = path;
	}

	public String[] linhas() throws IOException {
		BufferedReader reader = new BufferedReader( new FileReader(this.path));
		String[] linhas = new String[ totalLinhas() ];
		for(int i=0; i < linhas.length; i++) {
			linhas[i] = reader.readLine();
		}
		return linhas;
	}

	public int totalLinhas() throws IOException {
		BufferedReader reader = new BufferedReader( new FileReader(this.path));
		int linhas = 0;
		while(reader.readLine() != null) linhas++;
		return linhas;
	}
}
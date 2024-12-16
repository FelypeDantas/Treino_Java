package model;

import java.io.*;
import model.Arquivo;

public class Pessoa {
	private String nome;
	private String espaco;
	private String sobrenome;

	public void setSobrenome(String sobrenome){
		this.sobrenome = sobrenome;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public void setEspaco(String espaco){
		this.espaco = espaco;
	}

	public String getNome(){
		return this.nome;
	}

	public String getSobrenome(){
		return this.sobrenome;
	}

	public String getEspaco(){
		return this.espaco;
	}

	public String ToString(){
		return this.nome + "\t" + this.espaco + "\t" + this.sobrenome;
	}

	public static Pessoa[] carregar() throws IOException {
		Arquivo arquivo = new Arquivo("data\\pessoa.csv");
		String[] valores;
		String[] linhas = arquivo.linhas();
		Pessoa[] pessoas = new Pessoa[ linhas.length];
		
		for(int i=0; i < linhas.length; i++){
			valores = linhas[i].split(";");
			pessoas[i] = new Pessoa();
			pessoas[i].setNome( valores[0]);
			pessoas[i].setEspaco(valores[1]);
			pessoas[i].setSobrenome(valores[2]);
		}
		return pessoas;
	}
}
package controller;

import java.io.*;
import model.Pessoa;

public class PessoaController {

	public PessoaController() {
		super();
	}

	public Pessoa[] ordena_nome() throws IOException {
		
		Pessoa[] pessoas = Pessoa.carregar();

		for(int i=0; i < pessoas.length; i++) {
			for(int j = 0; j < pessoas.length - 1; j++){
				if(pessoas[j].getNome().compareTo(pessoas[j + 1].getNome()) > 0) {
					Pessoa aux = pessoas[j];
					pessoas[j] = pessoas[j + 1];
					pessoas[j + 1] = aux;
				}
			}
		}
		return pessoas;
	}
}
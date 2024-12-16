package controller;

import model.estrutura.arvore.ArvoreBinaria;
import model.estrutura.lista.ListaEncadeadaSimples;

public class ArvoreBinariaController {

	public ArvoreBinariaController() {
		super();
	}
	
	public String teste() {
		ArvoreBinaria arvore = new ArvoreBinaria();
		
		arvore.adicionar(46);
		arvore.adicionar(45);
		arvore.adicionar(41);
		arvore.adicionar(40);
		arvore.adicionar(36);
		arvore.adicionar(35);
		arvore.adicionar(31);
		arvore.adicionar(30);
		arvore.adicionar(29);
		arvore.adicionar(28);
		arvore.adicionar(27);
		arvore.adicionar(25);
		arvore.adicionar(24);
		arvore.adicionar(23);
		arvore.adicionar(22);
		
		ListaEncadeadaSimples lista = new ListaEncadeadaSimples();
		
		return lista.toString();
	}
}

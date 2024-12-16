package controller;

import model.estrutura.GrafoLista;

public class GrafoListaController {
	
	public GrafoListaController() {
		super();
	}
	
	public String teste() throws Exception {
		GrafoLista<Integer> g = new GrafoLista<Integer>();
		
		g.add(0, 1);
		g.add(0, 4);
		g.add(1, 2);
		g.add(1, 3);
		g.add(1, 4);
		g.add(2, 3);
		g.add(2, 3);
		g.add(3, 4);
		
		return g.toString();
	}

}

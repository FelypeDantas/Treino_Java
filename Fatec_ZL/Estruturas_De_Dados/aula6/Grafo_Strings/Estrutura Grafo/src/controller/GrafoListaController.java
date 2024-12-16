package controller;

import model.estrutura.GrafoLista;

public class GrafoListaController {

    public GrafoListaController() {
        super();
    }

    public String teste() throws Exception {
        GrafoLista<String> g = new GrafoLista<String>();

        g.add("A", "1");
        g.add("B", "2");
        g.add("C", "3");
        g.add("D", "4");
        g.add("E", "5");
        g.add("F", "6");
        g.add("G", "7");
        g.add("H", "0");

        return g.toString();
    }
}

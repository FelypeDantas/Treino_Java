package Controller;

import model.estrutura.ListaEncadeadaSimples;
import model.estrutura.No;

public class ListaEncadeadaSimplesController {

	public ListaEncadeadaSimplesController(){
		super();
	}

	public String teste() throws Exception {
		
		ListaEncadeadaSimples lista = new ListaEncadeadaSimples();

		lista.append(1);
		lista.append(2);
		lista.append(3);

		lista.remove(2);
		return lista.toString();
	}
}


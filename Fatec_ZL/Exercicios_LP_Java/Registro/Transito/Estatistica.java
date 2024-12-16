package ST;


public class Estatistica {
    int codigo;
	String nomec;
	int qtdacidentes;
	
	//Construtor
	Estatistica(){
		this(0,"",0);
	}

	public Estatistica(int i, String string, int j) {
		codigo = i;
		nomec = string;
		qtdacidentes = j;
	}
}


package QuintoCurso;

public class Desafio14 {
	
    public Desafio14() {
        System.out.println("construtor simples");
    }
    public Desafio14(int i) {
        this();
    }
    public Desafio14(String s) {
        this(s, s);  // não compila, loop
    }
    public Desafio14(String s, String s2) {
        this(s); // não compila, loop
    }

}

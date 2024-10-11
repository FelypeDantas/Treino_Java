package QuintoCurso;

public class Teste {
    void metodo(Object o) {
        System.out.println("object");
    }
    void metodo(String s) {
        System.out.println("string");
    }

    public static void main(String[] args) {
        new Teste().metodo((Object)"string"); // imprime object
    }
}

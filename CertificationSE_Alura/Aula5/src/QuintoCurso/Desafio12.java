package QuintoCurso;

class B{}
class C{}
class D extends B{}
public class Desafio12 {
    static int a(D d, B b) { return 1; }
    static int a(C c, C c1) { return 2; }
    static int a(B b, B b1) { return 3; }
    static int a(Desafio12 a, Desafio12 a1) { return 4; }
    public static void main(String[] args) {
        System.out.println(a(new D(), new D()));
    }
}

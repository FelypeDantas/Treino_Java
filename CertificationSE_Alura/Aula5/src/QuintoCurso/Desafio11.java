package QuintoCurso;

public class A {
}

class B{}
class C{}
class D extends B{}
class Desafio11{
    static int a(D d) { return 1; }
    static int a(C c) { return 2; }
    static int a(B b) { return 3; }
    static int a(Desafio11 a) { return 4; }
    public static void main(String[] args) {
        System.out.println(a(new D()));
    }
}

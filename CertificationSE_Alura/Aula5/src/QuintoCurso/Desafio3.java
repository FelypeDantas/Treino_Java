package QuintoCurso;

public class Desafio3 {

    public static void main(String[] args) {
        System.out.println(a(args.length));
    }
    static int a(int l) {
        if(l<10) return b(l); //A
        else return (int) c(); // B
    }
    static int b(int l) {
        if(l<10) return b(l); // C
        else return (int) c(); // D
    }
    static long c() {
        return 3;
    }
}
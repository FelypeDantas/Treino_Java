package QuintoCurso;

public class Desafio2 {

    public static void main(String[] args) {
        x(args.length);
    }
    static int x(final int l) {
        for(int i=0;i<100;i++) {
            switch(i) {
                case 1:
                    System.out.println(l);
                    if(l==i) return 3;
                case 0:
                    System.out.println(0);
            }
        }
        System.out.println("Fim");
        return -1;
    }
}

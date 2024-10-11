package QuintoCurso;

public class Desafio1 {
	
    public static void main(String[] args) {
        x(args.length);
    }
    static int x(int l) {
        for(int i=0;i<100;i++) {
            switch(i) {
                case 1:
                    System.out.println(l);
                    if(l==i) return i;
                case 0:
                    System.out.println(0);
            }
        }
        System.out.println("Fim");
        return -1;
    }

}

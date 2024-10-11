package SegundoCurso;

public class A {
    public static void main(String[] args) {
        int idade = 0;
        if(args.length > 0) {
            idade = Integer.parseInt(args[0]);
        } else {
            System.err.println("Por favor passe sua idade como primeiro parâmetro");
        }
        System.out.println("Sua idade é " + idade);
    }
}

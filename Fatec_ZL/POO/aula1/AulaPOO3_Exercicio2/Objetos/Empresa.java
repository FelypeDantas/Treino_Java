package Objetos;

public class Empresa {
    String razaoSocial;
    int tempoDeMercado;
    String especialidade;

    public void imprimi(String razaoSocial, int tempoDeMercado, String especialidade){
        System.out.println("Empresa: " + razaoSocial + " | Tempo de atuação no mercado: " + tempoDeMercado + " ano | especiaalista em " + especialidade);
    }
}
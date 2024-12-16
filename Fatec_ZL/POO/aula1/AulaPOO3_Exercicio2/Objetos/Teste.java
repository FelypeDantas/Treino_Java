package Objetos;

public class Teste {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();

        Profissao profissao1 = new Profissao();

        Empresa empresa1 = new Empresa();

        empresa1.razaoSocial = "Rei tech";
        empresa1.especialidade = "Informática";
        empresa1.tempoDeMercado = 1;

        pessoa1.Saudacao("Felype");
        profissao1.imprimi("Desenvolvedor Web", 800, 1);
        empresa1.imprimi("Rei Tech", 1, "Informática");


        
    }
}
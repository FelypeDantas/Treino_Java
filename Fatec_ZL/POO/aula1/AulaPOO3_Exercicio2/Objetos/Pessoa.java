package Objetos;

public class Pessoa extends Profissao{
    String nome;
    int idade;
    String cabelo;

    public void Saudacao(String nome){
        System.out.println("Olá o meu nome é " + nome);
    }
}

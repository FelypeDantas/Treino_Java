package edu.curso;

public class Aluno extends Pessoa{
    String ra;
    Carteirinha carteirinha = new Carteirinha();

    public Aluno(String ra, String nome){
        super();
        this.ra = ra;
        this.nome = nome;
        System.out.println("Instanciando Aluno...");
    }

    public Aluno(String nome){
        this("0000", nome);
    }
}
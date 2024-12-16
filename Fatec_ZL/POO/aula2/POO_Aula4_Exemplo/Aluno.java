package edu.curso;

public class Aluno {
    String ra;
    String nome;
    Carteirinha carteirinha = new Carteirinha();

    public Aluno(String ra, String nome){
        this.ra = ra;
        this.nome = nome;
    }
}
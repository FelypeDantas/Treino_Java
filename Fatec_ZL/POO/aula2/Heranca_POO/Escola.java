package edu.curso;

public class Escola {

    public static void main(String[] args){
        Aluno a1 = new Aluno("1111", "Fabricio Santos");

        Carteirinha c1 = new Carteirinha();
        a1.carteirinha = c1;

        Aluno a2 = new Aluno("Fernando Cartiz");
        a2.carteirinha = c1;

        // agregação todo mundo mexe
        // composição é fechado
    }
}
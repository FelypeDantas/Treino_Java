package edu.curso;

public class Escola {

    public static void main(String[] args){
        Aluno a1 = new Aluno("1111", "Fabricio Santos");
        Aluno a2 = new Aluno("1112", "Sacama Tamole");

        Carteirinha c1 = new Carteirinha();
        a1.carteirinha = c1;
        a2.carteirinha = c1;

        // agregação todo mundo mexe
        // composição é fechado
    }
}
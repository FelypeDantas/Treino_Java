package Exercicio1;

public class Pessoa {
    String cpf;
    String nome;

    public Pessoa(String nome){
        this.nome = nome;
    }

    public void andar(){
        System.out.println(nome + " está andando...");
    }
}
package edu.curso;

import java.time.LocalDate;

public class Pessoa extends Animal{
    String cpf;
    String nome;
    LocalDate nascimento = LocalDate.now();

    public Pessoa(){
        super();
        System.out.println("Instanciando Pessoa");
    }
}

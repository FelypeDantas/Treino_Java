package edu.curso;

import java.util.Date;

class Funcionario {
    long id;
    String nome;
    String matricula;
    Date admissao;
    Date demissao;
    float salario;
    String horario;

    public Funcionario(long id, String nome, String matricula, Date admissao, Date demissao, float salario, String horario) {
        this.id = id;
        this.nome = nome;
        this.matricula = matricula;
        this.admissao = admissao;
        this.demissao = demissao;
        this.salario = salario;
        this.horario = horario;
    }

    public void exibir() {
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Admissão: " + admissao);
        System.out.println("Demissão: " + demissao);
        System.out.println("Salário: " + salario);
        System.out.println("Horário: " + horario);
        System.out.println("---------------------------------");
    }
}
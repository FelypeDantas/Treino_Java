package Gestao_Alunos;
import java.util.Date;

public class Aluno {
    long id;
    Date nascimento;
    String ra;
    String nome;

    @Override
    public String toString() {
        return "ID: " + id + ", Nome: " + nome + ", RA: " + ra + ", Nascimento: " + nascimento;
    }
}


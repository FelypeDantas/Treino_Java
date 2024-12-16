package Objetos;

public class Profissao extends Empresa{
    String nomeProfissao;
    double salario;
    int horasTrabalhadas;

    public void imprimi(String nomeProfissao, double salario, int horasTrabalhadas){
        System.out.println("Emprego: " + nomeProfissao + " | Salário: R$ " + salario + " | Horas Trabalhadas: " + horasTrabalhadas);
    }
}


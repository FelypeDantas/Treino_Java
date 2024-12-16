package edu.curso;

import java.util.Scanner;
import java.util.Date;

class GestaoFuncionarios {
    private int indice = 0;
    private Funcionario[] funcionarios = new Funcionario[50];
    private Scanner scan = new Scanner(System.in);

    public void criar() {
        if (indice >= 50) {
            System.out.println("Limite de funcionários atingido.");
            return;
        }
        System.out.print("ID: ");
        long id = scan.nextLong();
        scan.nextLine();  // Consumir nova linha
        System.out.print("Nome: ");
        String nome = scan.nextLine();
        System.out.print("Matrícula: ");
        String matricula = scan.nextLine();
        System.out.print("Admissão (formato: yyyy-mm-dd): ");
        @SuppressWarnings("deprecation")
        Date admissao = new Date(scan.nextLine()); // Idealmente, você usaria um SimpleDateFormat
        System.out.print("Demissão (formato: yyyy-mm-dd, deixe em branco se não aplicável): ");
        String demissaoStr = scan.nextLine();
        @SuppressWarnings("deprecation")
        Date demissao = demissaoStr.isEmpty() ? null : new Date(demissaoStr);
        System.out.print("Salário: ");
        float salario = scan.nextFloat();
        scan.nextLine();  // Consumir nova linha
        System.out.print("Horário: ");
        String horario = scan.nextLine();

        funcionarios[indice++] = new Funcionario(id, nome, matricula, admissao, demissao, salario, horario);
        System.out.println("Funcionário criado com sucesso!");
    }

    public void exibir() {
        System.out.print("Digite a matrícula do funcionário: ");
        String matricula = scan.nextLine();
        for (Funcionario f : funcionarios) {
            if (f != null && f.matricula.equals(matricula)) {
                f.exibir();
            }
        }
    }

    public void excluir() {
        System.out.print("Digite a matrícula do funcionário a ser removido: ");
        String matricula = scan.nextLine();
        for (int i = 0; i < indice; i++) {
            if (funcionarios[i] != null && funcionarios[i].matricula.equals(matricula)) {
                funcionarios[i] = null;
                System.out.println("Funcionário removido com sucesso!");
                // Opcional: reorganizar o array
                for (int j = i; j < indice - 1; j++) {
                    funcionarios[j] = funcionarios[j + 1];
                }
                funcionarios[--indice] = null; // Reduzir o índice
                return;
            }
        }
        System.out.println("Funcionário não encontrado.");
    }

    @SuppressWarnings("deprecation")
    public void atualizar() {
        System.out.print("Digite a matrícula do funcionário a ser atualizado: ");
        String matricula = scan.nextLine();
        for (int i = 0; i < indice; i++) {
            if (funcionarios[i] != null && funcionarios[i].matricula.equals(matricula)) {
                System.out.print("Novo Nome: ");
                funcionarios[i].nome = scan.nextLine();
                System.out.print("Nova Admissão (formato: yyyy-mm-dd): ");
                funcionarios[i].admissao = new Date(scan.nextLine());
                System.out.print("Nova Demissão (formato: yyyy-mm-dd, deixe em branco se não aplicável): ");
                String demissaoStr = scan.nextLine();
                funcionarios[i].demissao = demissaoStr.isEmpty() ? null : new Date(demissaoStr);
                System.out.print("Novo Salário: ");
                funcionarios[i].salario = scan.nextFloat();
                scan.nextLine();  // Consumir nova linha
                System.out.print("Novo Horário: ");
                funcionarios[i].horario = scan.nextLine();
                System.out.println("Funcionário atualizado com sucesso!");
                return;
            }
        }
        System.out.println("Funcionário não encontrado.");
    }

    public void menu() {
        while (true) {
            System.out.println("Menu:");
            System.out.println("(C)riar");
            System.out.println("(E)xibir");
            System.out.println("(R)emover");
            System.out.println("(A)tualizar");
            System.out.println("(S)air");
            System.out.print("Escolha uma opção: ");
            String textoMaiusculo = scan.nextLine().toUpperCase();
            char letra = textoMaiusculo.charAt(0);

            switch (letra) {
                case 'C':
                    criar();
                    break;
                case 'E':
                    exibir();
                    break;
                case 'R':
                    excluir();
                    break;
                case 'A':
                    atualizar();
                    break;
                case 'S':
                    System.exit(0);
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    public static void main(String[] args) {
        GestaoFuncionarios gestao = new GestaoFuncionarios();
        gestao.menu();
    }
}


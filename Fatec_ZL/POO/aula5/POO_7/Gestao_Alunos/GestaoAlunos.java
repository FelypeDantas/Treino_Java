package Gestao_Alunos;
import java.util.Date;
import java.util.Scanner;

class GestaoAlunos {
    private int indice = 0;
    public Aluno[] alunos = new Aluno[50];
    private Scanner scan = new Scanner(System.in);

    public void criar() {
        if (indice < 50) {
            Aluno aluno = new Aluno();
            System.out.print("Digite o ID do aluno: ");
            aluno.id = scan.nextLong();
            scan.nextLine(); 
            System.out.print("Digite o RA do aluno: ");
            aluno.ra = scan.nextLine();
            System.out.print("Digite o nome do aluno: ");
            aluno.nome = scan.nextLine();
            System.out.print("Digite a data de nascimento (dd/MM/yyyy): ");
            String data = scan.nextLine();
            aluno.nascimento = new Date();

            alunos[indice] = aluno;
            indice++;
            System.out.println("Aluno cadastrado com sucesso!");
        } else {
            System.out.println("Limite de alunos atingido.");
        }
    }

    public void exibir() {
        System.out.print("Digite o RA do aluno que deseja exibir: ");
        String ra = scan.nextLine();
        for (Aluno aluno : alunos) {
            if (aluno != null && aluno.ra.equals(ra)) {
                System.out.println(aluno);
                return;
            }
        }
        System.out.println("Aluno não encontrado.");
    }

    public void excluir() {
        System.out.print("Digite o RA do aluno que deseja remover: ");
        String ra = scan.nextLine();
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] != null && alunos[i].ra.equals(ra)) {
                alunos[i] = null; // Remove o aluno
                System.out.println("Aluno removido com sucesso.");
                return;
            }
        }
        System.out.println("Aluno não encontrado.");
    }

    public void atualizar() {
        System.out.print("Digite o RA do aluno que deseja atualizar: ");
        String ra = scan.nextLine();
        for (Aluno aluno : alunos) {
            if (aluno != null && aluno.ra.equals(ra)) {
                System.out.print("Digite o novo nome do aluno: ");
                aluno.nome = scan.nextLine();
                System.out.print("Digite a nova data de nascimento (dd/MM/yyyy): ");
                String data = scan.nextLine();
                aluno.nascimento = new Date();
                System.out.println("Aluno atualizado com sucesso.");
                return;
            }
        }
        System.out.println("Aluno não encontrado.");
    }

    public void menu() {
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("(C)riar  (E)xibir  (R)emover  (A)tualizar  (S)air");
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
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    public static void main(String[] args) {
        GestaoAlunos gestao = new GestaoAlunos();
        gestao.menu();
    }
}


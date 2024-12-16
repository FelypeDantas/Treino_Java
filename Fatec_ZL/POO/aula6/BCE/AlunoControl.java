import java.util.ArrayList;
import java.util.List;

public class AlunoControl {
    private List<Aluno> alunos = new ArrayList<>();
    private int proximoId = 1;

    // Criar aluno
    public Aluno criarAluno(String nome, int idade) {
        Aluno aluno = new Aluno(proximoId++, nome, idade);
        alunos.add(aluno);
        return aluno;
    }

    // Ler aluno
    public Aluno lerAluno(int id) {
        return alunos.stream()
                .filter(aluno -> aluno.getId() == id)
                .findFirst()
                .orElse(null);
    }

    // Atualizar aluno
    public Aluno atualizarAluno(int id, String nome, int idade) {
        Aluno aluno = lerAluno(id);
        if (aluno != null) {
            aluno.setNome(nome);
            aluno.setIdade(idade);
        }
        return aluno;
    }

    // Deletar aluno
    public boolean deletarAluno(int id) {
        return alunos.removeIf(aluno -> aluno.getId() == id);
    }

    // Listar alunos
    public List<Aluno> listarAlunos() {
        return new ArrayList<>(alunos);
    }
}

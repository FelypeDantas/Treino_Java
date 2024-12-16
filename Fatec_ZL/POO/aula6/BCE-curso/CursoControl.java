import java.util.ArrayList;
import java.util.List;

public class CursoControl {
    private List<Curso> cursos = new ArrayList<>();
    private int proximoId = 1;

    public void gravar(Curso curso) {
        curso.setId(proximoId++);
        cursos.add(curso);
    }

    public Curso pesquisar(String parteNome) {
        return cursos.stream()
                .filter(curso -> curso.getNome().toLowerCase().contains(parteNome.toLowerCase()))
                .findFirst()
                .orElse(null);
    }

    public List<Curso> listarCursos() {
        return new ArrayList<>(cursos);
    }
}


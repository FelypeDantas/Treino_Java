package pacientes;

import java.util.List;

public interface PacienteDAO {
    void inserir(Paciente p) throws PacienteException;

    void atualizar(Paciente p) throws PacienteException;

    void remover(Paciente p) throws PacienteException;

    List<Paciente> pesquisarPorNome(String nome) throws PacienteException;

    List<Paciente> pesquisarTodos() throws PacienteException;
}

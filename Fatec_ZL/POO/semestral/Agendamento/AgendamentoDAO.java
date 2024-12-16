import java.util.List;

public interface AgendamentoDAO {
    void inserir(Agendamento a) throws AgendamentoException;

    void atualizar(Agendamento a) throws AgendamentoException;

    void remover(Agendamento a) throws AgendamentoException;

    List<Agendamento> pesquisarPorCPF(String cpf) throws AgendamentoException;

    List<Agendamento> pesquisarTodos() throws AgendamentoException;
}

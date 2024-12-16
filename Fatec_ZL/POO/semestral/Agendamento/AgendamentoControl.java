import java.time.LocalDate;
import javafx.collections.FXCollections;
import javafx.beans.property.StringProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.ObservableList;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class AgendamentoControl {
    private ObservableList<Agendamento> lista = FXCollections.ObservableArrayList();
    private IntegerProperty id = new SimpleIntegerProperty();
    private StringProperty tipoExame = new SimpleStringProperty("");
    private ObjectProperty<LocalDate> dataCriacao = new SimpleObjectProperty<>(LocalDate.now());
    private StringProperty status = new SimpleStringProperty("");
    private StringProperty medicoResponsavel = new SimpleStringProperty("");
    private StringProperty unidadeExame = new SimpleStringProperty("");
    private StringProperty observacoes = new SimpleStringProperty("");
    private StringProperty formaPagamento = new SimpleStringProperty("");

    private int contador = 0;

    public void entidadeParaTela(Agendamento a){
        this.tipoExame.set(a.getTipoExame());
        this.dataCriacao.set(a.getDataCriacao());
        this.status.set(a.getStatus());
        this.medicoResponsavel.set(a.getMedicoResponsavel());
        this.unidadeExame.set(a.getUnidadeExame());
        this.observacoes.set(a.getObservacoes());
        this.formaPagamento.set(a.getFormaPagamento());
    }

    public void excluir( Agendamento a) { 
        System.out.println("Excluido contato com nome: " + p.getNome());
        lista.remove( a );
    }

    public void gravar() { 
        if (id.get() == 0) { 
            Agendamento a = new Agendamento();
            contador += 1;
            a.setId(contador);
            a.setTipoExame( this.tipoExame.get() );
            a.setDataCriacao( this.dataCriacao.get() );
            a.setStatus(this.status.get() );
            a.setMedicoResponsavel(this.medicoResponsavel.get() );
            a.setUnidadeExame( this.unidadeExame.get() );
            a.setObservacoes( this.observacoes.get() );
            a.setFormaPagamento( this.formaPagamento.get() );
            lista.add( a );
        } else { 
            for (Agendamento a : lista) { 
                if (a.getId() == this.id.get()) { 
                    a.setId(contador);
                    a.setTipoExame( this.tipoExame.get() );
                    a.setDataCriacao( this.dataCriacao.get() );
                    a.setStatus(this.status.get() );
                    a.setMedicoResponsavel(this.medicoResponsavel.get() );
                    a.setUnidadeExame( this.unidadeExame.get() );
                    a.setObservacoes( this.observacoes.get() );
                    a.setFormaPagamento( this.formaPagamento.get() );
                }
            }
        }
        limparTudo();
        System.out.println("Lista tamanho: " + lista.size());
    }

    public void limparTudo() { 
        id.set(0);
        tipoExame.set("");
        dataCriacao.set(LocalDate.now());
        status.set("");
        medicoResponsavel.set("");
        unidadeExame.set("");
        observacoes.set("");
        formaPagamento.set("");
    }

    public void pesquisarPorNome() { 
        for (Agendamento a : lista) { 
            if (a.getUnidadeExame().contains( unidadeExame.get() )) { 
                tipoExame.set( a.getNome() );
                dataCriacao.set( a.getCadastro() );
                status.set( a.getSexo() );
                medicoResponsavel.set( a.getEndereco() );
                unidadeExame.set( a.getTelefone() );
                observacoes.set( a.getEmail() );
                formaPagamento.set( a.getTelefone() );
            }
        } 
    }

    public ObservableList<Agendamento> getLista(){
        return this.lista;
    }

    public IntegerProperty idProperty(){
        return this.id;
    }

    public StringProperty tipoExameProperty(){
        return this.tipoExame;
    }

    public ObjectProperty<LocalDate> dataCriacaoProperty(){
        return this.dataCriacao;
    }

    public StringProperty statusProperty(){
        return this.status;
    }

    public StringProperty medicoResponsavelProperty(){
        return this.medicoResponsavel;
    }

    public StringProperty unidadeExameProperty(){
        return this.unidadeExame;
    }

    public StringProperty observacoesProperty(){
        return this.observacoes;
    }

    public StringProperty formaPagamentoProperty(){
        return this.formaPagamento;
    }
}

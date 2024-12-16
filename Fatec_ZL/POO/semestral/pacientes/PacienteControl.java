package pacientes;
import java.time.LocalDate;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.property.IntegerProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class PacienteControl {

    private ObservableList<Paciente> lista = FXCollections.observableArrayList();
    private StringProperty nome = new SimpleStringProperty("");
    private ObjectProperty<LocalDate> cadastro = new SimpleObjectProperty<>(LocalDate.now());
    private StringProperty sexo = new SimpleStringProperty("");
    private StringProperty endereco = new SimpleStringProperty("");
    private StringProperty telefone = new SimpleStringProperty("");
    private StringProperty email = new SimpleStringProperty("");
    private StringProperty cartaoSus = new SimpleStringProperty("");
    private IntegerProperty id = new SimpleIntegerProperty(0);

    private int contador = 0;

    private PacienteDAO pacienteDAO;

    public PacienteControl() throws PacienteException {
        pacienteDAO = new PacienteDAOImpl();
    }

    public void entidadeParaTela(Paciente p) { 
        this.id.set( p.getId() );
        this.nome.set(p.getNome());
        this.cadastro.set(p.getCadastro());
        this.sexo.set(p.getSexo());
        this.endereco.set(p.getEndereco());
        this.telefone.set(p.getTelefone());
        this.email.set(p.getEmail());
        this.cartaoSus.set(p.getCartaoSus());
    }

    public void excluir( Paciente p) { 
        System.out.println("Excluido paciente com nome: " + p.getNome());
        lista.remove( p );
        pacienteDAO.remover(p);
        pesquisarTodos();
    }

    public void gravar() { 
        if (id.get() == 0) { 
            Paciente p = new Paciente();
            contador += 1;
            p.setId(contador);
            p.setNome( this.nome.get() );
            p.setCadastro( this.cadastro.get() );
            p.setSexo(this.sexo.get() );
            p.setEndereco(this.endereco.get() );
            p.setTelefone( this.telefone.get() );
            p.setEmail( this.email.get() );
            p.setCartaoSus( this.cartaoSus.get() );
            lista.add( p );
            pacienteDAO.inserir(p);
        } else { 
            for (Paciente p : lista) { 
                if (p.getId() == this.id.get()) { 
                    p.setNome( this.nome.get() );
                    p.setCadastro( this.cadastro.get() );
                    p.setSexo(this.sexo.get() );
                    p.setEndereco(this.endereco.get() );
                    p.setTelefone( this.telefone.get() );
                    p.setEmail( this.email.get() );
                    p.setCartaoSus( this.cartaoSus.get() );
                    pacienteDAO.atualizar(p);
                }
            }
        }
        pesquisarTodos();
        limparTudo();
        System.out.println("Lista tamanho: " + lista.size());
    }

    public void limparTudo() { 
        id.set(0);
        nome.set("");
        cadastro.set(LocalDate.now());
        sexo.set("");
        endereco.set("");
        telefone.set("");
        email.set("");
        cartaoSus.set("");
    }

    public void pesquisarPorNome() { 
        for (Paciente p : lista) { 
            if (p.getNome().contains( nome.get() )) { 
                nome.set( p.getNome() );
                cadastro.set( p.getCadastro() );
                sexo.set( p.getSexo() );
                endereco.set( p.getEndereco() );
                telefone.set( p.getTelefone() );
                email.set( p.getEmail() );
                telefone.set( p.getTelefone() );
                cartaoSus.set( p.getCartaoSus() );
                break; // Sai do loop após encontrar o paciente
            }
        } 
    }

    public void pesquisarTodos() {
        lista.clear(); // Limpa a lista
        lista.addAll(pacienteDAO.buscarTodos()); // Adiciona todos os pacientes na lista
    }


    public ObservableList<Paciente> getLista() { 
        return this.lista;
    }

    public IntegerProperty idProperty() { 
        return this.id;
    }

    public StringProperty nomeProperty() { 
        return this.nome;
    }

    public ObjectProperty<LocalDate> cadastroProperty() { 
        return this.cadastro;
    }

    public StringProperty sexoProperty() { 
        return this.sexo;
    }

    public StringProperty enderecoProperty() { 
        return this.endereco;
    }

    public StringProperty telefoneProperty() { 
        return this.telefone;
    }

    public StringProperty emailProperty() { 
        return this.email;
    }

    public StringProperty cartaoSusProperty() { 
        return this.cartaoSus;
    }
    
}

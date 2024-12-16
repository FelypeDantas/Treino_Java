package pacientes;
import java.time.LocalDate;
import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.util.Callback;
import javafx.util.StringConverter;
import javafx.util.converter.IntegerStringConverter;

public class PacienteBoundary extends Application {
    private Label lblId = new Label("");
    private TextField txtNome = new TextField("");
    private DatePicker dateCadastro = new DatePicker(LocalDate.now());
    private TextField txtEndereco = new TextField("");
    private TextField txtTelefone = new TextField("");
    private TextField txtEmail = new TextField("");
    private TextField txtCartaoSus = new TextField();

    private TableView<Paciente> tableView = new TableView<>();

    private PacienteControl control = new PacienteControl();

    @Override
    public void start(Stage stage) { 

    try {
      control = new PacienteControl();
    } catch (PacienteException er) {
      alert(AlertType.ERROR, "Erro ao incializar sistema");
    }
        
        BorderPane panePrincipal = new BorderPane();

        GridPane paneForm = new GridPane();
        paneForm.add(new Label("Id: "), 0, 0);
        paneForm.add(lblId, 1, 0);
        paneForm.add(new Label("Nome: "), 0, 1);
        paneForm.add(txtNome, 1, 1);
        paneForm.add(new Label("Telefone: "), 0, 2);
        paneForm.add(txtTelefone, 1, 2);
        paneForm.add(new Label("Email: "), 0, 3);
        paneForm.add(txtEmail, 1, 3);
        paneForm.add(new Label("Nascimento: "), 0, 4);
        paneForm.add(dateCadastro, 1, 4);
        paneForm.add(new Label("Endereco: "), 0, 5);
        paneForm.add(txtEndereco, 1, 5);
        paneForm.add(new Label("Cartao: "), 0, 6);
        paneForm.add(txtCartaoSus, 1, 6);

        Button btnGravar = new Button("Gravar");
        btnGravar.setOnAction(
        e -> {
          try {
            control.gravar();
            tableView.refresh();
          } catch (PacienteException er) {
            alert(AlertType.ERROR, "Erro ao gravar");
          }
        });
        Button btnPesquisar = new Button("Pesquisar");
        btnPesquisar.setOnAction(e -> {
            try {
              control.pesquisarPorNome();
            } catch (PacienteException er) {
              alert(AlertType.ERROR, "Errro ao pesquisar");
            }
          });

        Button btnLimpar = new Button("*");
        btnLimpar.setOnAction( e -> control.limparTudo() );

        paneForm.add(btnGravar, 0, 7);
        paneForm.add(btnPesquisar, 1, 7);
        paneForm.add(btnLimpar, 2, 0);

        generateColumns();
        vincularPropriedes();

        panePrincipal.setTop( paneForm );
        panePrincipal.setCenter(tableView);

        Scene scn = new Scene( panePrincipal, 600, 400);
        stage.setScene(scn);
        stage.setTitle("Pacientes");
        stage.show();
    }

    public void generateColumns() { 
        TableColumn<Paciente, Integer> col1 = new TableColumn<>("Id");
        col1.setCellValueFactory(new PropertyValueFactory<Paciente, Integer>("id"));

        TableColumn<Paciente, String> col2 = new TableColumn<>("Nome");
        col2.setCellValueFactory(new PropertyValueFactory<Paciente, String>("nome"));

        TableColumn<Paciente, String> col3 = new TableColumn<>("Email");
        col3.setCellValueFactory(new PropertyValueFactory<Paciente, String>("email"));

        TableColumn<Paciente, String> col4 = new TableColumn<>("Telefone");
        col4.setCellValueFactory(new PropertyValueFactory<Paciente, String>("telefone"));

        TableColumn<Paciente, LocalDate> col5 = new TableColumn<>("Cadastro");
        col5.setCellValueFactory(new PropertyValueFactory<Paciente, LocalDate>("cadastro"));

        TableColumn<Paciente, LocalDate> col6 = new TableColumn<>("Endereco");
        col6.setCellValueFactory(new PropertyValueFactory<Paciente, LocalDate>("endereco"));

        TableColumn<Paciente, LocalDate> col7 = new TableColumn<>("Cartao");
        col7.setCellValueFactory(new PropertyValueFactory<Paciente, LocalDate>("cartaoSus"));

        Callback<TableColumn<Paciente, Void>, TableCell<Paciente, Void>> callback = 
        new  Callback<>() {
            @Override
            public TableCell<Paciente, Void> call(TableColumn<Paciente, Void> param) {
                TableCell<Paciente, Void> tc = new TableCell<>() { 
                    final Button btnExcluir = new Button("Apagar");
                    {
                       btnExcluir.setOnAction(
                                e -> {
                                    try{
                                        Paciente p = tableView.getItems().get(getIndex());
                                        control.excluir(p);
                                    }catch(PacienteException er){
                                        alert(AlertType.ERROR, "Erro ao excluir");
                                    }
                                });
                    }
                    public void updateItem(Void item, boolean empty) { 
                        super.updateItem(item, empty);
                        if (empty) { 
                            setGraphic( null );
                        } else { 
                            setGraphic( btnExcluir );
                        }
                    }
                };
                return tc;
            }
        };

        TableColumn<Paciente, Void> col8 = new TableColumn<>("Ações");
        col8.setCellFactory( callback );

        tableView.getColumns().addAll(col1, col2, col3, col4, col5, col6, col7, col8);
        tableView.setItems( control.getLista() );

        tableView.getSelectionModel().selectedItemProperty()
        .addListener( (obs, antigo, novo) -> { 
            System.out.println( "Selecionado o paciente ==> " + novo);
            control.entidadeParaTela( novo );
        });
    }

    public void vincularPropriedes() { 
        Bindings.bindBidirectional(lblId.textProperty(), control.idProperty(), 
                    (StringConverter) new IntegerStringConverter());
        Bindings.bindBidirectional(txtNome.textProperty(), control.nomeProperty());
        Bindings.bindBidirectional(txtEmail.textProperty(), control.emailProperty());
        Bindings.bindBidirectional(txtTelefone.textProperty(), control.telefoneProperty());
        Bindings.bindBidirectional(dateCadastro.valueProperty(), control.cadastroProperty());
        Bindings.bindBidirectional(txtEndereco.textProperty(), control.enderecoProperty());
        Bindings.bindBidirectional(txtCartaoSus.textProperty(), control.cartaoSusProperty());
    }

     public void alert(AlertType tipo, String msg) { 
        Alert alertWindow = new Alert(tipo);
        alertWindow.setHeaderText("Alerta");
        alertWindow.setContentText(msg);
        alertWindow.showAndWait();
    }

    public static void main(String[] args) {
        Application.launch(PacienteBoundary.class, args);
    }
}

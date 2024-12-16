import java.time.LocalDate;

import javax.swing.text.TableView;

public class AgendamentoBoundary extends Application{

    private Label lblId = new Label("");
    private TextField txtTipoExame = new TextField("");
    private DatePicker txtDataCriacao = new DatePicker(LocalDate.now());
    private TextField txtStatus = new TextField("");
    private TextField txtMedicoResponsavel = new TextField("");
    private TextField txtUnidadeExame = new TextField("");
    private TextField txtObservacoes = new TextField();
    private TextField txtFormaPagamento = new TextField();

    private TableView<Agendamento> tableView = new TableView<>();

    private AgendamentoControl control = new AgendamentoControl();

    @Override
    public void start(Stage stage) { 
        BorderPane panePrincipal = new BorderPane();

        GridPane paneForm = new GridPane();
        paneForm.add(new Label("Id: "), 0, 0);
        paneForm.add(lblId, 1, 0);
        paneForm.add(new Label("Tipo de Exame: "), 0, 1);
        paneForm.add(txtTipoExame, 1, 1);
        paneForm.add(new Label("Data agendamento: "), 0, 2);
        paneForm.add(txtDataCriacao, 1, 2);
        paneForm.add(new Label("Status: "), 0, 3);
        paneForm.add(txtStatus, 1, 3);
        paneForm.add(new Label("Médico: "), 0, 4);
        paneForm.add(txtMedicoResponsavel, 1, 4);
        paneForm.add(new Label("Unidade: "), 0, 5);
        paneForm.add(txtUnidadeExame, 1, 5);
        paneForm.add(new Label("Observações: "), 0, 6);
        paneForm.add(txtObservacoes, 1, 6);
        paneForm.add(new Label("Pagamento: "), 0, 7);
        paneForm.add(txtFormaPagamento, 1, 7);

        Button btnGravar = new Button("Gravar");
        btnGravar.setOnAction( e -> {
            control.gravar();
            tableView.refresh();
        });
        Button btnPesquisar = new Button("Pesquisar");
        btnPesquisar.setOnAction( e ->control.pesquisarPorNome());

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
        stage.setTitle("Agendamento de Exames");
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(AgendamentoBoundary.class, args);
    }
}

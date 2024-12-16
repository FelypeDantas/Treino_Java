import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class AlunoBoundary extends Application {
    private AlunoControl control = new AlunoControl();
    private ObservableList<Aluno> alunosList = FXCollections.observableArrayList();

    private TableView<Aluno> tableView = new TableView<>();
    private TextField nomeField = new TextField();
    private TextField idadeField = new TextField();
    private TextField idField = new TextField();

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Gerenciamento de Alunos");

        // Configuração da tabela
        TableColumn<Aluno, Integer> idColumn = new TableColumn<>("ID");
        idColumn.setCellValueFactory(cellData -> new SimpleIntegerProperty(cellData.getValue().getId()).asObject());

        TableColumn<Aluno, String> nomeColumn = new TableColumn<>("Nome");
        nomeColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNome()));

        TableColumn<Aluno, Integer> idadeColumn = new TableColumn<>("Idade");
        idadeColumn.setCellValueFactory(cellData -> new SimpleIntegerProperty(cellData.getValue().getIdade()).asObject());

        tableView.getColumns().addAll(idColumn, nomeColumn, idadeColumn);
        tableView.setItems(alunosList);

        // Layout
        VBox layout = new VBox(10);
        layout.getChildren().addAll(new Label("Nome:"), nomeField,
                                     new Label("Idade:"), idadeField,
                                     new Label("ID (para atualizar/deletar):"), idField,
                                     createButtons(),
                                     tableView);

        Scene scene = new Scene(layout, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private HBox createButtons() {
        Button criarButton = new Button("Criar");
        Button atualizarButton = new Button("Atualizar");
        Button deletarButton = new Button("Deletar");

        criarButton.setOnAction(e -> criarAluno());
        atualizarButton.setOnAction(e -> atualizarAluno());
        deletarButton.setOnAction(e -> deletarAluno());

        HBox hBox = new HBox(10);
        hBox.getChildren().addAll(criarButton, atualizarButton, deletarButton);
        return hBox;
    }

    private void criarAluno() {
        String nome = nomeField.getText();
        int idade = Integer.parseInt(idadeField.getText());
        Aluno aluno = control.criarAluno(nome, idade);
        alunosList.add(aluno);
        clearFields();
    }

    private void atualizarAluno() {
        int id = Integer.parseInt(idField.getText());
        String nome = nomeField.getText();
        int idade = Integer.parseInt(idadeField.getText());

        Aluno aluno = control.atualizarAluno(id, nome, idade);
        if (aluno != null) {
            atualizarTable();
        }
        clearFields();
    }

    private void deletarAluno() {
        int id = Integer.parseInt(idField.getText());
        if (control.deletarAluno(id)) {
            atualizarTable();
        }
        clearFields();
    }

    private void atualizarTable() {
        alunosList.clear();
        alunosList.addAll(control.listarAlunos());
    }

    private void clearFields() {
        nomeField.clear();
        idadeField.clear();
        idField.clear();
    }

    public static void main(String[] args) {
        launch(args);
    }
}


import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class CursoBoundary extends Application {
    private CursoControl control = new CursoControl();
    private ObservableList<Curso> cursosList = FXCollections.observableArrayList();

    private TextField nomeField = new TextField();
    private TextField codigoField = new TextField();
    private TextField coordenadorField = new TextField();
    private TextField quantidadeAlunosField = new TextField();
    private TextField pesquisaField = new TextField();

    private Label resultadoLabel = new Label();

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Gerenciamento de Cursos");

        VBox layout = new VBox(10);
        layout.getChildren().addAll(new Label("Nome do Curso:"), nomeField,
                                     new Label("Código do Curso:"), codigoField,
                                     new Label("Nome do Coordenador:"), coordenadorField,
                                     new Label("Quantidade de Alunos:"), quantidadeAlunosField,
                                     createButtons(),
                                     resultadoLabel);

        Scene scene = new Scene(layout, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private HBox createButtons() {
        Button gravarButton = new Button("Gravar Curso");
        Button pesquisarButton = new Button("Pesquisar Curso");

        gravarButton.setOnAction(e -> gravarCurso());
        pesquisarButton.setOnAction(e -> pesquisarCurso());

        HBox hBox = new HBox(10);
        hBox.getChildren().addAll(gravarButton, pesquisarButton, new Label("Pesquisar:"), pesquisaField);
        return hBox;
    }

    private void gravarCurso() {
        Curso curso = toEntity();
        control.gravar(curso);
        resultadoLabel.setText("Curso gravado com sucesso: " + curso.getNome());
        clearFields();
    }

    private void pesquisarCurso() {
        String parteNome = pesquisaField.getText();
        Curso curso = control.pesquisar(parteNome);
        if (curso != null) {
            fromEntity(curso);
            resultadoLabel.setText("Curso encontrado: " + curso.getNome());
        } else {
            resultadoLabel.setText("Curso não encontrado.");
        }
    }

    public Curso toEntity() {
        String nome = nomeField.getText();
        String codigo = codigoField.getText();
        String coordenador = coordenadorField.getText();
        int quantidadeAlunos = Integer.parseInt(quantidadeAlunosField.getText());

        return new Curso(0, nome, codigo, coordenador, quantidadeAlunos);
    }

    public void fromEntity(Curso curso) {
        nomeField.setText(curso.getNome());
        codigoField.setText(curso.getCodigo());
        coordenadorField.setText(curso.getCoordenador());
        quantidadeAlunosField.setText(String.valueOf(curso.getQuantidadeAlunos()));
    }

    private void clearFields() {
        nomeField.clear();
        codigoField.clear();
        coordenadorField.clear();
        quantidadeAlunosField.clear();
        pesquisaField.clear();
    }

    public static void main(String[] args) {
        launch(args);
    }
}


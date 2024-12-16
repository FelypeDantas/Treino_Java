package PrimeiraTela;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Teste extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FlowPane panel = new FlowPane();

        Button btnSalvar = new Button("Salvar");
        // btnSalvar.relocate(50.0, 200.0);
        btnSalvar.getStyleClass().add("button-salvar"); 

        Button btnPesquisa = new Button("Pesquisar");
        // btnPesquisa.relocate(150.0, 200.0);
        btnPesquisa.getStyleClass().add("button-pesquisar"); 

        Scene scn = new Scene(panel, 800, 600);
        stage.setScene(scn);
        stage.setTitle("Atividade");

        Label lblId = new Label("Id");
        // lblId.relocate(30.0, 15.0);

        TextField txtId = new TextField();
        // txtId.relocate(100, 10.0);
        txtId.setPrefSize(400.0, 10.0);

        Label nome = new Label("Nome");
        // nome.relocate(30.0, 60.0);

        TextField txtNome = new TextField();
        // txtNome.relocate(100.0, 60.0);
        txtNome.setPrefSize(400.0, 10.0);

        Label telefone = new Label("Telefone");
        // telefone.relocate(30.0, 105);

        TextField txtTelefone = new TextField();
        // txtTelefone.relocate(100.0, 105.0);

        scn.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());

        panel.getChildren().addAll(lblId, txtId, nome, txtNome, telefone, txtTelefone, btnSalvar, btnPesquisa);
       
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

}

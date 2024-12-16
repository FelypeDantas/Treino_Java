package SegundaTela;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Teste extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        GridPane panel = new GridPane();
        panel.setHgap(4);

        Button btnSalvar = new Button("Salvar");
        // btnSalvar.relocate(50.0, 200.0);
        btnSalvar.getStyleClass().add("button-salvar"); 

        Button btnPesquisa = new Button("Pesquisar");
        // btnPesquisa.relocate(150.0, 200.0);
        btnPesquisa.getStyleClass().add("button-pesquisar"); 

        Scene scn = new Scene(panel, 650, 200);
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

        panel.add(lblId, 1, 2);
        panel.add(txtId, 7, 2 );
        panel.add(nome, 1, 6);
        panel.add(txtNome, 7, 6);
        panel.add(telefone, 1, 10);
        panel.add(txtTelefone, 7, 10);
        panel.add(btnSalvar, 7, 12);
        panel.add(btnPesquisa, 1, 12);
       
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

}
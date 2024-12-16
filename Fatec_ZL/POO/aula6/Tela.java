import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Tela extends Application {

    private TextField txtNome = new TextField();
    private TextField txtTelefone = new TextField();
    private TextField txtEmail = new TextField();

    @Override
    public void start(Stage stage){
        GridPane panel = new GridPane();

        Button btnSalvar = new Button("Salvar");
        btnSalvar.getStyleClass().add("button-salvar"); 
        btnSalvar.setId("salvar");

        Button btnPesquisa = new Button("Pesquisar");
        btnPesquisa.getStyleClass().add("button-pesquisar"); 

        Scene scn = new Scene(panel, 600, 300);
        stage.setTitle("Agenda de contatos");
        stage.setScene(scn);

        panel.add(new Label("Nome: "), 0, 0);
        panel.add(txtNome, 1, 0);
        panel.add(new Label("Telefone: "), 0, 3);
        panel.add(txtTelefone, 1, 3);
        panel.add(new Label("E-email: "), 0, 6);
        panel.add(txtEmail, 1, 6);
        panel.add(btnPesquisa, 0, 10);
        panel.add(btnSalvar, 1, 10);
       
        stage.show();

        
    }

    public Contato boundaryToEntity() {
        Contato c = new Contato();
        c.setNome(txtNome.getText());
        c.setTelefone(txtTelefone.getText());
        c.setEmail(txtEmail.getText());
        return c;
    }

    public void entityToBoundary(Contato c){
        txtNome.setText(c.getNome());
        txtTelefone.setText(c.getTelefone());
        txtEmail.setText(c.getEmail());
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}

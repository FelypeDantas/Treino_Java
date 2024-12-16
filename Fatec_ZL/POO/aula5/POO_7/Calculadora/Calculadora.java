import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Calculadora extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Calculadora");

        TextField display = new TextField();
        display.setEditable(false);
        display.setPrefHeight(50);
        display.setStyle("-fx-font-size: 24;");

        Button[] buttons = {
            new Button("7"), new Button("8"), new Button("9"), new Button("/"),
            new Button("4"), new Button("5"), new Button("6"), new Button("*"),
            new Button("1"), new Button("2"), new Button("3"), new Button("-"),
            new Button("0"), new Button("."), new Button("="), new Button("+")
        };

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10));
        grid.setHgap(10);
        grid.setVgap(10);

        grid.add(display, 0, 0, 4, 1);

        int index = 0;
        for (int row = 1; row <= 4; row++) {
            for (int col = 0; col < 4; col++) {
                grid.add(buttons[index], col, row);
                index++;
            }
        }

        Scene scene = new Scene(grid, 300, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

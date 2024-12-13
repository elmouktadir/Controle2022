package ma.ensa.javaproject.controlejava;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class NewMembre extends Application {
    private static Stage stageChange;
    @Override
    public void start(Stage stage) throws IOException {
        stage.setResizable(false);
        FXMLLoader fxmlLoader = new FXMLLoader(NewMembre.class.getResource("NewMembre.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Formulaire Des Membres");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
            launch();
    }
}

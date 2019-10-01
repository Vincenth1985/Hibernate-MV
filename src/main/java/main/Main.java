package main;

import connection.EntityManagerFactoryProvider;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.nio.file.Paths;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent parent = FXMLLoader.load(Paths.get("src/main/resources/Fxml/mvhibernate.fxml").toUri().toURL());
        stage.setScene(new Scene(parent, 600, 400));
        stage.setTitle("Manu & Vincent");
        stage.show();
    }


    public static void main(String[] args) {
        EntityManagerFactoryProvider.getEM();
        launch();



    }
}

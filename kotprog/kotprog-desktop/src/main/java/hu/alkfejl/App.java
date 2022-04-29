package hu.alkfejl;

import hu.alkfejl.dao.StudentDAO;
import hu.alkfejl.dao.StudentDAOImpl;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        StudentDAO dao = new StudentDAOImpl();
        dao.findAll().forEach(System.out::println);

        var label = new Label("Hello, JavaFX ");
        var scene = new Scene(new StackPane(label), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
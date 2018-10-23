package sample;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        LoginForm scene = new LoginForm(primaryStage);
        primaryStage.setScene(scene.NewScene());
        primaryStage.setTitle("JavaFX Tutorial");
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

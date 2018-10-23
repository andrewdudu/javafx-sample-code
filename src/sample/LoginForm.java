package sample;

import java.util.Objects;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LoginForm {
    protected String myUsername = "andrew";
    protected String password = "123123";
    protected Stage stage;


    public LoginForm(Stage mainStage) {
        this.stage = mainStage;
    }

    public Scene NewScene() {
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Scene scene = new Scene(grid, 500, 275);

        Text sceneTitle = new Text("Welcome");
        sceneTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(sceneTitle, 0, 0, 2, 1);

        Label userName = new Label("Username : ");
        grid.add(userName, 0, 1);

        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);

        Label pw = new Label("Password : ");
        grid.add(pw, 0, 2);

        PasswordField pwBox = new PasswordField();
        grid.add(pwBox, 1, 2);

        Button loginBtn = new Button("Login");
        grid.add(loginBtn, 1, 3);

        final Text actionTarget = new Text();
        grid.add(actionTarget, 1, 6);

        loginBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                actionTarget.setFill(Color.FIREBRICK);
                if (Objects.equals(myUsername, userTextField.getText()) && Objects.equals(password, pwBox.getText())) {
                    TableViewTest table = new TableViewTest(stage);
                    stage.setScene(table.TableScene());
                }
                actionTarget.setText("Username : " + userTextField.getText() + "\nPassword : " + pwBox.getText());
            }
        });

        return scene;
    }
}

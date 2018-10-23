package sample;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TableForm {

    private Stage stage;

    public TableForm(Stage mainStage) {
        this.stage = mainStage;
    }

    public Scene TableFormScene(ObservableList<Person> tableData) {
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.TOP_RIGHT);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Scene scene = new Scene(grid, 500, 275);

        Text sceneTitle = new Text("Add new Record");
        sceneTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(sceneTitle, 0, 0, 2, 1);

        Label firstNameLbl = new Label("First Name : ");
        grid.add(firstNameLbl, 0, 1);

        TextField firstNameField = new TextField();
        grid.add(firstNameField, 1, 1);

        Label lastNameLbl = new Label("Last Name : ");
        grid.add(lastNameLbl, 0, 2);

        TextField lastNameField = new TextField();
        grid.add(lastNameField, 1, 2);

        Label emailLbl = new Label("Email : ");
        grid.add(emailLbl, 0, 3);

        TextField emailField = new TextField();
        grid.add(emailField, 1, 3);

        Button submitBtn = new Button("Submit");
        grid.add(submitBtn, 1, 4);

        submitBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                tableData.add(new Person(firstNameField.getText(), lastNameField.getText(), emailField.getText()));
                System.out.println(TableViewTest.data);
                TableViewTest tableViewTest = new TableViewTest(stage);
                stage.setScene(tableViewTest.TableScene());
            }
        });

        return scene;
    }
}

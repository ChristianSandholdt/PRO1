package Exercise03;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class EX03TwoWindows extends Application {
    @Override
    public void start(Stage stage) {
        stage.setTitle("Gui Demo input window");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();

        personWindow = new PersonInputWindow("Create a person", stage);

    }

    private PersonInputWindow personWindow;
    public final ListView<Person> lvwNames = new ListView<>();
    public final ArrayList<Person> persons = new ArrayList<>();



    private void initContent(GridPane pane) {
        pane.setGridLinesVisible(false);
        pane.setPadding(new Insets(20));
        pane.setHgap(10);
        pane.setVgap(10);

        Label lblName = new Label("Persons:");
        pane.add(lblName, 0, 0);

        pane.add(lvwNames, 0, 1);
        lvwNames.setEditable(false);
        lvwNames.setPrefHeight(180);
        lvwNames.getItems().setAll(persons);

        Button btnCreatePerson = new Button("Create Person");
        pane.add(btnCreatePerson, 1,1);
        GridPane.setMargin(btnCreatePerson, new Insets(10, 10, 0, 10));
        btnCreatePerson.setOnAction(event -> this.createPersonAction());

    }


    Person Jane = new Person("Jane", "Smed", true);


    public void createPersonAction(){
        personWindow.showAndWait();


        if (personWindow.getActualPerson() != null){
            persons.add(personWindow.getActualPerson());
            lvwNames.getItems().setAll(persons);
        }

    }

}

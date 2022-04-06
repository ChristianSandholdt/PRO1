package Exercise05.Exercise052;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Gui extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("Boys and girls");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    // -------------------------------------------------------------------------

    private final ListView<String> lvwNames = new ListView<>();
    private final ArrayList<String> boyNames = new ArrayList<>();
    private final ArrayList<String> girlNames = new ArrayList<>();
    private final TextField txfName = new TextField();
    private final RadioButton rb1 = new RadioButton("Boy");
    private final RadioButton rb2 = new RadioButton("Girl");
    private final ToggleGroup group = new ToggleGroup();

    private void initContent(GridPane pane) {
        pane.setGridLinesVisible(false);
        pane.setPadding(new Insets(20));
        pane.setHgap(10);
        pane.setVgap(10);

        Label lblName = new Label("Name:");
        pane.add(lblName, 0, 7);

        Label lblNames = new Label("Names:");
        pane.add(lblNames, 0, 1);

        pane.add(txfName, 1, 7, 2, 1);
        pane.add(lvwNames, 1, 1, 1, 5);
        lvwNames.setPrefWidth(200);
        lvwNames.setPrefHeight(200);

        HBox rbs = new HBox(10, rb1, rb2);
        rb1.setToggleGroup(group);
        rb1.setSelected(true);
        rb2.setToggleGroup(group);
        pane.add(rbs,1,0);

        // Boy names
        boyNames.add("Bent");
        boyNames.add("Martin");
        boyNames.add("Jan");
        boyNames.add("Bent");
        boyNames.add("Niels");
        boyNames.add("Thor");
        boyNames.add("Peter");
        boyNames.add("Finn");
        boyNames.add("Thomas");
        boyNames.add("Jan");
        
        // Girl names
        girlNames.add("Bente");
        girlNames.add("Louise");
        girlNames.add("Pernille");
        girlNames.add("Signe");
        girlNames.add("Amanda");
        girlNames.add("Camilla");
        girlNames.add("Susanne");
        girlNames.add("Bente");
        girlNames.add("Laura");
        girlNames.add("Cecilie");

        lvwNames.getItems().setAll(boyNames);

        ChangeListener<String> listener = (ov, o, n) -> this.selectionChanged();
        lvwNames.getSelectionModel().selectedItemProperty().addListener(listener);
        lvwNames.getSelectionModel().clearSelection();

        Button btnAdd = new Button("Add");
        pane.add(btnAdd, 6, 7);

        btnAdd.setOnAction(event -> this.addAction());
        rb1.setOnAction(event -> this.boyList());
        rb2.setOnAction(event -> this.girlList());
    }

    private void addAction() {
        String name = txfName.getText().trim();
        if (name.length() > 0) {
            if(rb1.isSelected()) {
                boyNames.add(name);
                lvwNames.getItems().setAll(boyNames);
            }
            else {
                girlNames.add(name);
                lvwNames.getItems().setAll(girlNames);
            }
        }
    }

    private void boyList() {
        lvwNames.getItems().setAll(boyNames);
    }
    private void girlList() {
        lvwNames.getItems().setAll(girlNames);
    }
    private void selectionChanged() {
        String selected = lvwNames.getSelectionModel().getSelectedItem();
        txfName.setText(selected);
    }
}
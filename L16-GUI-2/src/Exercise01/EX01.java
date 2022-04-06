package Exercise01;

import java.awt.*;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import org.w3c.dom.Text;

public class EX01 extends Application
{

    public void start(Stage stage)
    {
        stage.setTitle("Exercise01");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    private final TextField txfName = new TextField();
    private final TextField txfTitle = new TextField();
    private final ListView<Person> lvwNames = new ListView<>();
    private final ArrayList<Person> persons = new ArrayList<>();
    CheckBox cbx = new CheckBox("Senior");



    private void initContent(GridPane pane)
    {
        // show or hide grid lines
        pane.setGridLinesVisible(false);
        // set padding of the pane
        pane.setPadding(new Insets(20));
        // set horizontal gap between components
        pane.setHgap(10);
        // set vertical gap between components
        pane.setVgap(10);


        //Label name
        Label lblName = new Label("Name:");
        pane.add(lblName,0,0);

        //Label title
        Label lblTitle = new Label("Title: ");
        pane.add(lblTitle,0,1);

        //Textfield name
        pane.add(txfName,1,0);

        //Textfield title
        pane.add(txfTitle,1,1);

        //CheckBox Senior
        pane.add(cbx,1,2);

        //Label Persons
        Label lblPerson = new Label("Persons: ");
        pane.add(lblPerson,0,3);

        //Listview of persons
        pane.add(lvwNames,1,3);

        //Button add
        Button btnAdd = new Button("Add");
        pane.add(btnAdd,2,2);

        ChangeListener<Person> listener = (ov, o, n) -> this.selectionChanged();
        lvwNames.getSelectionModel().selectedItemProperty().addListener(listener);

        btnAdd.setOnAction(event-> addPerson());
    }

    private void selectionChanged() {
        Person selected = lvwNames.getSelectionModel().getSelectedItem();
        txfName.setText(selected.toString());
    }
    public void addPerson(){
        String name = txfName.getText().trim();
        String title = txfTitle.getText().trim();
        boolean senior = cbx.isSelected();

        if (name.length() > 0 && title.length() > 0){
            Person p = new Person(name, title, senior);
            persons.add(p);
            lvwNames.getItems().setAll(persons);
        } else if (name.length() == 0 && title.length() > 0){
        Alert alertNavn = new Alert(Alert.AlertType.ERROR);
        alertNavn.setTitle("Fejl i udfyldelsen");
        alertNavn.setHeaderText("Mangler navn");
        alertNavn.show();
        } else {
            Alert alertTitle = new Alert(Alert.AlertType.ERROR);
            alertTitle.setTitle("Fejl i udfyldelsen");
            alertTitle.setHeaderText("Mangler title");
            alertTitle.show();
        }
    }


}

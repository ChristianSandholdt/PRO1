package Exercise03;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.util.ArrayList;

public class PersonInputWindow extends Stage{

    //lav constructor
    public PersonInputWindow(String title, Stage owner){
        this.initOwner(owner);
        this.initStyle(StageStyle.UTILITY);
        this.initModality(Modality.APPLICATION_MODAL);
        this.setMinHeight(100);
        this.setMinWidth(200);
        this.setResizable(false);

        this.setTitle(title);
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        this.setScene(scene);
    }
    // -------------------------------------------------------------------------------------
    private final TextField txfName = new TextField();
    private final TextField txfTitle = new TextField();
    private final CheckBox senior = new CheckBox("Senior");
    final ArrayList<Person> persons = new ArrayList<>();

    private Person actualPerson = null;


    private void initContent(GridPane pane) {
//        pane.setGridLinesVisible(true);
        pane.setPadding(new Insets(20));
        pane.setHgap(10);
        pane.setVgap(10);

        Label lblTitle = new Label("Title:");
        pane.add(lblTitle, 0, 1);

        Label lblName = new Label("Name:");
        pane.add(lblName, 0, 0);

        pane.add(txfTitle, 1, 1);

        pane.add(txfName, 1, 0);

        pane.add(senior,1,2);

        HBox buttonBox = new HBox(20);
        pane.add(buttonBox, 0, 3, 2, 1);
        buttonBox.setPadding(new Insets(10, 10, 0, 10));
        buttonBox.setAlignment(Pos.CENTER);

        Button btnCancel = new Button("Cancel");
        buttonBox.getChildren().add(btnCancel);
        btnCancel.setOnAction(event -> this.cancelAction());

        Button btnOK = new Button("OK");
        buttonBox.getChildren().add(btnOK);
        btnOK.setOnAction(event -> this.okAction());
    }
    private void cancelAction() {
        txfTitle.clear();
        txfTitle.requestFocus();
        txfName.clear();
        senior.setSelected(false);
        actualPerson = null;
        PersonInputWindow.this.hide();
    }
    private void okAction() {
        String name = txfName.getText().trim();
        String title = txfTitle.getText().trim();
        boolean Senior = senior.isSelected();


        if (name.length() > 0 && title.length() > 0){
            actualPerson = new Person(name, title, Senior);
            txfName.clear();
            txfTitle.clear();
            txfName.requestFocus();
            senior.setSelected(false);
            PersonInputWindow.this.hide();
            Person p = new Person(name,title,Senior);
            persons.add(p);
            System.out.println(p);
        } else {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setHeaderText("Error, insert values");
            alert.setContentText("Error");
            alert.show();
        }
    }


    public Person getActualPerson(){
        return actualPerson;
    }
    public void clearActualPerson(){
        actualPerson = null;
    }
}
